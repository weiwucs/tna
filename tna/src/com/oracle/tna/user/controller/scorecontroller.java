package com.oracle.tna.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.tna.domain.Score;
import com.oracle.tna.service.scoresservice;

@Controller
public class scorecontroller {

	private scoresservice scos = scoresservice.getScos();

	@RequestMapping("scores.do")
	public String toScores(Model model) {

		System.out.println(
				"come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");

		List<Score> scores = scos.getScores();
		model.addAttribute("scores", scores);
		System.out.println(scores);
		return "scores";
	}

	@RequestMapping("showScore.do")
	public String toShowScore(Model model,int uid) {

		System.out.println(
				"come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.come here.");

		System.out.println("UID:"+uid);
		Score score = scos.getScoreByUid(uid);
		model.addAttribute("score", score);
		System.out.println(score);
		return "showScore";
	}
}
