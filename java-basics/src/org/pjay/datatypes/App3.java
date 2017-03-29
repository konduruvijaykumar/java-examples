/**
 * 
 */
package org.pjay.datatypes;

/**
 * @author vijayk
 *
 */
// http://stackoverflow.com/questions/27598078/float-and-double-datatype-in-java
public class App3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// size of int is 32 bit (4 bytes)
		int intVar = 5;
		// size of float is 32 bit (4 bytes), decimals precision is 7 bits  
		float fltVar = 5f;//5;
		// size of float is 64 bit (8 bytes), decimals precision is 16 bits
		double dblVar = 5d;//5;
		
		//intVar = 5/2;fltVar = 5f/2;dblVar = 5d/2;
		//intVar = 5/3;fltVar = 5f/3;dblVar = 5d/3;
		//intVar = 5/3;fltVar = 5/3;dblVar = 5/3;// Will not work fine as most will defaulted to int
		//intVar = 5/3;fltVar = 5f/3f;dblVar = 5d/3f;
		//intVar = 5/3;fltVar = 5f/3f;dblVar = 5d/3d;
		intVar = -5/3;fltVar = -5f/3f;dblVar = -5d/3d;
		
		System.out.println("intVar :: " + intVar);
		System.out.println("fltVar :: " + fltVar);
		System.out.println("dblVar :: " + dblVar);
		
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.
		
		double weight = 57.82d;//25d;// weight in pounds
		double weightInKgs = 0d;// default value
		final double CONVERTION_RATE_PND_TO_KGS = 0.45359237d;
		
		weightInKgs = weight*CONVERTION_RATE_PND_TO_KGS;
		
		System.out.println("weightInKgs :: " + weightInKgs);
		
		// Can also have _ in between numbers, only thing they don't add any value to number.
		// This feature enables you, for example. to separate groups of digits in numeric literals, which can improve the readability of your code
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		double pi = 3.14_159d;
		System.out.println("pi value :: " + pi);
		
		double anotherVar = 70_00_000.7_68_97d;
		System.out.println("anotherVar :: " + anotherVar);
	}

}
