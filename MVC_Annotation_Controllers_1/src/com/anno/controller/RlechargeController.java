package com.anno.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anno.dto.Plan;

@Controller
public class RlechargeController {
	@RequestMapping("/recharge.htm")
	public String recharge(@RequestParam("provider") String provider,Model model){
		System.out.println(provider);
		if(provider.equalsIgnoreCase("Airtel")){
			ArrayList<Plan> al=new ArrayList<>();
			Plan p1=new Plan("30 rs talktime",35,"60days");
			Plan p2=new Plan("45 rs talktime",45,"60days");
			Plan p3=new Plan("300 rs talktime",350,"60days");
			Plan p4=new Plan("200rs netpak",150,"60days");
			Plan p5=new Plan("230 rs talktime",35,"60days");
			al.add(p1);
			al.add(p2);
			al.add(p3);
			al.add(p4);
			al.add(p4);
		
			model.addAttribute("plans",al);
		}
		else if(provider.equalsIgnoreCase("bsnl")){
			
		}
		return "recharge";
	}

}
