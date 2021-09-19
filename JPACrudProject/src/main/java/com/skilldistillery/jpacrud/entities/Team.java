package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String location;
	private String name;
	private String conference;
	private String division;
	
	@Column(name ="number_sb")
	private int numberOfSb;
	@Column(name ="last_sb")
	private int lastSb;
	@Column(name ="last_playoffs")
	private int lastPlayoff;
	@Column(name = "head_coach")
	private String headCoach;
	
	
	
	
	
	
	
	
	
	public Team() {
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", location=" + location + ", name=" + name + ", conference=" + conference
				+ ", division=" + division + ", numberOfSb=" + numberOfSb + ", lastSb=" + lastSb + ", lastPlayoff="
				+ lastPlayoff + ", headCoach=" + headCoach + "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getConference() {
		return conference;
	}
	public void setConference(String conference) {
		this.conference = conference;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getNumberOfSb() {
		return numberOfSb;
	}
	public void setNumberOfSb(int numberOfSb) {
		this.numberOfSb = numberOfSb;
	}
	public int getLastSb() {
		return lastSb;
	}
	public void setLastSb(int lastSb) {
		this.lastSb = lastSb;
	}
	public int getLastPlayoff() {
		return lastPlayoff;
	}
	public void setLastPlayoff(int lastPlayoff) {
		this.lastPlayoff = lastPlayoff;
	}
	public String getHeadCoach() {
		return headCoach;
	}
	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}
}
