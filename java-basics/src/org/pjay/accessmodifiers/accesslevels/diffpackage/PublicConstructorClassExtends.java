/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels.diffpackage;

import org.pjay.accessmodifiers.accesslevels.PublicConstructorClass;

/**
 * @author vijayk
 *
 */
public class PublicConstructorClassExtends extends PublicConstructorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" ===>> In main metod of PublicConstructorClassExtends extends PublicConstructorClass");
		System.out.println(" ===>> Here due to Polymorphism \n i.e., compile time Polymorphism we will find different behaviour.\n PublicConstructorClassExtends instance refered by PublicConstructorClass will not have access to protectedVar and protectedMethod(). \n Which we expect to have access as we extended class in diff package.");
		System.out.println(" ===>> PublicConstructorClassExtends publicConstructorClassExtends = new PublicConstructorClassExtends()");
		System.out.println(" ===>> Above instace case will have acces to protectedVar and protectedMethod().\n As at compile time reference variable is of type PublicConstructorClassExtends and extends PublicConstructorClass");
		PublicConstructorClassExtends publicConstructorClassExtends = new PublicConstructorClassExtends();
		System.out.println(publicConstructorClassExtends.publicVar);
		System.out.println(publicConstructorClassExtends.protectedVar);
		// Compiler Error:: fields not visible
		//System.out.println(publicConstructorClassExtends.defaultVar);
		//System.out.println(publicConstructorClassExtends.privateVar);
		publicConstructorClassExtends.publicMethod();
		publicConstructorClassExtends.protectedMethod();
		// Compiler Error:: methods not visible
		//publicConstructorClassExtends.defaultMethod();
		//publicConstructorClassExtends.privateMethod();
		
		System.out.println(" ===>> PublicConstructorClass publicConstructorClassExtends1 = new PublicConstructorClassExtends()");
		System.out.println(" ===>> Above instace case will not have acces to protectedVar and protectedMethod().\n As at compile time reference variable is of type PublicConstructorClass and is created in different package");
		PublicConstructorClass publicConstructorClassExtends1 = new PublicConstructorClassExtends();
		System.out.println(publicConstructorClassExtends1.publicVar);
		//System.out.println(((PublicConstructorClassExtends)publicConstructorClassExtends1).protectedVar);
		//// Compiler Error:: fields not visible
		//System.out.println(publicConstructorClassExtends1.protectedVar);
		//System.out.println(publicConstructorClassExtends1.defaultVar);
		//System.out.println(publicConstructorClassExtends1.privateVar);
		publicConstructorClassExtends1.publicMethod();
		// Compiler Error:: methods not visible
		//publicConstructorClassExtends1.protectedMethod();
		//publicConstructorClassExtends1.defaultMethod();
		//publicConstructorClassExtends1.privateMethod();
	}

}
