package com.bytecode.starcms.Controller.mvc.Administrator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Admin/Grupo")
public class GrupoController {
	@GetMapping()
	public ModelAndView Home() 
	{
		return new ModelAndView ("Administrator/Grupo");
	}
	
	
}
