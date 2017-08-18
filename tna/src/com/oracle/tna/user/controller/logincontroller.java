package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.User;
import com.oracle.tna.service.loginservice;

@Controller
public class logincontroller {
	
	private loginservice logs = loginservice.getLogs();
	
	@RequestMapping("index.do")
	public String toIndex(Model model,HttpSession session,String username,String password ){
		Map<String,String> errors = new HashMap<String, String>();
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		if(username == null||username.length()==0){
			errors.put("username", "The username cann't be empty.");
		}
		if(password == null||password.length()==0){
			errors.put("password","The password cann't be empty.");
		}
		
		if(!errors.isEmpty()){
			model.addAttribute("errors", errors);
			return "login";
		}
		
		User user = logs.getUser(username);
		
		System.out.println("username:"+user.getUsername()+" password:"+user.getPassword());
		
		if(user == null){
			model.addAttribute("errors", errors);
			return "login";
		}
		
		session.setAttribute("user", user);
		if(user.getAdmintype()==0){
			return "index";
		}else{
			return "adminindex";
		}
//		model.addAttribute("message", "hello everyone!");
//		return "index";
	}

}
