package com.bytecode.starcms.Controller.mvc.Administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bytecode.starcms.Models.Categoria;
import com.bytecode.starcms.Repository.CategoriaRepository;

@Controller
@RequestMapping("/Admin/Categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository _categoriaRepository;

	@GetMapping
	public ModelAndView Home(@RequestParam(defaultValue = "all",required = false) String viewName) {

		ModelAndView modelAndView = new ModelAndView("Administrator/Categoria");
 
		switch (viewName) {
		case "all":
			
			break;
			
       case "new":
    	   modelAndView.addObject("categoria", new Categoria());
			break;
        case "update":
        	break;
		}
		return modelAndView;

	}

	@PostMapping
	public String newAndUpdate(@ModelAttribute Categoria categoria) {

        _categoriaRepository.Save(categoria);
		return "redirect:/Admin/Categoria";
	}

}
