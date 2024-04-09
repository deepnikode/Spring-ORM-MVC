package springmvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc1.model.User;
import springmvc1.service.UserService;


@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{	System.out.println(user);
	this.userService.createUser(user);
		return "success";
	}
}
