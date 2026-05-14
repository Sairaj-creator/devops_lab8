package com.example.program8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class App {
	@GetMapping("/")
	public String sayHello() {
		return "hello lowde";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
