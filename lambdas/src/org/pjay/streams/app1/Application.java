/**
 * 
 */
package org.pjay.streams.app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> someNumbers = Arrays.asList("G34","G48","A34","X12","c45","G12","C89","g18","V78","S45","172","I99","G22");
		
		// Lets get all numbers that start with G. Below code ignores g string numbers, so we change in another way
		/*
			someNumbers.forEach(number -> {
				if(number.startsWith("G")){
					System.out.println("\nString numbers starting with G:: " + number);
				}
			});
		*/
		
		/*
			someNumbers.forEach(number -> {
				if(number.toUpperCase().startsWith("G")){
					System.out.println("\nString numbers starting with G:: " + number);
				}
			});
		*/
		
		// Try sorting numbers starting G
		List<String> gNumbers = new ArrayList<>();
		
		// A local variable use in lambda expression must final or effectively final.
		// Below gNumbers reference object is still the same, but due add method only its elements reference is modified. Hence it is still effectively final
		someNumbers.forEach(number -> {
			if(number.toUpperCase().startsWith("G")){
				//System.out.println("\nString numbers starting with G:: " + number);
				gNumbers.add(number);
			}
		});
		
		// Sorting via comparator lambda
		//gNumbers.sort((s1, s2) -> s1.compareTo(s2));
		gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
		gNumbers.forEach(n1 -> System.out.println("\nSorted String numbers starting with G:: " + n1));
		/*
			if("g".compareTo("G") == 0){
				System.out.println("\nEqual");
			}else if("g".compareTo("G") > 0){
				System.out.println("\nGreater");
			}else if("g".compareTo("G") < 0){
				System.out.println("\nLower");
			}
		*/
		
		// Lets do it using streams
		// This can be improved even more
		//someNumbers.stream().map(s1->s1.toUpperCase()).filter(s1->s1.startsWith("G")).sorted().forEach(s2->System.out.println("\nValue via streams is:: " + s2));
		someNumbers.stream().map(String::toUpperCase).filter(s1->s1.startsWith("G")).sorted().forEach(System.out::println);
		
		Stream<String> stream1 = Stream.of("I36","I89","I56","I16","076");
		Stream<String> stream2 = Stream.of("N90","I56","I16","N80","I89","N72");
		Stream<String> concatStream = Stream.concat(stream1, stream2);
		//System.out.println("\n" + "concatStream.count() value:: " + concatStream.count());
		// Error:: 
		// concatStream.count() value:: 11
		// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		// So we will close above statement and execute
		//System.out.println("\n" + "concatStream.distinct().count() value:: " + concatStream.distinct().count());
		// We can use peek method for debugging to know the outcome of some operation, good for verifying
		System.out.println("========================================================");
		System.out.println("\n" + "concatStream.distinct().count() value:: " + concatStream.distinct().peek(System.out::println).count());
	}

}
