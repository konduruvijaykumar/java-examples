/**
 * 
 */
package org.pjay.datatypes;

/**
 * @author vijayk
 *
 */
// https://unicode-table.com/en/#latin-1-supplement
public class App4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char myChar = '\u00A9';//'K';
		System.out.println("myChar :: " + myChar);
		
		boolean boolVar = false;//true;
		boolean isBabyGirl = true;
		
		System.out.println("boolVar :: " + boolVar);
		System.out.println("isBabyGirl :: " + isBabyGirl);
		
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.
		
		char myRegTrdMark = '\u00AE';
		System.out.println("myRegTrdMark :: " + myRegTrdMark);
	}

}
