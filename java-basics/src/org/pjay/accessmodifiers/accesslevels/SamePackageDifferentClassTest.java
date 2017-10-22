/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels;

/**
 * @author vijayk
 *
 */
public class SamePackageDifferentClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// public access modifier In same package different class and its access 
		PublicConstructorClass publicConstructorClass = new PublicConstructorClass();
		System.out.println(publicConstructorClass.publicVar);
		System.out.println(publicConstructorClass.protectedVar);
		System.out.println(publicConstructorClass.defaultVar);
		// Compiler Error:: The field PublicConstructorClass.privateVar is not visible
		//System.out.println(publicConstructorClass.privateVar);
		publicConstructorClass.publicMethod();
		publicConstructorClass.protectedMethod();
		publicConstructorClass.defaultMethod();
		// Compiler Error:: The method privateMethod() from the type PublicConstructorClass is not visible
		//publicConstructorClass.privateMethod();
		
		System.out.println(" ===================================================================================== ");
		
		// protected access modifier In same package different class and its access 
		ProtectedConstructorClass protectedConstructorClass = new ProtectedConstructorClass();
		System.out.println(protectedConstructorClass.publicVar);
		System.out.println(protectedConstructorClass.protectedVar);
		System.out.println(protectedConstructorClass.defaultVar);
		// Compiler Error:: The field ProtectedConstructorClass.privateVar is not visible
		//System.out.println(protectedConstructorClass.privateVar);
		protectedConstructorClass.publicMethod();
		protectedConstructorClass.protectedMethod();
		protectedConstructorClass.defaultMethod();
		// Compiler Error:: The method privateMethod() from the type ProtectedConstructorClass is not visible
		//protectedConstructorClass.privateMethod();
		
		System.out.println(" ===================================================================================== ");
		
		// no access or default access modifier In same package different class and its access 
		DefaultConstructorClass defaultConstructorClass = new DefaultConstructorClass();
		System.out.println(defaultConstructorClass.publicVar);
		System.out.println(defaultConstructorClass.protectedVar);
		System.out.println(defaultConstructorClass.defaultVar);
		// Compiler Error:: The field DefaultConstructorClass.privateVar is not visible
		//System.out.println(defaultConstructorClass.privateVar);
		defaultConstructorClass.publicMethod();
		defaultConstructorClass.protectedMethod();
		defaultConstructorClass.defaultMethod();
		// Compiler Error:: The method privateMethod() from the type DefaultConstructorClass is not visible
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
