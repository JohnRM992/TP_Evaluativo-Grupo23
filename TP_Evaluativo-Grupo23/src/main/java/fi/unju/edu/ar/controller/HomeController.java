package fi.unju.edu.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fi.unju.edu.ar.model.Candidato;
import fi.unju.edu.ar.service.ICandidatoService;



@Controller
public class HomeController {
	
	@Autowired
//	@Qualifier("ICandidatoServiceImp")
	private ICandidatoService candidatoService;
	
	@GetMapping("/inicio")
	public String getInicioPage(Model model) 
	{
		return "index";
	}
	
	@GetMapping("/listaVotacion")
	public ModelAndView getListaVotacionPage() {
		ModelAndView mav = new ModelAndView("votacion");
		mav.addObject("candidatoss",candidatoService.getListaCandidatos().getCandidatos());
		return mav;
	}
	
//	@GetMapping("/listaVotacion")
//	public String getVotacion(Model model) {
//		
//		return "votacion";
//	}
	
	@GetMapping("/registro")
	public String getRegistroPage(Model model) 
	{
		return "registro";
	}
	
	
	@GetMapping("/estado_usuarios")
	public String getEstadoUsuarioPage(Model model) 
	{
		return "estado_usuario";
	}
	

	
	
	
}
