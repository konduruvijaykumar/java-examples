/**
 * 
 */
package org.pjay.helloworld;

/**
 * @author vijayk
 *
 */
// https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
// http://stackoverflow.com/questions/3158730/java-3-dots-in-parameters
// http://stackoverflow.com/questions/965690/java-optional-parameters
public class HelloWorldVarArgs {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		System.out.println("Hello Java");
		System.out.println("args values::  " + args);
		if(null != args && args.length > 0){
			for (String val : args) {
				System.out.println("Values are:: " + val);
			}
		}
	}

}
