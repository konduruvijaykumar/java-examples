/**
 * 
 */
package org.pjay.helloworld;

/**
 * @author vijayk
 *
 */
public class HelloWorldApp2 {

	/**
	 * @param args
	 */
	public static void main(String myArgs[]) {//public static void main(String[] v)
		//public static void main(String v[])
		System.out.println("Hello Java");
		//System.out.println("args values::  " + v);
		System.out.println("args values::  " + myArgs);
		if(null != myArgs && myArgs.length > 0){
			for (String val : myArgs) {
				System.out.println("Values are:: " + val);
			}
		}
	}

}
