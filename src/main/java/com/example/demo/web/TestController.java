package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.business.Pumpkin;

@RestController
@RequestMapping("/tests")
public class TestController {
	
	private List<Pumpkin> pumpkins = new ArrayList<>();
	
	@GetMapping("/")
	public String testing() {
		return "Testing 1,2,3!";
	}
	
	@GetMapping("/the-raven")
	public String theRaven()
	{
		return "Once Upon a Midnight Dreary\n"
				+ "While I pondered, weak and Weary\n"
				+ "Over Many a Quant and curious Volume of forgotten Lore\n"
				+ "While I nodded, Nearly napping\n"
				+ "Suddenly there came a tapping\n"
				+ "As if someone gently rapping, rapping on my chamber door\n"
				+ "\"T'is some visitor,\" I muttered, \"Tapping on my chamber door\"\n"
				+ "\"This is it, and nothing more\".";
	}

	@GetMapping("/pumpkin")
	public Pumpkin makePumpkin() {
		Pumpkin p = new Pumpkin(1,"orange",11.5, 12, 15, true);
		return p;
	}
	
	@GetMapping("/pumpkins")
	public List<Pumpkin> makePumpkins(@RequestParam int id, @RequestParam String color, 
			@RequestParam double weight, @RequestParam double height, 
			@RequestParam double width, @RequestParam boolean decorated) {
		Pumpkin p = new Pumpkin(id, color, weight, height, width, decorated);
		pumpkins.add(p);
		return pumpkins;
	}
}