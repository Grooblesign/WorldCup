package uk.me.paulgarner.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/")
	public String Index(Model model) {
		model.addAttribute("datetime", new Date().toString());
		model.addAttribute("databaseurl", System.getenv("DATABASE_URL"));

		return "index";
	}

	@RequestMapping(value="/greeting")
	public String SayHello(Model model) {
		model.addAttribute("greeting", "Hello World");
		model.addAttribute("datetime", new Date().toString());
		
		return "hello";
	}
}
