package com.example.demo;

import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.Jpatest.domain.UserInfo;
import com.example.demo.Jpatest.domain.UserRole;
import com.example.demo.Jpatest.repository.UserRepository;

@SpringBootTest
public class ClubMemberTest {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@Test
	public void insertDummies()
	{
		IntStream.rangeClosed(1,50).forEach(i ->{
			UserInfo clubMember = UserInfo.builder()
				.email("user" + i + "@zerock.org")
				.password(passwordEncoder.encode("1111"))
				.build();
			
			
			repository.save(clubMember);
		});
	}
	

	
}
