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
		
		System.out.println("Select table for insertion:");
		System.out.println("1.Player \n 2.Team");
	    int x=Integer.parseInt(br.readLine()); 
	    
	    if(x==1)
	    {
	    	System.out.println("Enter the Player Id: "); 
	    	int pid=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the Player Name: ");
            String pname=br.readLine();
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
	        
	        Player p=new Player(pid,pname,pskills,pruns,pwic,pnum,pteam);
	        PlayerDAO pd=new PlayerDAO();
	        pd.insertPlayer(p);
	        
	    }
	    
	    if(x==2)
	    {
	    	System.out.println("Enter the Team Id: "); 
	    	int tid=Integer.parseInt(br.readLine());
	    	System.out.println("Enter the Team Name: ");
            String tname=br.readLine();
            
            Team t= new Team(tid,tname);
            TeamDAO td=new TeamDAO();
            td.insertTeam(t);
	    	
	    }
	   
	
	}
}
