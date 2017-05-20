/**
 * 
 */
package org.pjay.collection.hashcode.app2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author vijayk
 *
 */
public class TestLinkedHashMap {
	
	public static void main(String[] args) {
		Map<Employee, String> lhMap = new LinkedHashMap<>();
		lhMap.put(new Employee("VJay", 28, 3), "VJay");
		lhMap.put(new Employee("RJay", 31, 2), "RJay");
		lhMap.put(new Employee("AJay", 22, 5), "AJay");
		lhMap.put(new Employee("MJay", 22, 4), "MJay");
		lhMap.put(new Employee("PJay", 22, 2), "PJay");
		
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
