/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels.diffpackage;

import org.pjay.accessmodifiers.accesslevels.ProtectedConstructorClass;

/**
 * @author vijayk
 *
 */
public class ProtectedConstructorClassExtends extends ProtectedConstructorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ===>> In main metod of ProtectedConstructorClassExtends extends ProtectedConstructorClass");
		System.out.println(" ===>> Here due to Polymorphism \n i.e., compile time Polymorphism we will find different behaviour.\n ProtectedConstructorClassExtends instance refered by ProtectedConstructorClass will not have access to protectedVar and protectedMethod(). \n Which we expect to have access as we extended class in diff package.");
		System.out.println(" ===>> ProtectedConstructorClassExtends protectedConstructorClassExtends = new ProtectedConstructorClassExtends()");
		System.out.println(" ===>> Above instace case will have acces to protectedVar and protectedMethod().\n As at compile time reference variable is of type ProtectedConstructorClassExtends and extends ProtectedConstructorClass");
		ProtectedConstructorClassExtends protectedConstructorClassExtends = new ProtectedConstructorClassExtends();
		System.out.println(protectedConstructorClassExtends.publicVar);
		System.out.println(protectedConstructorClassExtends.protectedVar);
		// Compiler Error:: fields not visible
		//System.out.println(protectedConstructorClassExtends.defaultVar);
		//System.out.println(protectedConstructorClassExtends.privateVar);
		protectedConstructorClassExtends.publicMethod();
		protectedConstructorClassExtends.protectedMethod();
		// Compiler Error:: methods not visible
		//protectedConstructorClassExtends.defaultMethod();
		//protectedConstructorClassExtends.privateMethod();
		
		System.out.println(" ===>> ProtectedConstructorClass protectedConstructorClassExtends1 = new ProtectedConstructorClassExtends()");
		System.out.println(" ===>> Above instace case will not have acces to protectedVar and protectedMethod().\n As at compile time reference variable is of type ProtectedConstructorClass and is created in different package");
		ProtectedConstructorClass protectedConstructorClassExtends1 = new ProtectedConstructorClassExtends();
		System.out.println(protectedConstructorClassExtends1.publicVar);
		//System.out.println(((ProtectedConstructorClassExtends)protectedConstructorClassExtends1).protectedVar);
		// Compiler Error:: fields not visible
		//System.out.println(protectedConstructorClassExtends1.protectedVar);
		//System.out.println(protectedConstructorClassExtends1.defaultVar);
		//System.out.println(protectedConstructorClassExtends1.privateVar);
		protectedConstructorClassExtends1.publicMethod();
		// Compiler Error:: methods not visible
		//protectedConstructorClassExtends1.protectedMethod();
		//protectedConstructorClassExtends1.defaultMethod();
		//protectedConstructorClassExtends1.privateMethod();
		
	}

}
