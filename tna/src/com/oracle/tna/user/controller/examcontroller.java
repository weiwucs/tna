package com.oracle.tna.user.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.Item;
import com.oracle.tna.domain.Score;
import com.oracle.tna.domain.User;
import com.oracle.tna.service.examservice;
import com.oracle.tna.service.scoresservice;

@Controller
public class examcontroller {

	private examservice exs = examservice.getExs();
	private scoresservice scos = scoresservice.getScos();
	@RequestMapping("exam.do")
	public String toExam(Model model,HttpSession session){
		
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		List<Item> items = exs.getItems();
		
		model.addAttribute("items", items);
		session.setAttribute("items", items);
		System.out.println(items);
		
		return "exam";
	}
	
	@RequestMapping("checkanswer.do")
	public String toCheckAnswer(Model model,HttpServletRequest request,HttpSession session){
		List<Item> items = (List<Item>) session.getAttribute("items");
		User user = (User) session.getAttribute("user");
		int score = 0;
		int uid = user.getUid();
		Timestamp data = new Timestamp(System.currentTimeMillis());
		String youranswer = "";
		String trueanswer = "";
		for(Item item:items){
			String answer = (String) request.getParameter("question"+item.getQid());
			System.out.println(answer);
			youranswer += answer;
			trueanswer += item.getAnswer().toString();
			if(item.getAnswer().toString().equals(answer)){
				score += 10;
			}
		}
		Score scor = new Score(data,score,youranswer,trueanswer,uid);
		System.out.println(scor);
		scos.insertScore(scor);
		
		return "index";
	}
}
