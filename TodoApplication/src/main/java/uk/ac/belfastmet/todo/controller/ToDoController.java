package uk.ac.belfastmet.todo.controller;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jdk.internal.org.jline.utils.Log;
import uk.ac.belfastmet.todo.service.ToDoService;



@Controller
@RequestMapping
public class ToDoController {
	
	Logger log = LoggerFactory.getLogger(ToDoController.class);
	
	@GetMapping("/")
	public String homePage(Model model) {
		
		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.gettaskToDo());
		
		String name = "Gerald";
		model.addAttribute("myName", name);
		
		
		log.info("index page");
		
		return "index";
		
		 
	}
	
	@GetMapping("/Page2")
	public String page2Page(Model model) {
		
		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.gettaskToDo());
		
		String name = "Gerald";
		model.addAttribute("myName", name);
		
		
		log.info("index page");
		
		return "page2";
		
		 
	}
	
	
	

}
