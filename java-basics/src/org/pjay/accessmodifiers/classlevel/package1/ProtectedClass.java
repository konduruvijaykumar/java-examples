/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package1;

/**
 * @author vijayk
 *
 */
// Compiler Error:: Illegal modifier for the class ProtectedClass; only public, abstract & final are permitted
// protected class ProtectedClass {
public class ProtectedClass {
	
	// Compiler Error:: Illegal modifier for the field abc; only public, protected, private, static, final, transient & volatile are permitted
	//abstract String abc;
	
	// Compiler Error::  
	// Illegal modifier for the constructor in type ProtectedClass; only public, protected & private are permitted
	// This method has a constructor name
	// Similar issue for final and abstract
	//public static ProtectedClass() {
	// Warning:: This method has a constructor name
	// Hence this void makes it a method instead of constructor, adding other returns will give compilation error to return data
	//public void ProtectedClass() {
	public ProtectedClass() {
		System.out.println(" ===>> In ProtectedClass() but cannot have protected modifier to class level\t");
		System.out.println(" ===>> Illegal modifier for the class ProtectedClass; only public, abstract & final are permitted");
	}
	
	// Compiler Error:: 
	// The abstract method method in type ProtectedClass can only be defined by an abstract class
	// The abstract method method in type ProtectedClass can only set a visibility modifier, one of public or protected
	//private static abstract void method();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProtectedClass protectedClass = new ProtectedClass();
	}

}
