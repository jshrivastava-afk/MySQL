package com.ltts.model;

public class Team {

	private int team_id;
	private String teamname;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int team_id, String teamname) {
		super();
		this.team_id = team_id;
		this.teamname = teamname;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", teamname=" + teamname + "]";
	}
	
	
		
	
}