package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,String>{

	Optional<Account> findByUsername(String name);

	Optional<Account> findByFullname(String fname);


}
