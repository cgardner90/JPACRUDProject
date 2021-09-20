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

	@Override
	public void updateTeam(Team team, int id) {
		Team updated = em.find(Team.class, id);
		if(team.getLocation().length()!=0) {
		updated.setLocation(team.getLocation());
		}else updated.setLocation(updated.getLocation());
		if(team.getName().length()!=0) {
		updated.setName(team.getName());
		}else updated.setName(updated.getName());
		if(team.getConference().length()!=0) {
		updated.setConference(team.getConference());
		}else updated.setConference(updated.getConference());
		if(team.getDivision().length()!=0) {
		updated.setDivision(team.getDivision());
		}else updated.setDivision(updated.getDivision());
		if(team.getNumberOfSb()>updated.getNumberOfSb()) {
		updated.setNumberOfSb(team.getNumberOfSb());
		}else updated.setNumberOfSb(updated.getNumberOfSb());
		if(team.getLastSb()>updated.getLastSb()) {
		updated.setLastSb(team.getLastSb());
		}else updated.setLastSb(updated.getLastSb());
		if(team.getLastPlayoff()>0) {
			if(team.getLastPlayoff()>updated.getLastPlayoff()) {
		updated.setLastPlayoff(team.getLastPlayoff());
		}}else updated.setLastPlayoff(updated.getLastPlayoff());
		if(team.getHeadCoach().length()!=0) {
		updated.setHeadCoach(team.getHeadCoach());
		}else updated.setHeadCoach(updated.getHeadCoach());
	}
}
