package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.User;
import com.oracle.tna.service.registerservice;

@Controller
public class registercontroller {

	private registerservice regs = registerservice.getRegs();
	
	@RequestMapping("login.do")
	public String toLogin(Model model, HttpSession session, String name, String telephone, String idnumber,
			String username, String password, String okpassword) {
		Map<String, String> errors = new HashMap<String, String>();

		if (name == null || name.length() == 0) {
			errors.put("name", "The name cann't be empty.");
		}
		if (telephone == null || telephone.length() == 0) {
			errors.put("telephone", "The telephone cann't be empty.");
		}
		if (idnumber == null || idnumber.length() == 0) {
			errors.put("idnumber", "The idnumber cann't be empty.");
		}
		if (username == null || username.length() == 0) {
			errors.put("uername", "The username cann't be empty.");
		}
		if (password == null || password.length() == 0) {
			errors.put("password", "The password cann't be empty.");
		}
		if (okpassword == null || okpassword.length() == 0) {
			errors.put("okpassword", "The okpassword cann't be empty.");
		}
//		if(!password.trim().equalsIgnoreCase(okpassword)){
//			errors.put("passwordunequal","Password isn't matched.");
//		}
		
		if (!errors.isEmpty()) {
			model.addAttribute("errors", errors);
			return "register";
		} else {
			User user = new User(username, password, name, idnumber, telephone, 0);
			regs.setUser(user);
			return "login";
		}
		
	}
}
