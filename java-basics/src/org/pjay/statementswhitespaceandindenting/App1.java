/**
 * 
 */
package org.pjay.statementswhitespaceandindenting;

/**
 * @author vijayk
 *
 */
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }


        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
	}

}
