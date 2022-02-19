package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cntr {

	@Autowired
	serviceImp imp;
	@GetMapping(value = "/getRandomQuote")
	public String say()
	{
		return this.imp.getRJokes();
	}
}
