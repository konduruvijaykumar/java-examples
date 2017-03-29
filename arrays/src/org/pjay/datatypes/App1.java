/**
 * 
 */
package org.pjay.datatypes;

/**
 * @author vijayk
 *
 */
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
// http://cs.fit.edu/~ryan/java/language/java-data.html
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstVar = 10+2+2*12;
		int secondVar = 18;
		int thirdVar = firstVar*secondVar;
		
		int total =  firstVar+secondVar+thirdVar;
		int finalVar = 1000 - total;
		
		System.out.println("finalVar :: " + finalVar);
	}

}
