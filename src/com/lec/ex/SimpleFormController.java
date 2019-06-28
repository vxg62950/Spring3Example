package com.lec.ex;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lec.form.User;

@Controller
public class SimpleFormController {
	   
	@RequestMapping(value = "/simpleForm.html", method = RequestMethod.GET)
	public void simpleForm(Model model) {
		   model.addAttribute(new User());
	  }
	@RequestMapping(value = "/formoutput.html", method = RequestMethod.POST)
	public void simple(@ModelAttribute User user, Model model) {
		   model.addAttribute("user", user);		
	}
}
