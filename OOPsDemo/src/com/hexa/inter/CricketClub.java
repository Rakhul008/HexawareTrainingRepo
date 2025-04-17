package com.hexa.inter;

public class CricketClub implements ISportsClub {

	@Override
	public void showDetails() {
		System.out.println("No of players:11");
	}

	@Override
	public void showTournaments() {
		System.out.println("IPL Tournaments");
	}

}
