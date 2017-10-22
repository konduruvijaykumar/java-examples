/**
 * 
 */
package org.pjay.accessmodifiers.accesslevels;

/**
 * @author vijayk
 *
 */
public class DefaultConstructorClass {
	
	public String publicVar = "publicVar in DefaultConstructorClass";
	protected String protectedVar = "protectedVar in DefaultConstructorClass";
	String defaultVar = "defaultVar in DefaultConstructorClass";
	private String privateVar = "privateVar in DefaultConstructorClass";
	
	DefaultConstructorClass() {
		System.out.println(" ===>> In DefaultConstructorClass()");
	}

	public void publicMethod() {
		System.out.println(" ===>> In public void publicMethod() of DefaultConstructorClass");
	}
	
	protected void protectedMethod() {
		System.out.println(" ===>> In protected void protectedMethod() of DefaultConstructorClass");
	}
	
	void defaultMethod() {
		System.out.println(" ===>> In void defaultMethod() of DefaultConstructorClass");
	}
	
	private void privateMethod() {
		System.out.println(" ===>> In private void privateMethod() of DefaultConstructorClass");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// no access or default access modifier In same class and its access 
		DefaultConstructorClass defaultConstructorClass = new DefaultConstructorClass();
		System.out.println(defaultConstructorClass.publicVar);
		System.out.println(defaultConstructorClass.protectedVar);
		System.out.println(defaultConstructorClass.defaultVar);
		System.out.println(defaultConstructorClass.privateVar);
		defaultConstructorClass.publicMethod();
		defaultConstructorClass.protectedMethod();
		defaultConstructorClass.defaultMethod();
		defaultConstructorClass.privateMethod();
	}

}
