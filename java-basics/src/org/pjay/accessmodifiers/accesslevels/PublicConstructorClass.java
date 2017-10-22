/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels;

/**
 * @author vijayk
 *
 */
public class PublicConstructorClass {
	
	public String publicVar = "publicVar in PublicConstructorClass";
	protected String protectedVar = "protectedVar in PublicConstructorClass";
	String defaultVar = "defaultVar in PublicConstructorClass";
	private String privateVar = "privateVar in PublicConstructorClass";
	
	public PublicConstructorClass() {
		System.out.println(" ===>> In public PublicConstructorClass()");
	}
	
	public void publicMethod() {
		System.out.println(" ===>> In public void publicMethod() of PublicConstructorClass");
	}
	
	protected void protectedMethod() {
		System.out.println(" ===>> In protected void protectedMethod() of PublicConstructorClass");
	}
	
	void defaultMethod() {
		System.out.println(" ===>> In void defaultMethod() of PublicConstructorClass");
	}
	
	private void privateMethod() {
		System.out.println(" ===>> In private void privateMethod() of PublicConstructorClass");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// public access modifier In same class and its access 
		PublicConstructorClass publicConstructorClass = new PublicConstructorClass();
		System.out.println(publicConstructorClass.publicVar);
		System.out.println(publicConstructorClass.protectedVar);
		System.out.println(publicConstructorClass.defaultVar);
		System.out.println(publicConstructorClass.privateVar);
		publicConstructorClass.publicMethod();
		publicConstructorClass.protectedMethod();
		publicConstructorClass.defaultMethod();
		publicConstructorClass.privateMethod();
	}

}
