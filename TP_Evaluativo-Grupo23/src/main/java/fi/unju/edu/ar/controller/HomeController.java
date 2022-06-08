package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@GetMapping("/inicio")
	public String getInicioPage(Model model) 
	{
		return "index";
	}
	
	@GetMapping("/listaVotacion")
	public String getVotacion(Model model) {
		
		return "votacion";
	}
	
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
