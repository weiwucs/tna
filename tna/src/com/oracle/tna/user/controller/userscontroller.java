package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.Score;
import com.oracle.tna.domain.User;
import com.oracle.tna.service.scoresservice;
import com.oracle.tna.service.usersservice;
@Controller
public class userscontroller {

	private usersservice us = usersservice.getUs();
	@RequestMapping("users.do")
	public String toUsers(Model model){
		
		System.out.println("come here users.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		List<User> users = us.getUsers();
		model.addAttribute("users", users);
		System.out.println(users);
		return "users";
	}
}
