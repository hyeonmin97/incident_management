package com.example.demo.Jpatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		// Controller 어노테이션을 통해 Controller역할 수행
public class MainController {
	@GetMapping("/main")
	public String m() {
		return "/main";
	}
}
