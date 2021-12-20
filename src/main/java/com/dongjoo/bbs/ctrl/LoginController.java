package com.dongjoo.bbs.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	
	
	@GetMapping("/loginForm.do")
	public String loginForm() {
		return "login/loginForm";
	}
	
	@PostMapping("/login.do")
	public String login( String userId, HttpSession session) {
		//System.out.println("아이디는"+userId);
		session.setAttribute("userId", userId);
		return "mymain";
	}
	
	
}
