package com.bl.gamblingsimulationproblem;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class GamblingSimulationUC6 {
	
	//int stake = 100;
	int bet = 1;
	int daysInMonth = 31;
	int indexLuckiest = 0;
	int indexUnLuckiest = 0;
	int win[];
	int loss[];
	for (int day = 1; day <= daysInMonth; day++) {
		int winCount = 0;
		int lossCount = 0;
		int stake = 100;
		System.out.println("Loop" + (day+1));
		while (stake != 50 && stake != 150) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if (betCheck == 1) {
				stake = stake + bet;
				winCount = winCount + 1;
			} else {
				stake = stake - bet;
				lossCount = lossCount + 1;
			}
		}
		System.out.println("Wins for day " + (day + 1) + ":" + winCount);
		System.out.println("Losses for day " + (day + 1) + ":" + lossCount);
		
		if (day > 0) {
			if (lossCount > MaximizeAction(loss)) {
				indexUnLuckiest = day;
			}
			if (winCount > MaximizeAction(win)) {
				indexLuckiest = day;
			}
		}
		loss[day] = lossCount;
		win[day] = winCount;
		System.out.println("Luckiest day is - Day " + (indexLuckiest + 1) + " with " + win[indexLuckiest] + " Wins");
		System.out.println("Unluckiest day is - Day " + (indexUnLuckiest + 1)  + " with " + loss[indexUnLuckiest] + " Losses");
	}
}
