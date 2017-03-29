/**
 * 
 */
package org.pjay.arrays;

import java.util.Arrays;

/**
 * @author vijayk
 *
 */
//http://codereview.stackexchange.com/questions/36214/find-all-subsets-of-an-int-array-whose-sums-equal-a-given-target
public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = {2,5,3,8,12,10};
		int TARGET_SUM = 10;
		int total = 0;
		StringBuilder sb = new StringBuilder();
		
		// Let's sort the array to avoid checking after target sum in iterating
		Arrays.sort(numbers);

	}

}
