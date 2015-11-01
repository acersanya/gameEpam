package ua.epam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameModel {

	static final int MAX_UPPER_BOUND = 100;
	static final int MIN_LOWER_BOUND = 0;
	private int randomNumber = 0;
	
	/**
	 * Return new random number
	 * @return random
	 */
	public int getRandomNumber(){
		return randomNumber;
	}
	
	/**
	 * List of attempts, all statistic is being written down
	 */
	private static List<Integer> statistics;
	/**
	 * Upper Bound is being changed each time the user prints number greater
	 * then the random one
	 */
	private int upperBound = MAX_UPPER_BOUND;
	/**
	 * Lower Bound is being changed each time the user prints number lower then
	 * the random one
	 */
	private int lowerBound = MIN_LOWER_BOUND;

	/**
	 * Getter for upper bound
	 */
	public int getUpperBound() {
		return upperBound;
	}
	
	/**
	 * Setter for upper bound
	 * @param upperBound
	 */
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	/**
	 *Getter for lower bound
	 */
	public int getLowerBound() {
		return lowerBound;
	}
	
	/**
	 * Setter for lower bound
	 * @param lowerBound
	 */
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	public GameModel() {
		this.randomNumber = getRandom(MIN_LOWER_BOUND, MAX_UPPER_BOUND);
		statistics = new ArrayList<>();
	}

	/**
	 * Add attempt to statistic
	 * @param attempt - user number guess
	 */
	public  void setStatistics(int attempt) {
		statistics.add(new Integer(attempt));
	}

	/**
	 * Attempt getter
	 */
	public List<Integer> getStatistic() {
		return statistics;
	}

	/**
	 * Random number number in exclusive range
	 * 
	 * @param min
	 *            lower bound
	 * @param max
	 *            upper bound
	 * @return value in range (min, max)
	 */
	public  int getRandom(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}
