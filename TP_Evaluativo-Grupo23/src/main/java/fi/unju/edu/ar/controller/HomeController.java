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
	
	@GetMapping("/registro")
	public String getRegistroPage(Model model) 
	{
		return "registro";
	}
	
	@GetMapping("/votacion")
	public String getVotacionsPage(Model model) 
	{
		return "votacion";
	}
	
	
	
	
}
