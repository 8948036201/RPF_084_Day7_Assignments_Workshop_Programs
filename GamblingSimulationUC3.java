package com.bl.gamblingsimulationproblem;

public class GamblingSimulationUC3 {

	public static int Gambler() {
		int stake = 100;
		int bet = 1;
		int betNumber = 0;
		while (stake != 50 && stake != 150) {
			betNumber = betNumber + 1;
			System.out.println("Current betNumber is: " + betNumber);
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if (betCheck == 1) {
				stake = stake + bet;
				System.out.println("Gambler won !");
			} else {
				stake = stake - bet;
				System.out.println("oops ! Gambler lost");
			}
			System.out.println("Stake value is: " + stake);
		}
		return stake;
	}

	public static void main(String[] args) {
		System.out.println("Gambler is resigning for the day: " + Gambler());
	}
}
