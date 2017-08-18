package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.Item;
import com.oracle.tna.domain.User;
import com.oracle.tna.service.questionsservice;

@Controller
public class questionscontroller {

	private questionsservice exs = questionsservice.getQues();
	@RequestMapping("questions.do")
	public String toQuestions(Model model,HttpSession session){
		
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		List<Item> items = exs.getQuestions();
		model.addAttribute("items", items);
		session.setAttribute("items",items);
		System.out.println(items);
		return "questions";
	}
	
	@RequestMapping("insertquestion.do")
	public String toInsertQuestion(Model model,String question,String option_a,String option_b,String option_c,String option_d,String answer){
		Map<String,String> errors = new HashMap<String, String>();
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		if(question == null || question.length()==0){
			errors.put("question", "The question cann't be empty.");
		}
		
		if(answer == null || answer.length()==0){
			errors.put("answer", "The answer cann't be empty.");
		}
		
		Item item = new Item(question,option_a,option_b,option_c,option_d,answer);
		exs.insertQuestion(item);
		
		System.out.println(item);
		return "questions";
	}
	
	@RequestMapping("deletequestion.do")
	public String toDeleteQuestions(Model model, int qid){
		
		System.out.println("come here.come here.");
		System.out.println(qid);
		exs.deleteQuestion(qid);
		
		return "questions";
	}
	
	@RequestMapping("editquestion.do")
	public String toEditQuestion(Model model,int qid){
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		System.out.println(qid);
		
		Item item = exs.getQuestion(qid);
		System.out.println(item);
		
		model.addAttribute("item", item);
		return "editquestion";
	}
	
	@RequestMapping("updatequestion.do")
	public String toUpdateQuestion(Model model,int qid,String question,String option_a,String option_b,String option_c,String option_d,String answer){
		Map<String,String> errors = new HashMap<String, String>();
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		
		if(question == null || question.length()==0){
			errors.put("question", "The question cann't be empty.");
		}
		
		if(answer == null || answer.length()==0){
			errors.put("answer", "The answer cann't be empty.");
		}
		
		Item item = new Item(qid,question,option_a,option_b,option_c,option_d,answer);
		exs.updateQuestion(item);
		
		System.out.println(item);
		return "questions";
	}
	
	@RequestMapping("toupdatequestion.do")
	public String toToUpdateQuestion(Model model,int qid){
		System.out.println("come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");
		System.out.println(qid);
		
		Item item = exs.getQuestion(qid);
		System.out.println(item);
		
		model.addAttribute("item", item);
		return "updatequestion";
	}
	
}
