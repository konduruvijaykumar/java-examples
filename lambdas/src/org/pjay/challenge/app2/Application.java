/**
 * 
 */
package org.pjay.challenge.app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String temp = "harry";
		//String temp1 = "";
		//temp1 = temp.substring(0, 1).toUpperCase()+temp.substring(1);
		//System.out.println(temp1);
		
		// Challenge #9: convert first letter of each element to upper case and sort them
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        
        // Try 1
        System.out.println("\n================ Try 1 =================");
        List<String> upperCaseTopNames = new ArrayList<>();
        topNames2015.forEach(s1 -> upperCaseTopNames.add(s1.substring(0, 1).toUpperCase().concat(s1.substring(1))));
        upperCaseTopNames.sort((n1,n2) -> n1.compareTo(n2));
        upperCaseTopNames.forEach(n1 -> System.out.println(n1));
        
        // Try 2
        System.out.println("\n================ Try 2 =================");
        List<String> upperCaseTopNames2015 = topNames2015.stream()
        													.map(s1 -> s1.substring(0, 1).toUpperCase().concat(s1.substring(1)))
        													.collect(Collectors.toList());
        
        upperCaseTopNames2015.sort((s1, s2) -> s1.compareTo(s2));
        upperCaseTopNames2015.forEach(s1 -> System.out.println(s1));
        
        // Try 3
        // Challenge #9,10,11: use method references Object::MethodName, use stream operations
        // Challenge #13: use peek to debug through operations in above challenges
        System.out.println("\n================ Try 3 =================");
        //topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).sorted(String::compareTo).forEach(System.out::println);
        topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).sorted().forEach(System.out::println);
        
        System.out.println("\n================ Challenge #13 =================");
        //topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).peek(s1 -> System.out.println("Peek output:: " + s1)).sorted().forEach(System.out::println);
        // Nothing will be printed as there is no terminal operation
        //topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).peek(System.out::println).sorted();
        // Adding terminal operation, as lambda code is lazily loaded
        //topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).peek(System.out::println).sorted().count();
        topNames2015.stream().map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1))).peek(System.out::println).sorted(String::compareTo).collect(Collectors.toList());
        
        
        // Challenge #12: instead of printing sorting names, print how many numbers start with A
        System.out.println("\n================ Challenge #12 =================");
        // again mapping will return true false output ".map(s1 -> s1.startsWith("A"))"
        /*
	        topNames2015.stream()
	        			.map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1)))
	        			.forEach(s1 -> {
	        				if(s1.startsWith("A")){
	        					System.out.println(s1);
	        				}
	        			});
        */
        
        long count =  topNames2015.stream()
        							.map(str1 -> str1.substring(0, 1).toUpperCase().concat(str1.substring(1)))
        							.filter(s1 -> s1.startsWith("A"))
        							.count();
        System.out.println("\nCount of names starting with A:: " + count);
        
	}

}
