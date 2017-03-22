/**
 * 
 */
package org.pjay.strings;

/**
 * @author vijayk
 *
 */
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Vijay";
		String s2 = new String("Vijay");
		String s3 = new String("Vijay").intern();
		//String s4 = new String("Vijay");
		String s4 = new String(s1);
		String s5 = s1;
		String s6 = "Vijay";

		System.out.println("In case of primitives == verify's values, \nwhere as in case of objects == verify's references of objects i.e., \nif both objects refer to same memory location then true else false");

		isStringsEqual(s1, s2);
		isStringsEqual(s1, s3);
		//isStringsEqual(s1, s4);
		isStringsEqual(s2, s4);
		isStringsEqual(s1, s5);
		isStringsEqual(s1, s6);
		
		//if(true == false){System.out.println("Yes");}else{System.out.println("No");}
		//if(1 == 1){System.out.println("Yes");}else{System.out.println("No");}
	}

	private static void isStringsEqual(String str1, String str2) {
		//System.out.format("\nValues of str1, str2 are %s, %s \n", str1, str2);
		System.out.println("================================================");
		if (str1 == str2) {
			System.out.println("str1 == str2 comparison objects are equal");
		} else {
			System.out.println("str1 == str2 comparison objects are not equal");
		}

		if (str1.equals(str2)) {
			System.out.println("str1.equals(str2) comparison objects are equal");
		} else {
			System.out.println("str1.equals(str2) comparison objects are not equal");
		}
	}

}
