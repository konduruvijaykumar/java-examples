/**
 * 
 */
package org.pjay.collection.hashcode.app2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vijayk
 *
 */
public class TestHashMap {

	public static void main(String[] args) {
		Map<Employee, String> hMap = new HashMap<>();
		hMap.put(new Employee("VJay", 28, 3), "VJay");
		hMap.put(new Employee("RJay", 31, 2), "RJay");
		hMap.put(new Employee("AJay", 22, 5), "AJay");
		hMap.put(new Employee("MJay", 22, 4), "MJay");
		hMap.put(new Employee("PJay", 22, 2), "PJay");
		
		System.out.println(" ========== Iterate via entry set ============");
		for (Map.Entry<Employee, String> entry : hMap.entrySet()) {
			System.out.println("Key:: \t" + entry.getKey() + "\t Value:: \t" + entry.getValue());
		}
		
		System.out.println("\n ========== Iterate via key set ============");
		for (Employee key : hMap.keySet()) {
			System.out.println("Key:: \t" + key + "\t Value:: \t" + hMap.get(key));
		}
		
	}

}
