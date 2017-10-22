/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package1;

/**
 * @author vijayk
 *
 */
// http://www.javawithus.com/tutorial/access-specifiers
public class PublicClass {
	
	public PublicClass() {
		System.out.println(" ===>> In PublicClass()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
	}

}
