package com.hexa.inter;

public class FootballClub implements ISportsClub {

	@Override
	public void showDetails() {
		System.out.println("No of Players :11");
	}

	@Override
	public void showTournaments() {
		System.out.println("World Cup");
	}

}
