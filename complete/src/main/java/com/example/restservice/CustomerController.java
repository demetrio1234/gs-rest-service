package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/customer")
	public Customer Customer(
			@RequestParam(value = "name", defaultValue = "World") String name,
			@RequestParam(value = "firstname", defaultValue = "World") String firstname,
			@RequestParam(value = "email", defaultValue = "World") String email,
			@RequestParam(value = "address", defaultValue = "World") String address) {
		return new Customer(counter.incrementAndGet(),
				String.format(template, name),
				String.format(template, firstname),
				String.format(template, email),
				String.format(template, address));
	}
}
