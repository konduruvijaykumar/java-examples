/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels.diffpackage;

import org.pjay.accessmodifiers.accesslevels.DefaultConstructorClass;

/**
 * @author vijayk
 *
 */
// Compiler Error:: Implicit super constructor DefaultConstructorClass() is not visible for default constructor. Must define an explicit constructor
public class DefaultConstructorClassExtends {//extends DefaultConstructorClass {

	// Compiler Error:: Implicit super constructor DefaultConstructorClass() is not visible. Must explicitly invoke another constructor
//	DefaultConstructorClassExtends() {
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ===>> Cannot extend DefaultConstructorClass from other package, hence no use testing access level");
		System.out.println(" ===>> Compiler Error:: Implicit super constructor DefaultConstructorClass() is not visible for default constructor. Must define an explicit constructor");
	}

}
