/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package1;

/**
 * @author vijayk
 *
 */
// Compiler Error:: Illegal modifier for the class PrivateClass; only public, abstract & final are permitted
//private class PrivateClass {
public class PrivateClass {
	
	public PrivateClass() {
		System.out.println(" ===>> In PrivateClass() but cannot have private modifier to class level\t");
		System.out.println(" ===>> Illegal modifier for the class PrivateClass; only public, abstract & final are permitted");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrivateClass privateClass = new PrivateClass();
	}

}
