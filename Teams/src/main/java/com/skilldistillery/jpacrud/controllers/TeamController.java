package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.jpacrud.dao.TeamDAO;
import com.skilldistillery.jpacrud.entities.Team;

@Controller
public class TeamController {
	
	@Autowired
	private TeamDAO dao;
	
	@RequestMapping(path={"/", "home.do"})
	public String home(Model model) {
		List<Team> teams = dao.findAll();
		model.addAttribute("teams", teams);
		return "home";
	}
	@RequestMapping(path = "getTeam.do", method = RequestMethod.GET)
	public String getTeam(Integer teamID, Model model) {
		model.addAttribute("team", dao.findByID(teamID));
		return "team/getTeam";
	}
	
	@RequestMapping(path = "deleteTeam.do", method = RequestMethod.POST)
	public String deleteTeam(Integer teamID, Model model) {
		model.addAttribute("team", dao.findByID(teamID));
		dao.deleteTeam(teamID);
		return "team/deleteTeam";
		
		
	}
	
	
	
}