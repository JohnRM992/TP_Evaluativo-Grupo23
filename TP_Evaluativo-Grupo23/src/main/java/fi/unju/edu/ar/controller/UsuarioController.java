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

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import fi.unju.edu.ar.model.Usuario;
import fi.unju.edu.ar.service.IUsuarioService;
import fi.unju.edu.ar.util.ListaUsuarios;

@Controller

public class UsuarioController {
	
	@Autowired
//	@Qualifier("ICandidatoServiceImp")
	private IUsuarioService usuarioService;
	
	private static final Log LOGGER = LogFactory.getLog(CandidatoController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoCandidatoPage(Model model) {
		
				model.addAttribute("usuario", usuarioService.getUsuarios());
						
						return "nuevo_usuario";
	}
	
	@PostMapping("/guardar")
	public ModelAndView getListaUsuariosPage(@Validated @ModelAttribute("usuario")Usuario usuario,
			BindingResult bindingResult) {
	
//		el objeto bindingResult contiene el resultado de la validación,los errores 

		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("nuevo_usuario");
			mav.addObject("candidato", usuario);
			return mav;
		}
		ModelAndView mav = new ModelAndView("redirect:/inicio");
		
		//Se agrega objeto usuario a la lista
		if(usuarioService.guardarUsuario(usuario)) {
			LOGGER.info("Se agregó un objeto al array de los candidatos");
		}
		return mav;
	}
	
	@GetMapping("/listaUsuarios")
	public ModelAndView getListaCandidatosPage() {
		ModelAndView mav = new ModelAndView("lista_usuarios");
		mav.addObject("usuarios",usuarioService.getListaUsuarios().getUsuarios());
		return mav;
	}
	

	


}
