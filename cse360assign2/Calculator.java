package cse360assign2;
/**
 * Author			:		Ricky Hsu
 * Class ID			:		407
 * Assignment Number:		2
 * Description		:		Calculator program that tracks the history of
 * 							of computations 
 */
public class Calculator {

	private int total;
	/**
	 * Class constructor
	 * 
	 * construct an instance of the class Calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
     * The method returns the current total resulting value
     * of the computation
     * 
	 * @return      the current total
	 * 
	 */
	public int getTotal () {
		return 0;
	}
	/**
     * The method takes in an integer and adds it to the
     * current total
     * 
	 * @param   value integer value to be added to the current total
	 * 
	 */
	public void add (int value) {
		total += value;
	}
	/**
     * The method takes in an integer and subtracts it from the
     * current total
     * 
	 * @param   value integer value to be subtracted from the current total
	 * 
	 */
	public void subtract (int value) {
		total -= value;
	}
	/**
     * The method takes in an integer and multiplies it
     * current total
     * 
	 * @param   value integer value to be multiplied to the current total
	 * 
	 */
	public void multiply (int value) {
		total *= value;
	}
	/**
     * The method takes in an integer and divides into the
     * current total
     * 
	 * @param   value integer value to be divided into the current total
	 * 
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total /= value;
		}	
	}
	/**
     * The method returns the history of totals resulted from all the
     * computations in a string format.
     * 
	 * @return      the history of totals in string format
	 * 
	 */
	public String getHistory () {
		return "";
	}
}