package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AccountApplication.class, args);
		Demo1 d=run.getBean(Demo1.class);
		d.create();
		d.getAccountByUsername();
		d.update();
		d.getAccountsByFullName();
		d.getAllAccounts();
		d.delete();
	}

}
