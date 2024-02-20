package com.feb.test.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.feb.test.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	public LoginController() {
		System.out.println("test 1111111111");
	}
	
	@GetMapping("login.do")
	public String login() {
		System.out.println("login callllllllllllll");
		
		return "login";
	}
	
	@PostMapping("login.do")
	public String loginPage(@RequestParam HashMap<String, String> params) {
		boolean result = loginService.login(params);
		System.out.println("result ~~~~~~~~~~~~~~~~		" + result);
		
		return "index";
	}
	
	@GetMapping("index.do")
	public String index() {
		System.out.println("로그인 성공 ");
		return "index";
		
	}
}
