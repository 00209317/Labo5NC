package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uca.capas.dao.EstudianteDAO;

@Controller
public class MainController {

	@Autowired
	private EstudianteDAO estudianteDao;
	
	@RequestMapping("/inicio")
	public String index() {
		return "index";
	}
	
}
