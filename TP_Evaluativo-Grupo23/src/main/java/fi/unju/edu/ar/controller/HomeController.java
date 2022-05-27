package fi.unju.edu.ar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class HomeController {
	
	@GetMapping("/inicio")
	public String getInicioPage(Model model) 
	{
		return "index";
	}
	

}
