package ua.epam.test;

import java.util.List;

public class GameView {

	public static final String STATISTICS = "Your statistics";
	private final static String INTERVAL = "Secret number lies between";
	private final static String GREETINGS = "Congruts you guessed the number:";
	private final static String START_GAME = "Game starts";

	/**
	 * Prints all user statistics
	 * @param game
	 */
	public void printStatistic(List<Integer> game) {
		System.out.println(STATISTICS);
		for (Integer i : game) {
			printer(i.toString() + " ");
		}
	}

	public void printer(String input) {
		System.out.println(input);
	}

	/**
	 * Prints current range where number can be place
	 * @param lowerBound
	 * @param upperBound
	 */
	public void printNewRange(int lowerBound, int upperBound) {
		printer(INTERVAL + "(" + lowerBound + "," + upperBound + ")");
	}

	/**
	 * Print guessed number
	 * @param n
	 */
	public void finishGame(int n) {
		printer(GREETINGS + n);
	}
	
	public void start(){
		printer(START_GAME);
	}

}
