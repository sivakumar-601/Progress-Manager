package com.taskmonitor.progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public ModelAndView displayHomePage() {
		ModelAndView mv = new ModelAndView("welcome");
		mv.addObject("name","sivakumar");
		return mv;
	}

}
