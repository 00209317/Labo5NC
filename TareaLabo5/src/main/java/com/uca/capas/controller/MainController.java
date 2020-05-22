package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;
import com.uca.capas.service.EstudianteService;


@Controller
public class MainController {

	/*@Autowired
	private EstudianteDAO estudianteDao;*/
	@Autowired
	private EstudianteService estudianteService;
	
	@RequestMapping("/inicio")
	public ModelAndView inicio() {
		Estudiante estudiante = new Estudiante();
		ModelAndView mav = new ModelAndView();
		mav.addObject("estudiante", estudiante);
		mav.setViewName("index");
		return mav;
		
	}
	
	
	@RequestMapping("/guardarEstudiante")
	public ModelAndView guardarE(@Valid @ModelAttribute Estudiante estudiante, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		//mav.addObject("estudiante", estudiante);
		//mav.setViewName("index");
		//--------------------------------------
		if(result.hasErrors()) {
			mav.setViewName("index");
			System.out.println("entre aqui por error");
			System.out.println(result.getErrorCount());
			System.out.println(result.getAllErrors());
			
		}
		else {
			estudianteService.save(estudiante);
			mav.setViewName("index");
			System.out.println("entre aqui porque hice todo bien");
		}
		return mav;
	}
	
	
	@RequestMapping("/listado")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		try {
			estudiantes = estudianteService.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("estudiantes", estudiantes);
		mav.setViewName("listado");
		
		
		return mav;
	}
	
	@RequestMapping(value = "/borrarEstudiante", method = RequestMethod.POST)
	public ModelAndView delete(@RequestParam(value="codigo") int id) {
		ModelAndView mav = new ModelAndView();
		List<Estudiante> estudiantes = null;
		try {
			estudianteService.delete(id);
			estudiantes = estudianteService.findAll();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		mav.addObject("estudiantes", estudiantes);
		mav.setViewName("listado");
		return mav;
	}
	
	
}
