package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class Demo1 {
	private AccountRepo repo;

	public Demo1(AccountRepo repo) {
		super();
		this.repo = repo;
	}
	
	public void getAllAccounts()
	{
		List<Account> a=repo.findAll();
		for (Account account : a) {
			System.out.println("Username "+account.getUsername()+" Full name "+account.getFullname()+" Password "+account.getPassword());
		}
	}
	public void  getAccountByUsername()
	{
		Optional<Account> a=repo.findByUsername("Ram");
		if(a.isPresent())
		{
			System.out.println("Full Name is "+a.get().getFullname()+" Password "+a.get().getPassword());
		}
	}
	
	public void getAccountsByFullName()
	{
		Optional<Account> a=repo.findByFullname("Hari");
		if(a.isPresent())
		{
			System.out.println("Full Name is "+a.get().getFullname()+" Password "+a.get().getPassword());
		}
	}
	
	public void create()
	{
		Account a=new Account();
		a.setUsername("Ram");
		a.setFullname("Hari");
		a.setPassword("ramhari");
		repo.save(a);
	}
	public void update()
	{
		Account b=new Account();
		b.setUsername("Ram");
		b.setFullname("Hari");
		b.setPassword("hari");
		repo.save(b);
		System.out.println("value updated");
	}
	public void delete()
	{
	
		repo.deleteById("Ram");
		System.out.println("Successfully deleted..");
	}
	
	
}
