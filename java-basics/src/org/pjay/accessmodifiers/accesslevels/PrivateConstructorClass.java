/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels;

/**
 * @author vijayk
 *
 */
public class PrivateConstructorClass {
	
	public String publicVar = "publicVar in PrivateConstructorClass";
	protected String protectedVar = "protectedVar in PrivateConstructorClass";
	String defaultVar = "defaultVar in PrivateConstructorClass";
	private String privateVar = "privateVar in PrivateConstructorClass";
	
	private PrivateConstructorClass() {
		System.out.println(" ===>> In private PrivateConstructorClass()");
	}
	
	public void publicMethod() {
		System.out.println(" ===>> In public void publicMethod() of PrivateConstructorClass");
	}
	
	protected void protectedMethod() {
		System.out.println(" ===>> In protected void protectedMethod() of PrivateConstructorClass");
	}
	
	void defaultMethod() {
		System.out.println(" ===>> In void defaultMethod() of PrivateConstructorClass");
	}
	
	private void privateMethod() {
		System.out.println(" ===>> In private void privateMethod() of PrivateConstructorClass");
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// private access modifier In same class and its access 
		PrivateConstructorClass privateConstructorClass = new PrivateConstructorClass();
		System.out.println(privateConstructorClass.publicVar);
		System.out.println(privateConstructorClass.protectedVar);
		System.out.println(privateConstructorClass.defaultVar);
		System.out.println(privateConstructorClass.privateVar);
		privateConstructorClass.publicMethod();
		privateConstructorClass.protectedMethod();
		privateConstructorClass.defaultMethod();
		privateConstructorClass.privateMethod();
	}

}
