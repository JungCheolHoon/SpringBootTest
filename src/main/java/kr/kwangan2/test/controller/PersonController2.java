package kr.kwangan2.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController2 {
	
	@GetMapping("/getViewName1")
	public String getViewName1() {
		return "testView";
	}
	
	@GetMapping("/getViewName2")
	public void getViewName2() {
		
	}
	@GetMapping("/getViewName3")
	public void getViewName3() {

	}

	@GetMapping("/getRedirectURL")
	public String getRedirectURL() {
		return "redirect:/";
	}
	
	@GetMapping("/getModel")
	public String getModel(Model model) {
		model.addAttribute("name","hong");
		return "/";
	}
	
}
