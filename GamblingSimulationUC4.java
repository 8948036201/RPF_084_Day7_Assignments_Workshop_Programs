package com.bl.gamblingsimulationproblem;

public class GamblingSimulationUC4 {

	public static void Gambler() {
		int bet = 1;
		int stake = 100;
		int won = 0;
		int lost = 0;
		int totalWin = 0;
		int totalLost = 0;
		for (int days = 1; days <= 20; days++) {
			while (stake != 50 && stake != 150) {
				double betCheck = Math.floor(Math.random() * 10) % 2;
				if (betCheck == 1) {
					stake = stake + bet;
				} else {
					stake = stake - bet;
				}
			}
			won = stake + 100;
			lost = stake - 100;
			System.out.println("Total amount of win for days is: " + won + "$");
			System.out.println("Total amount of lost for day days is: " + lost + "$");
			totalWin = totalWin + won;
			totalLost = totalLost + lost;
		}
		System.out.println("Total win for 20 days is: " + totalWin + "$");
		System.out.println("Total lost for 20 days is: " + totalLost + "$");
	}

	public static void main(String[] args) {
		Gambler();
	}
}
