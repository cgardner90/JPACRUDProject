package com.skilldistillery.jpacrud.dao;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Team;


public interface TeamDAO {

	Team findByID(int teamID);
	List<Team> findAll();
	boolean deleteTeam(int teamID);
	Team addTeam(Team team);
	void updateTeam(Team team, int id);
	
	
	
	
	
	
}
