package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.ltts.model.Player;
import com.ltts.model.Team;
import com.ltts.dao.PlayerDAO;
import com.ltts.dao.TeamDAO;

public class MiniMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Insert \n2.Update \n3.Display");		
		int x=Integer.parseInt(br.readLine());
		
		if(x==1) {
			System.out.println("Enter table to insert: \n1.Team \n2.Player");
			int z=Integer.parseInt(br.readLine());
			
		  if(z==1) {
		  System.out.println("Enter the Team Id: "); 
		  int tid=Integer.parseInt(br.readLine());
		  System.out.println("Enter the Team Name: "); 
		  String tname=br.readLine();
		  System.out.println("Enter the Owner Name: "); 
		  String toname=br.readLine();
		  System.out.println("Enter the Coach Name: "); 
		  String tcname=br.readLine();
		  System.out.println("Enter the Captain id: "); 
		  int cid=Integer.parseInt(br.readLine());
		  
		  Team t= new Team(tid,tname,toname,tcname,cid); 
		  TeamDAO td=new TeamDAO();
		  td.insertTeam(t);
		  System.out.println("Sucessfully Inserted");
			}
			
		if(z==2) {	
		  System.out.println("Enter the Player Id: "); 
		  int pid=Integer.parseInt(br.readLine());
		  System.out.println("Enter the Player Name: "); 
		  String pname=br.readLine();
		  System.out.println("Enter the Player DOB(YYYY-MM-DD): "); 
		  String pdob=br.readLine(); 
		  System.out.println("Enter the Player Skills: ");
		  String pskills=br.readLine(); 
		  System.out.println("Enter the Player runs: "); 
		  int pruns=Integer.parseInt(br.readLine());
		  System.out.println("Enter the Player Wickets: "); 
		  int pwic=Integer.parseInt(br.readLine());
		  System.out.println("Enter the Player Number of Matches: "); 
		  int pnum=Integer.parseInt(br.readLine());
		  System.out.println("Enter Player Team Id: "); 
		  int pteam=Integer.parseInt(br.readLine());
		  
		  Player p=new Player(pid,pname,pdob,pskills,pruns,pwic,pnum,pteam); 
		  PlayerDAO pd=new PlayerDAO(); pd.insertPlayer(p);
		  System.out.println("Sucessfully Inserted");
		}
		}
		if(x==2)
		{
			System.out.println("Enter table to update; \n1.Player \n2.Team");
			int b=Integer.parseInt(br.readLine());
		if(b==1)
		{
		    System.out.println("Enter the Column name to update: \n1.Name \n2.DOB \n3.Skills \n4.Runs \n5.Wickets \n6.Number of Matches");
		    int y=Integer.parseInt(br.readLine());
		if(y==1)
		{
		   System.out.println("Enter Player Name: ");
		   String pname=br.readLine();
		   System.out.println("Enter the Player Id: "); 
		   int pid=Integer.parseInt(br.readLine());
		   PlayerDAO pd=new PlayerDAO();
		   pd.updatePlayer(pid,pname);
		}
		if(y==2)
		{
			System.out.println("Enter Date of Birth: ");
			String pdob=br.readLine();
			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			PlayerDAO pd=new PlayerDAO();
			pd.updatePlayer(pid,pdob);
		}
		if(y==3)
		{
			System.out.println("Enter Player Skills: ");
			String pskills=br.readLine();
			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			PlayerDAO pd=new PlayerDAO();
			pd.updatePlayerSkills(pid,pskills);
		}
		if(y==4)
		{
			System.out.println("Enter Player Runs: ");
			int pruns=Integer.parseInt(br.readLine());
			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			PlayerDAO pd=new PlayerDAO();
			pd.updatePlayerRuns(pid,pruns);
		}
		if(y==5)
		{
			System.out.println("Enter Player Wickets: ");
			int pwick=Integer.parseInt(br.readLine());
			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			PlayerDAO pd=new PlayerDAO();
			pd.updatePlayerWick(pid,pwick);
		}
		if(y==6)
		{
			System.out.println("Enter Player Number of Matches: ");
			int pnum=Integer.parseInt(br.readLine());
			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			PlayerDAO pd=new PlayerDAO();
			pd.updatePlayerNumb(pid,pnum);
		}
		}
		if(b==2)
		{
			System.out.println("Enter Team Name: ");
			String tname=br.readLine();
			System.out.println("Enter the Team Id: "); 
			int tid=Integer.parseInt(br.readLine());
			TeamDAO td=new TeamDAO();
			td.updateTeam(tid,tname);
		}
		}
		if(x==3)
		{
			System.out.println("Choose the following: \n1.Display all the Players \n2.Display Players based on Team \n3.Display Players based on Skill and Team");
			int v=Integer.parseInt(br.readLine());
		if(v==1)
		{
			System.out.println("ID: Name: DOB: Skills: Runs: wickets: Numberofmatches: TeamId");
		    PlayerDAO pd=new PlayerDAO();
		    pd.Displayplayers();
		}
		if(v==2)
		{
			System.out.println("Enter The Team to Detail:");
		    String tname=br.readLine();
		    System.out.println("ID: Name: DOB: Skills: Runs: wickets: Numberofmatches: TeamId: TeamName: OwnerName: CoachName: TeamID");
		    PlayerDAO pd=new PlayerDAO();
		    pd.Displayplayersteam(tname);
		}
		if(v==3)
		{
			System.out.println("Enter The Team:");
		    String tname=br.readLine();
		    System.out.println("Enter The Skill:");
		    String skill=br.readLine();
		    System.out.println("ID: Name: DOB: Skills: Runs: wickets: Numberofmatches: TeamId: TeamName: OwnerName: CoachName: TeamID");
		    PlayerDAO pd=new PlayerDAO();
		    pd.Displayplayerss(tname,skill);
		}
		}
	    	}
	   
	
	}
