package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class SimpleController {
	@GetMapping("/simple")//localhost:8080/simple
	public String simpleFunc() {
		System.out.println("Jāaaa izdevāas");
		return "home";//tiks ielaadeeta web browsery home.html lapa
	}
	@GetMapping("/msg")
	public String msgFunc(Model model) {
		model.addAttribute("package", "Sveiciens no backend");
		return "msg-page";//ielade msg-page.html lapu
	}
	
	@GetMapping("/sendprod")
	public String sendProdFunc(Model model) {
		Product prodTest = new Product("abols", "garsigs", 0.99f, 10);
		model.addAttribute("package", prodTest);
		return "prod-page";
	}
}
