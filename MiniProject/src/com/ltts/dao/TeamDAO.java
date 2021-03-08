package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Team;

public class TeamDAO {

	public List<Team> getAllTeams(){
		List<Team> li=new ArrayList<Team >();
		
		return li;
		}
	public Team getTeamById(int id) {
		Team t = new Team();
			
		return t;
	}
	public boolean insertTeam(Team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into team values(?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		return ps.execute();
}
}
