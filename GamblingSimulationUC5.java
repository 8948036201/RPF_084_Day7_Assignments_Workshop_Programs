package com.bl.gamblingsimulationproblem;

public class GamblingSimulationUC5 {

	public static void Gambler() {
		int bet = 1;
		int dayWinAmount = 0;
		int dayOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String nameOfMonth[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int stake = 100;

		for (int i = 1; i <= dayOfMonth.length; i++) {
			int wonDays = 0;
			int lostDays = 0;
			int monthWinAmount = 0;
			for (int day = 1; day <= dayOfMonth[i]; day++) {
				while (stake != 50 && stake != 150) {
					double betCheck = Math.floor(Math.random() * 10) % 2;
					if (betCheck == 1) {
						stake = stake + bet;
					} else {
						stake = stake - bet;
					}
				}
				dayWinAmount = stake - 100;
				System.out.println("Amount for day" + day + 1 + "is" + dayWinAmount);
			}
			if (dayWinAmount < 0) {
				lostDays = lostDays + 1;
			} else {
				wonDays = wonDays + 1;
			}
			monthWinAmount = monthWinAmount + dayWinAmount;
			System.out.println("For " + nameOfMonth[i] + ": Total win days is: " + wonDays + "and Total loss days is: "
					+ lostDays);
			System.out.println("The difference between the no. of days won and lost is: " + (wonDays - lostDays));
			System.out.println("For " + nameOfMonth[i] + ": Total win amount is: " + monthWinAmount);
		}
	}

	public static void main(String[] args) {
		Gambler();
	}
}
