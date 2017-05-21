/**
 * 
 */
package org.pjay.collection.hashcode.app2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vijayk
 *
 * IMP:
 * All objects being put to HashMap are stored in instance variable table as an array, with hash code representing the index, where to place the object in array.
 * Initial capacity of the HashMap start with 16.
 * When collisions occur with objects having same hashcode, then HashMap maintains those objects as single linked list.
 * Where the first object put in an index is added as head of the linked list, when another object put in the same index it is added as next object. Similarly remaining.
 * For more details verify the below link for getting a better understanding of this example in the form of diagram.
 * For this reason HashMap doesn't provide objects in insertion order and gives data based on index and collision objects in same index 
 * 
 * https://github.com/konduruvijaykumar/java-examples/blob/master/collections-generics/org.pjay.collection.hashcode.app2.HashMap.pdf
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
