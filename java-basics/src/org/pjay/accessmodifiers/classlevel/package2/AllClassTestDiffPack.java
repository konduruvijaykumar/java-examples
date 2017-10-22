/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package2;

import org.pjay.accessmodifiers.classlevel.package1.PublicClass;

/**
 * @author vijayk
 *
 */
public class AllClassTestDiffPack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		// no use as we cannot use protected modifier at class level
		//ProtectedClass protectedClass = new ProtectedClass();// not really protected modifier at class level
		// DefaultClass cannot be resolved to a type
		//DefaultClass defaultClass = new DefaultClass();
		// no use as we cannot use private modifier at class level
		//PrivateClass privateClass = new PrivateClass();// not really private modifier at class level
	}

}
