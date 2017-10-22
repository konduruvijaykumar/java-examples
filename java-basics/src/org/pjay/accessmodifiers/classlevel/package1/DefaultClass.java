/**
 * 
 */
package org.pjay.accessmodifiers.classlevel.package1;

/**
 * @author vijayk
 *
 */
// No access or default modifier
class DefaultClass {
	
	public DefaultClass() {
		System.out.println(" ===>> In DefaultClass()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultClass defaultClass = new DefaultClass();
	}

}
