package com.ktds.index.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	/**
	 *  @RequestMapping("/")의 의미
	 * http://localhost:8080/
	 * 
	 * @return
	 * */
	@RequestMapping("/")
	public String viewIndexPage() {
		return "index";
	}
}
