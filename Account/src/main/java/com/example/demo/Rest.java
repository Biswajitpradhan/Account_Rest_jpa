package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Rest {
	private AccountRepo rep;
	public Rest(AccountRepo rep) {
		super();
		this.rep = rep;
	}

	@PostMapping("student")
	Account create(@RequestBody Account a)
	{
		rep.save(a);
		return a;
	}
	@PutMapping("student/{id}")
	Account update(@RequestBody Account a,@PathVariable String id)
	{
		a.setUsername(id);
		rep.save(a);
		return a;
	}
	
	@GetMapping("students")
	List get(@RequestBody Account a)
	{
		List<Account> b=rep.findAll();
		return b;
	}
}
