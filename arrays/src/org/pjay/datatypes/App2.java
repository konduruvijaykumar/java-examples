/**
 * 
 */
package org.pjay.datatypes;

/**
 * @author vijayk
 *
 */
public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        // by default expressions evaluate variables to int, unless explicitly converted or casted
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
	}

}
