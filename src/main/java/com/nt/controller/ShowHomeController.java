package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShowHomeController {
	
	
	/*@RequestMapping("/home")
	public  String  showHomePage() {
		//return LVN
		return "welcome";
	}*/
	
	@GetMapping("/wish")
	public  ResponseEntity<String>  showWishMessage(){
		System.out.println("WishMessageOperationsController.showWishMessage()");
		return new  ResponseEntity<String>("Good Morning", HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public  String  showHomePage() {
		//return LVN
		return "welcome";
	}

}
