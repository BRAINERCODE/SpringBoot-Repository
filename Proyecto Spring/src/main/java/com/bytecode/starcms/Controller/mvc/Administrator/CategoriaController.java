package com.bytecode.starcms.Controller.mvc.Administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public ModelAndView Home(
			@RequestParam(defaultValue = "all",required = false) String viewName,
			@RequestParam(defaultValue = "0",required = false) int id

			) {

		ModelAndView modelAndView = new ModelAndView("Administrator/Categoria");
 
		switch (viewName) {
		case "all":
			modelAndView.addObject("categoria", _categoriaRepository.findAll());
			break;
			
       case "new":
    	   modelAndView.addObject("categoria", new Categoria());

			break;
        case "update":
        	modelAndView.addObject("categoria", _categoriaRepository.findById(id));
        	break;
		}
		return modelAndView;

	}

	@PostMapping
	public String newAndUpdate(@ModelAttribute Categoria categoria) {

		 if (categoria.getIdCategoria() > 0){
	            _categoriaRepository.Update(categoria);
	        } else {
	        	_categoriaRepository.Save(categoria);
	        }
		return "redirect:/Admin/Categoria";
	}
	
	@DeleteMapping
	public String deleteById(@RequestParam int id) {
		_categoriaRepository.DeleteById(id);
		return "redirect:/Admin/Categoria";
	}

}
