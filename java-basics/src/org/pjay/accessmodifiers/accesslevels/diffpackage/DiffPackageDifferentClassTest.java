/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels.diffpackage;

import org.pjay.accessmodifiers.accesslevels.DefaultConstructorClass;
import org.pjay.accessmodifiers.accesslevels.ProtectedConstructorClass;
import org.pjay.accessmodifiers.accesslevels.PublicConstructorClass;

/**
 * @author vijayk
 *
 */
public class DiffPackageDifferentClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// public access modifier In same package different class and its access 
		PublicConstructorClass publicConstructorClass = new PublicConstructorClass();
		System.out.println(publicConstructorClass.publicVar);
		// Compiler Error:: The field PublicConstructorClass.protectedVar is not visible
		//System.out.println(publicConstructorClass.protectedVar);
		// Compiler Error:: The field PublicConstructorClass.defaultVar is not visible
		//System.out.println(publicConstructorClass.defaultVar);
		// Compiler Error:: The field PublicConstructorClass.privateVar is not visible
		//System.out.println(publicConstructorClass.privateVar);
		publicConstructorClass.publicMethod();
		// Compiler Error:: The method protectedMethod() from the type PublicConstructorClass is not visible
		//publicConstructorClass.protectedMethod();
		// Compiler Error:: The method defaultMethod() from the type PublicConstructorClass is not visible
		//publicConstructorClass.defaultMethod();
		// Compiler Error:: The method privateMethod() from the type PublicConstructorClass is not visible
		//publicConstructorClass.privateMethod();
		
		System.out.println(" ===================================================================================== ");
		
		System.out.println(" ===>> protected access modifier In same package different class and its access - Compiler Error:: The constructor ProtectedConstructorClass() is not visible");
		// protected access modifier In same package different class and its access
		// Compiler Error:: The constructor ProtectedConstructorClass() is not visible
		// hence every line of code below is no use
		//ProtectedConstructorClass protectedConstructorClass = new ProtectedConstructorClass();
		//System.out.println(protectedConstructorClass.publicVar);
		//System.out.println(protectedConstructorClass.protectedVar);
		//System.out.println(protectedConstructorClass.defaultVar);
		//System.out.println(protectedConstructorClass.privateVar);
		//protectedConstructorClass.publicMethod();
		//protectedConstructorClass.protectedMethod();
		//protectedConstructorClass.defaultMethod();
		//protectedConstructorClass.privateMethod();
		
		System.out.println(" ===================================================================================== ");
		
		System.out.println(" ===>> no access or default access modifier In same package different class and its access - Compiler Error:: The constructor DefaultConstructorClass() is not visible");
		// no access or default access modifier In same package different class and its access
		// Compiler Error:: The constructor DefaultConstructorClass() is not visible
		// hence every line of code below is no use
		//DefaultConstructorClass defaultConstructorClass = new DefaultConstructorClass();
		//System.out.println(defaultConstructorClass.publicVar);
		//System.out.println(defaultConstructorClass.protectedVar);
		//System.out.println(defaultConstructorClass.defaultVar);
		//System.out.println(defaultConstructorClass.privateVar);
		//defaultConstructorClass.publicMethod();
		//defaultConstructorClass.protectedMethod();
		//defaultConstructorClass.defaultMethod();
		//defaultConstructorClass.privateMethod();
		
		System.out.println(" ===================================================================================== ");
		
		System.out.println(" ===>> private access modifier In same package different class and its access - Compiler Error:: The constructor PrivateConstructorClass() is not visible");
		// private access modifier In same package different class and its access
		// Compiler Error:: The constructor PrivateConstructorClass() is not visible
		// hence every line of code below is no use
		//PrivateConstructorClass privateConstructorClass = new PrivateConstructorClass();
		//System.out.println(privateConstructorClass.publicVar);
		//System.out.println(privateConstructorClass.protectedVar);
		//System.out.println(privateConstructorClass.defaultVar);
		//System.out.println(privateConstructorClass.privateVar);
		//privateConstructorClass.publicMethod();
		//privateConstructorClass.protectedMethod();
		//privateConstructorClass.defaultMethod();
		//privateConstructorClass.privateMethod();
		
	}

}
