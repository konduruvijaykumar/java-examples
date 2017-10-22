/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels.diffpackage;

import org.pjay.accessmodifiers.accesslevels.PrivateConstructorClass;

/**
 * @author vijayk
 *
 */
// Compiler Error:: Implicit super constructor PrivateConstructorClass() is not visible for default constructor. Must define an explicit constructor
public class PrivateConstructorClassExtends {//extends PrivateConstructorClass {

	// Compiler Error:: Implicit super constructor PrivateConstructorClass() is not visible. Must explicitly invoke another constructor
	// Note:: do not reduce visibility of methods public can only have public, protected can have public, protected etc
//	public PrivateConstructorClassExtends() {
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ===>> Cannot extend PrivateConstructorClass from other package, hence no use testing access level");
		System.out.println(" ===>> Compiler Error:: Implicit super constructor PrivateConstructorClass() is not visible for default constructor. Must define an explicit constructor");
	}

}
