package com.example.demo.Jpatest.repository.querydsl.CenterList;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Jpatest.domain.CenterList;
import com.example.demo.Jpatest.dto.UpdateDto;

public interface CenterListRepository extends JpaRepository<CenterList, Long>, CustomizedCenterListRepository{
	Optional<CenterList> findByPhoneNumber(String phoneNumber);
	void update(UpdateDto updateData);
}
