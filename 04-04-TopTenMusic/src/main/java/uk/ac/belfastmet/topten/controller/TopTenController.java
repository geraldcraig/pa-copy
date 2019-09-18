package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping
public class TopTenController {
	
	@GetMapping()
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/singles")
	public String singlesPage(Model model) {
		
		TopTenService toptenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Singles");
		model.addAttribute("singles", toptenService.getsinglesTopTen());
		
		return "singles";
	}
	
	@GetMapping("/albums")
	public String albumsPage(Model model) {
		
		TopTenService toptenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Albums");
		model.addAttribute("albums", toptenService.getalbumsTopTen());
		
		return "albums";
	}
	
	
	

}
