/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package2;

import org.pjay.accessmodifiers.classlevel.package1.PublicClass;

/**
 * @author vijayk
 *
 */
public class PublicClassDiffPackExtends extends PublicClass{
	
	public PublicClassDiffPackExtends() {
		// Compiler Error:: Recursive constructor invocation PublicClassDiffPackExtends(String, String)
		// If you try calling other Constructor using this to avoid super default constructor call provided by compiler, you might end up making recursive calls
		// between all constructors. Finally to avoid compiler error one constructor needs to have no call to self constructor using this.
		// Hence that will have super() constructor call, which is kind of becomes compulsory
		//this("Vijay", "Kumar");
		System.out.println(" ===>> In PublicClassDiffPackExtends()");
	}
	
	public PublicClassDiffPackExtends(String param) {
		this();
		System.out.println(" ===>> PublicClassDiffPackExtends(String param)\t" + " :: Param Value :: " + param);
	}
	
	public PublicClassDiffPackExtends(String param1, String param2) {
		this(param1);
		// Compiler error if two or more Constructor calls present using this  
		//this(param1);// Constructor call must be the first statement in a constructor
		System.out.println(" ===>> PublicClassDiffPackExtends(String param)\t" + " :: Param Values ::" + " param1 " + param1 + " param2 " + param2);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClassDiffPackExtends publicClassDiffPackExtends = new PublicClassDiffPackExtends();
		PublicClassDiffPackExtends publicClassDiffPackExtends1 = new PublicClassDiffPackExtends("Vijay");
		PublicClassDiffPackExtends publicClassDiffPackExtends2 = new PublicClassDiffPackExtends("Vijay", "Kumar");
	}

}
