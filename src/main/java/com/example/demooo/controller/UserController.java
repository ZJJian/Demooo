package com.example.demooo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

	@RequestMapping("/MyFirstPage")
	public String greeting(@RequestParam(value="title", required=false, defaultValue="Hello") String title, Model model) {
	    model.addAttribute("name", title);
	    return "index";
	}
}