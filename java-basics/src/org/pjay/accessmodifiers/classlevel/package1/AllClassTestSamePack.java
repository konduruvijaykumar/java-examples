/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package1;

/**
 * @author vijayk
 *
 */
public class AllClassTestSamePack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		// no use as we cannot use protected modifier at class level
		//ProtectedClass protectedClass = new ProtectedClass();// not really protected modifier at class level
		DefaultClass defaultClass = new DefaultClass();
		// no use as we cannot use private modifier at class level
		//PrivateClass privateClass = new PrivateClass();// not really private modifier at class level
	}

}
