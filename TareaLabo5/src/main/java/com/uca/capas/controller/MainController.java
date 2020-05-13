package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;


@Controller
public class MainController {

	@Autowired
	private EstudianteDAO estudianteDao;
	
	/*@RequestMapping("/inicio")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/guardar")
	public ModelAndView guardarCliente(@ModelAttribute Estudiante e) {
		ModelAndView mav = new ModelAndView();
		//Mando a llamar al servicio encargado de guardar a la entidad
		estudianteDao.save(e);
		mav.setViewName("index");
		mav.addObject("resultado", 1);
		return mav;
	}*/
	
	@RequestMapping("/estudiante")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		try {
			estudiantes = estudianteDao.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("estudiantes", estudiantes);
		mav.setViewName("index");
		
		
		return mav;
	}
	
	
}
