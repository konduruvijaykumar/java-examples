/**
 * 
 */
package org.pjay.app3;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string1 = "WelCome TO ";
		String string2 = "The WorLd oF LamBdas!";
		String upperCase = null;
		String lowerCase = null;
		
		// Without Lambdas
		/**
			upperCase = upperOrLowerConcatStrings(new UpperConcatString() {
				
				@Override
				public String upperCaseConcatStrings(String str1, String str2) {
					return str1.toUpperCase() + str2.toUpperCase();
				}
			}, string1, string2);
			
			System.out.println("Upper Concat String:: " + upperCase);
			
			lowerCase = upperOrLowerConcatStrings(new LowerConcatString() {
				
				@Override
				public String lowerCaseConcatStrings(String str1, String str2) {
					return str1.toLowerCase() + str2.toLowerCase();
				}
			}, string1, string2);
			
			System.out.println("Lower Concat String:: " + lowerCase);
		 */
		
		// Using Lambdas
		// Error: Syntax error on token "return", delete this token. return is taken care or inferred by compiler
		//UpperConcatString ucs = (String str1, String str2) -> (return str1.toUpperCase() + str2.toUpperCase());
		UpperConcatString ucs = (String str1, String str2) -> str1.toUpperCase() + str2.toUpperCase();
		upperCase = upperOrLowerConcatStrings(ucs, string1, string2);
		System.out.println("Upper Concat String:: " + upperCase);
		
		// Error: Multiple markers at this line
		// - Lambda expression's parameter string2 cannot redeclare another local variable defined in an enclosing scope.
		// - Lambda expression's parameter string1 cannot redeclare another local variable defined in an enclosing scope.
		//LowerConcatString lcs = (string1, string2) -> string1.toLowerCase()+string1.toLowerCase();
		LowerConcatString lcs = (str1, str2) -> str1.toLowerCase()+str2.toLowerCase();
		lowerCase = upperOrLowerConcatStrings(lcs, string1, string2);
		System.out.println("Lower Case String:: " + lowerCase);
		
		// Extra try without object
		System.out.println("Return by passing null as object:: " + upperOrLowerConcatStrings(null, string1, string2));
		
	}

	public static String upperOrLowerConcatStrings(UpperAndLowerCaseString upperAndLowerCaseString, String str1, String str2) {
		if(upperAndLowerCaseString instanceof UpperConcatString){
			return upperAndLowerCaseString.upperCaseConcatStrings(str1, str2);
		}else if(upperAndLowerCaseString instanceof LowerConcatString){
			return upperAndLowerCaseString.lowerCaseConcatStrings(str1, str2);
		}
		return "";
	}
}

// We cannot use this interface as function interface, because we need to have only one method unimplemented.
// Due to this we cannot write lambdas for this interface, as there are two methods to be implemented to make  it concrete class 
// Error: Invalid '@FunctionalInterface' annotation; UpperAndLowerCaseString is not a functional interface
//@FunctionalInterface
interface UpperAndLowerCaseString{
	String upperCaseConcatStrings(String str1, String str2);
	String lowerCaseConcatStrings(String str1, String str2);
}

// Not mandatory to use @FunctionalInterface annotation, but it still can be used as lambda expressions
//@FunctionalInterface
interface UpperConcatString extends UpperAndLowerCaseString{
	String upperCaseConcatStrings(String str1, String str2);
	
	// Feature from java 8, interfaces can have implementation default methods.
	// If some class overrides this method then that behavior will be considered.
	@Override
	default String lowerCaseConcatStrings(String str1, String str2) {
		//System.out.println(str1.toLowerCase() + str2.toLowerCase());
		return str1.toLowerCase() + str2.toLowerCase();
	}
}

@FunctionalInterface
interface LowerConcatString extends UpperAndLowerCaseString{
	
	// Feature from java 8, interfaces can have implementation default methods.
	// If some class overrides this method then that behavior will be considered.
	@Override
	default String upperCaseConcatStrings(String str1, String str2) {
		//System.out.println(str1.toUpperCase() + str2.toUpperCase());
		return str1.toUpperCase() + str2.toUpperCase();
	}
	
	String lowerCaseConcatStrings(String str1, String str2);
}