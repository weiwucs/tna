package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.User;
import com.oracle.tna.service.personalinfoservice;

@Controller
public class personalinfocontroller {

	private personalinfoservice perinfos = personalinfoservice.getPerinfos();
	@RequestMapping("personalinfo.do")
	public String updateInfo(Model model,HttpSession session,String username,String password,String name,String idnumber,String telno,int admintype){
		
		Map<String,String> errors = new HashMap<String,String>();
		
		System.out.println("username:"+username+" password:"+password);
		
		if(username == null || username.length() == 0){
			errors.put("username", "The username cann't be empty.");
		}
		if(password == null || password.length() == 0){
			errors.put("password", "The password cann't be empty.");
		}
		
		if(!errors.isEmpty()){
			model.addAttribute("errors",errors);
			System.out.println("errors.");
			return "personalInfo";
		}
		
		User user = new User(-1,username,password,name,idnumber,telno,admintype);
		System.out.println(user);
		perinfos.updateUser(user);
		session.setAttribute("user", user);
		return "index";
	}
}
