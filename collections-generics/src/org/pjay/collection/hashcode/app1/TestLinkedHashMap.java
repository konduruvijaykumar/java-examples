/**
 * 
 */
package org.pjay.collection.hashcode.app1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author vijayk
 *
 * http://www.javarticles.com/2012/06/linkedhashmap.html
 * http://www.informit.com/articles/article.aspx?p=368648&seqNum=2
 * https://stackoverflow.com/questions/4980757/how-do-hashtables-deal-with-collisions
 * http://www.javamadesoeasy.com/2015/02/linkedhashmap-custom-implementation.html
 * https://stackoverflow.com/questions/26311776/why-iteration-through-double-linked-buckets-in-linkedhashmap-is-faster-than-iter
 */
public class TestLinkedHashMap {
	
	public static void main(String[] args) {
		Map<Employee, String> lhMap = new LinkedHashMap<>();
		lhMap.put(new Employee("VJay", 28), "VJay");
		lhMap.put(new Employee("RJay", 31), "RJay");
		lhMap.put(new Employee("PJay", 22), "PJay");
		
		System.out.println(" ========== Iterate via entry set ============");
		for (Map.Entry<Employee, String> entry : lhMap.entrySet()) {
			System.out.println("Key:: \t" + entry.getKey() + "\t Value:: \t" + entry.getValue());
		}
		
		System.out.println("\n ========== Iterate via key set ============");
		for (Employee key : lhMap.keySet()) {
			System.out.println("Key:: \t" + key + "\t Value:: \t" + lhMap.get(key));
		}
	}

}
