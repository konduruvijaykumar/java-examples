/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package2;

/**
 * @author vijayk
 *
 */
// Compiler Error:: DefaultClass cannot be resolved to a type
public class DefaultClassDiffPackExtends{//extends DefaultClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Compiler Error:: DefaultClass cannot be resolved to a type");
		System.out.println("DefaultClass not visible or cannot be resolved, hence cannot extend default class in diff package");
	}

}
