package com.hexa.inter;

public class InterMain {

	public static void main(String[] args) {
		ISportsClub sportsClub=new CricketClub();
		sportsClub.showTournaments();
		sportsClub.showDetails();
		
		ISportsClub sportsClub1=new FootballClub();
		sportsClub1.showTournaments();
		sportsClub1.showDetails();
	}

}
