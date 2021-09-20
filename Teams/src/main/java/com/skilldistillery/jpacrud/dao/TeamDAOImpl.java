package com.skilldistillery.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Team;


@Service
@Transactional
public class TeamDAOImpl implements TeamDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Team findByID(int teamID) {
		Team team = em.find(Team.class, teamID);
		return team;
	}

	@Override
	public List<Team> findAll() {
		
		String jpql = "SELECT t from Team t";
		return em.createQuery(jpql, Team.class).getResultList();
		
	}

	@Override
	public boolean deleteTeam(int teamID) {
		boolean complete = false;
		Team t = em.find(Team.class, teamID);
		em.remove(t);
		complete = em.contains(t);
		return complete;
		
		}

	@Override
	public Team addTeam(Team team) {
		em.persist(team);
		em.flush();
		return team;
	}
	}


