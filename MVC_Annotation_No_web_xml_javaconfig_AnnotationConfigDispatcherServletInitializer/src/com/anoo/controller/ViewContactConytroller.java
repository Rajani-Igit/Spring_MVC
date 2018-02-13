package com.anoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewContactConytroller {

	@RequestMapping("/contact.htm")
	public String showpage(){
		System.out.println("inside controller");
		return "contact";
	}
}
