package com.programming.class1;

public class IndianTeam implements ISports, IFootball{

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVenue(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHomeTeamPointsScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisitingTeamPointsScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endOfQuarters(int noofQuartersPlayed) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		IndianTeam obj = new IndianTeam();
		obj.setHomeTeam("india");
		obj.setVisitingTeam("england");
		System.out.println("default number of players are " + ISports.defaultNumberOfPlayers);
	}

}
