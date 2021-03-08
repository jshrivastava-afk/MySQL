package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDAO {

	public List<Player> getAllPlayers(){
		List<Player> li=new ArrayList<Player>();
		
		return li;
		}
		
		public Player getPlayerById(int id) {
			Player p = new Player();
				
			return p;
		}
		
			public boolean insertPlayer(Player p) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("insert into player values(?,?,?,?,?,?,?,?)");
				ps.setInt(1, p.getPlayer_id());
				ps.setString(2, p.getName());
				ps.setString(3, p.getDate());
				ps.setString(4, p.getSkills());
				ps.setInt(5, p.getRuns());
				ps.setInt(6, p.getWickets());
				ps.setInt(7, p.getNumber_of_matches());
				ps.setInt(8, p.getTeam_id());
				return ps.execute();
			}
				
			public void updatePlayer(int pid, String pname) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_Name='"+pname+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				
			}
			public void updatePlayerDOB(int pid, String pdob) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_DOB='"+pdob+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				
			}
			public void updatePlayerSkills(int pid, String pskills) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_skills='"+pskills+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				
			}
			public void updatePlayerRuns(int pid, int pruns) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_Runs='"+pruns+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				
			}
			public void updatePlayerWick(int pid, int pwic) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_Wicket='"+pwic+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				
			}
			public void updatePlayerNumb(int pid, int pnum) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("UPDATE Player SET Player_Name='"+pnum+"'WHERE Player_ID="+pid);
				ps.executeUpdate();
				}
			public void Displayplayers() throws Exception {
				
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("Select * from Player");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"
				    +rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"
				    +rs.getString(8));
				}
					}
			public void Displayplayersteam(String teamname) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("SELECT * FROM Player p , Team t where p.teamId= t.TeamId && t.Teamname ='"+teamname+"'");
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"
						    +rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"
						    +rs.getString(8)+":"+rs.getString(9)+":"+rs.getString(10)+":"+rs.getString(11)+
						    ":"+rs.getString(12)+":"+rs.getString(13));
				}
			}
			public void Displayplayerss(String teamname, String skills) throws Exception
			{
				Connection c= MyConnection.getConnection();
				PreparedStatement ps= c.prepareStatement("SELECT * FROM Player p , Team t where p.teamId= t.TeamId && t.Teamname ='"+teamname+"'&& p.Player_skills ='"+skills+"'");
                ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"
						    +rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"
						    +rs.getString(8)+":"+rs.getString(9)+":"+rs.getString(10)+":"+rs.getString(11)+
						    ":"+rs.getString(12)+":"+rs.getString(13));
				}
			}
			
	}