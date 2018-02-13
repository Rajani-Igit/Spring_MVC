package com.ac.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ac.dto.Plan;

@Controller
public class SearchController {
	
	@RequestMapping("/search-recharge.htm")
	public String searchPlans(@ModelAttribute Plan plan,Model model){
		System.out.println(plan.getPlanName());
		System.out.println(plan.getPlanType());
		System.out.println(plan.getAmount());
		System.out.println(plan.getValidity());
		Plan p1=new Plan("airtel-99","prepaid",60,100.50);
		Plan p2=new Plan("airtel-199","prepaid",60,100.50);
		Plan p3=new Plan("airtel-299","postpaid",60,100.50);
		Plan p4=new Plan("airtel-399","postpaid",60,100.50);
		List<Plan> al=new ArrayList<>();
		al.add(p4);
		al.add(p3);
		al.add(p2);
		al.add(p1);
		model.addAttribute("plans", al);
		return "plan-result";
		
	}

}
