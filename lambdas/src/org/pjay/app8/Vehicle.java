/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */

public interface Vehicle {
	
	default void print(){
		System.out.println("I am a Vehicle");
	}
	
	// From java 8 static helper methods in interfaces
	static void blowHorn(){
		System.out.println("Vehicle blows Horn");
	}

}
