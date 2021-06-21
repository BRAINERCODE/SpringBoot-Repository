package com.bytecode.starcms.Controller.mvc.Administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bytecode.starcms.Models.Comentario;
import com.bytecode.starcms.Repository.ComentarioRepository;

@Controller
@RequestMapping("Admin/Comentario")
public class ComentarioController {
	
	@Autowired
	private ComentarioRepository _comentarioRepository;

	@GetMapping
	public ModelAndView Home(@RequestParam(defaultValue = "all", required = false) String viewName,
			@RequestParam(defaultValue = "0", required = false) int id) {

		ModelAndView modelAndView = new ModelAndView("Administrator/Comentario");

		switch (viewName) {
		case "all":
			modelAndView.addObject("comentario", _comentarioRepository.findAll());

			break;
		case "new":
			modelAndView.addObject("comentario", new Comentario());

			break;
		case "update":
			modelAndView.addObject("comentario" , _comentarioRepository.findById(id));
			break;

		default:
			break;
		}
		return modelAndView;
	}
	
	@PostMapping
	public String NewAndUpdate (@ModelAttribute Comentario comentario) 
	{
		if (comentario.getIdComentario()>0) {
			_comentarioRepository.Update(comentario);
		}else {
			_comentarioRepository.Save(comentario);
		}
		return "redirect:/Admin/Comentario";
	}
}
