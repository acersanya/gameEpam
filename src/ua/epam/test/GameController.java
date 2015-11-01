package ua.epam.test;

import java.util.Scanner;

public class GameController {

	private GameModel game;
	private GameView view;
	
	private final static String INVALID_INPUT = "Invalid input!Try again";
	private final static String INVALID_INTEGER = "Invalid integer!Try again";

	public GameController() {
		this.game = new GameModel();
		this.view = new GameView();
	}
	
	/**
	 * Performs input for user
	 * Check if input is integer
	 * @return
	 */
	public int input() {
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			view.printer(INVALID_INPUT);
			view.printer(INVALID_INTEGER);
			scan.next();
		}
		return scan.nextInt();

	}

	/**
	 * Method responsible for game logic
	 */
	public void gameInitializer() {
		view.start();
	    int random = game.getRandomNumber();
	    System.out.println(random);
		while (true) {
			int in = input();
			if (in > game.getUpperBound() || in < game.getLowerBound()) {
				view.printNewRange(game.getLowerBound(), game.getUpperBound());
				game.setStatistics(in);
				continue;
			} else if (in > random) {
				game.setUpperBound(in);
				game.setStatistics(in);
				view.printNewRange(game.getLowerBound(), game.getUpperBound());
				continue;
			} else if (in < random) {
				game.setLowerBound(in);
				game.setStatistics(in);
				view.printNewRange(game.getLowerBound(), game.getUpperBound());
				continue;
			} else	
				game.setStatistics(in);
				view.finishGame(in);
				view.printStatistic(game.getStatistic());
			break;
		}
	}

}
