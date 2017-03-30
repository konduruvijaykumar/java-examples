/**
 * 
 */
package org.pjay.keywordsandexpressions;

/**
 * @author vijayk
 *
 */
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
// https://en.wikipedia.org/wiki/List_of_Java_keywords
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// a mile is equal to 1.609344 kilometers
		double kilometers = (100 * 1.609344);
		int highScore = 50;

		if (highScore == 50) {
			System.out.println("This is an expression");

		}

		// In the following code that I will type below, write down what parts of the code are expressions.
		int score = 100;
		if (score > 99) {
			System.out.println("You got the high score");
			score = 0;
		}
	}

}
