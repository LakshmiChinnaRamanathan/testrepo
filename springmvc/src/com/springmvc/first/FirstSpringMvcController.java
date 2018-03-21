package com.springmvc.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FirstSpringMvcController {
		
	@RequestMapping("/hello")
	public String sayHello() {
			return "index";
		}
	@RequestMapping("/message")
	public String sendmessage(Model m) {
		m.addAttribute("mymessage", "lakshmi");
		m.addAttribute("mymsg", "uma");
		return "kitchen";
	}
	@RequestMapping("/msg")
	public ModelAndView sendSuperMessage(ModelAndView mv) {
		mv.addObject("food", "hello food is ready");
		mv.setViewName("canteen");
		return mv;
	}

}
