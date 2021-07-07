package com.example.demo.Jpatest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Jpatest.security.dto.UserInfoDto;
import com.example.demo.Jpatest.security.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Controller
public class LoginController {
	private final UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}
	
	@GetMapping(path = "/login")
	public String exLogin() {
		return "/login";
	}
	
	
	@GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("member",new UserInfoDto());

        return "/signup";
    }
	
    @PostMapping("/signup")
    public String signUp(UserInfoDto memberDto) {
        userService.save(memberDto);

        return "redirect:/";
    }
}
