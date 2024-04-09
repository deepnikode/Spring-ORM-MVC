package springmvc1.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping(path="/home",method = RequestMethod.GET)
	public String home(Model model)
	{	System.out.println("This is home url");
	
		model.addAttribute("name", "Deep Suresh Nikode");
		model.addAttribute("age", 22);
		
		List<String> family=new ArrayList<String>();
		family.add("Mummy");
		family.add("Papa");
		family.add("Arti");
		
		model.addAttribute("fam", family);

		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{	System.out.println("This is about controller");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView  help()
	{	System.out.println("This is about controller");
		ModelAndView mv=new ModelAndView();
		mv.addObject("player", "Deep Nikode");
		mv.addObject("score", 101);
		LocalDateTime t=LocalDateTime.now();
		mv.addObject("time", t);
		
		List<Integer> runs_by_overs=new ArrayList<Integer>();
		runs_by_overs.add(19);
		runs_by_overs.add(45);
		runs_by_overs.add(32);
		mv.addObject("run_overs", runs_by_overs);
		
		mv.setViewName("help");
		return mv;
	}
}
