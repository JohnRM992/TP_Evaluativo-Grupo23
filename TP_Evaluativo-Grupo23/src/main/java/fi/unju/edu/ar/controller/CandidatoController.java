package fi.unju.edu.ar.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.service.ICandidatoService;

@Controller
@RequestMapping("/candidatos")
public class CandidatoController {
	
	@Autowired
	@Qualifier("ICandidatoServiceImp")
	private ICandidatoService candidatoService;
	
	private static final Log LOGGER = LogFactory.getLog(CandidatoController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoCandidatoPage(Model model) {
		
				model.addAttribute("candidato", candidatoService.getCandidato());
						
						return "nuevo_candidato";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaCandidatosPage(@Validated @ModelAttribute("candidato")Candidato candidato,
			BindingResult bindingResult) {
	
		//el objeto bindingResult contiene el resultado de la validación,los errores 

		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("nuevo_candidato");
			mav.addObject("candidato", candidato);
			return mav;
		}
		ModelAndView mav = new ModelAndView("redirect:/alumno/listaAlumnos");
		
		//Se agrega objeto candidato a la lista
		if(candidatoService.guardarCandidato(candidato)) {
			LOGGER.info("Se agregó un objeto al array de los candidatos");
		}
		return mav;
	}
	
	@GetMapping("/listaCandidatos")
	public ModelAndView getListaCandidatosPage() {
		ModelAndView mav = new ModelAndView("lista_candidatos");
		mav.addObject("candidatos",candidatoService.getListaCandidatos().getCandidatos());
		return mav;
	}
	
	@PostMapping("/modificar")
	public ModelAndView editarDatosCandidato(@Validated @ModelAttribute("candidato") Candidato candidato, BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			LOGGER.info("Ha ocurrido un error "+candidato);
			ModelAndView mav = new ModelAndView("editar_candidato");
			mav.addObject("candidato", candidato);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/candidatos/listaCandidatos");
		candidatoService.modificarCandidato(candidato);
		return mav;
		
	}
	
	@GetMapping("/editar/{codigo}")
	public ModelAndView getEditarCandidatoPage(@PathVariable(value="codigo")int codigo) {
		ModelAndView mav = new ModelAndView("editar_candidato");
		Candidato candidato= candidatoService.buscarCandidato(codigo);
		mav.addObject("candidato", candidato);
		return mav;
		
	}

}
