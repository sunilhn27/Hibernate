package com.springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerSchool {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/loginpage")
	public String login(Model m) {
		School school = new School();
		m.addAttribute("school", school);
		return "loginpage";
	}

	@RequestMapping("/processlogin")
	public String process(@Valid @ModelAttribute("school") School school, BindingResult bindresult) {
		if (bindresult.hasErrors()) {
			System.out.println("/n");
			System.out.println("error" + bindresult);
			System.out.println("loginpage");
			return "loginpage";
		} else {
			System.out.println("homepage");
			return "homepage";
		}

	}

}
