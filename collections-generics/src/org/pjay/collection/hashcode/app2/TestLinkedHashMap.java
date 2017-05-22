/**
 * 
 */
package org.pjay.collection.hashcode.app2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author vijayk
 *
 * IMP:
 * All objects being put to LinkedHashMap are stored in instance variable table as an array, with hash code representing the index, where to place the object in array.
 * Initial capacity of the LinkedHashMap start with 16 and maintains extra variables like "head, tail". The head (eldest) and tail (youngest).
 * Entry of LinkedHashMap extends from HashMap.Node and adds extra fields "before, after". Which are used for maintaining the doubly-linked list relation.
 * When collisions occur with objects having same hashcode.
 * Then LinkedHashMap maintains those objects as doubly-linked list by referring it to after from previously added object and before of the object refers to previously added object.
 * Where the first object put in an index is added as head of the LinkedHashMap.
 * For more details verify the below link for getting a better understanding of this example in the form of diagram.
 * For this reason LinkedHashMap provides objects in insertion order and gives data based on the order inserted.
 * 
 * https://github.com/konduruvijaykumar/java-examples/blob/master/collections-generics/org.pjay.collection.hashcode.app2.LinkedHashMap.pdf
 * http://www.javarticles.com/2012/06/linkedhashmap.html
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
