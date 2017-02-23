/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */

public interface FourWheeler {
	
	// From java 8 default implementation methods in interfaces
	default void print(){
		System.out.println("I am a FourWheeler");
	}
	
	// From java 8 static helper methods in interfaces
	static void blowHorn(){
		System.out.println("FourWheeler blows Horn");
	}

}
