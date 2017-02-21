/**
 * 
 */
package org.pjay.challenge.app1;

import java.util.function.Function;
import java.util.function.Supplier;
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
		String input = "1234567890";
		// Challenge #1: Covert below code to lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };
        
        Runnable lambdaRunnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            Stream.of(parts).forEach(part -> System.out.println(part));
            /*for (String part : parts) {
            	System.out.println(part);
			}*/
        };
        //new Thread(lambdaRunnable).start();
        
        //System.out.println("\n"+"everySecondChar() value is:: "+everySecondChar("Vijay"));
        // Challenge #2: Lambda answer
        Function<String, String> functionChall2 = source -> {
        	StringBuilder builder = new StringBuilder();
    		for (int i = 0; i < source.length(); i++) {
    			if(i%2 == 1){
    				builder.append(source.charAt(i));
    			}
    		}
    		return builder.toString();
        };
        
        //  Challenge #3: Pass argument to above challenge ex. "1234567890"
        System.out.println("\n================ Challenge #3 ===============");
        System.out.println(functionChall2.apply(input));
        
        // Challenge #4: convert above to method
        System.out.println("\n================ Challenge #4 ===============");
        String every2ndCharLambda = everySecondCharLambda(functionChall2,input);
        // Challenge #5 print the results
        System.out.println("\n================ Challenge #5 ===============");
        System.out.println("every2ndCharLambda:: " + every2ndCharLambda);
        
        // Challenge #6 use supplier to return "I Love Java!" and assign to variable "iLoveJava"
        //Supplier<String> iLoveJava = () -> "I Love Java!";
        Supplier<String> iLoveJava = () -> {
        	return "I Love Java!";
        };
        
        // Challenge #7 execute supplier to assign value "I Love Java!" to supplierResult and print
        String supplierResult = iLoveJava.get();
        System.out.println("\n" + "supplierResult value:: " + supplierResult);
	}
	
	private static String everySecondCharLambda(Function<String, String> functionLambdaChall4, String input) {
		return functionLambdaChall4.apply(input);
	}
	
	// Challenge #2: Covert below code to lambda
	private static String everySecondChar(String source){
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			if(i%2 == 1){
				builder.append(source.charAt(i));
			}
		}
		return builder.toString();
	}
	
}
