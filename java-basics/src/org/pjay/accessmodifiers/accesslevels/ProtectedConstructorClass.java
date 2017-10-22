/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels;

/**
 * @author vijayk
 *
 */
public class ProtectedConstructorClass {
	
	public String publicVar = "publicVar in ProtectedConstructorClass";
	protected String protectedVar = "protectedVar in ProtectedConstructorClass";
	String defaultVar = "defaultVar in ProtectedConstructorClass";
	private String privateVar = "privateVar in ProtectedConstructorClass";
	
	protected ProtectedConstructorClass() {
		System.out.println(" ===>> In protected ProtectedConstructorClass()");
	}
	
	public void publicMethod() {
		System.out.println(" ===>> In public void publicMethod() of ProtectedConstructorClass");
	}
	
	protected void protectedMethod() {
		System.out.println(" ===>> In protected void protectedMethod() of ProtectedConstructorClass");
	}
	
	void defaultMethod() {
		System.out.println(" ===>> In void defaultMethod() of ProtectedConstructorClass");
	}
	
	private void privateMethod() {
		System.out.println(" ===>> In private void privateMethod() of ProtectedConstructorClass");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// protected access modifier In same class and its access 
		ProtectedConstructorClass protectedConstructorClass = new ProtectedConstructorClass();
		System.out.println(protectedConstructorClass.publicVar);
		System.out.println(protectedConstructorClass.protectedVar);
		System.out.println(protectedConstructorClass.defaultVar);
		System.out.println(protectedConstructorClass.privateVar);
		protectedConstructorClass.publicMethod();
		protectedConstructorClass.protectedMethod();
		protectedConstructorClass.defaultMethod();
		protectedConstructorClass.privateMethod();
	}

}
