package com.bean;

import java.util.Map;

public class IPLTeam {
	
	private int team_id;
	private String team_name,owner_name;
	private Map<String, Player> players;
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public Map<String, Player> getPlayers() {
		return players;
	}
	public void setPlayers(Map<String, Player> players) {
		this.players = players;
	}



	
	
	
	
	

}
