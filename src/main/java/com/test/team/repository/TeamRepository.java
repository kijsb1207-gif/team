package com.test.team.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.team.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

	List<Team> findAll();

	
	
}
