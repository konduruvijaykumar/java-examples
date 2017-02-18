/**
 * 
 */
package org.pjay.app4;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnotherClass anotherClass = new AnotherClass();
		String s = anotherClass.doStringStuff();
		System.out.println("\nString is:: " + s);
		SecondClass secondClass = new SecondClass();
		System.out.println("\nString value using doStringStuffAnonymous():: "+secondClass.doStringStuffAnonymous());
		System.out.println("\nString value using doStringStuffLambda():: "+secondClass.doStringStuffLambda());
	}

	static String doStringConcatination(UpperConcat upperConcat, String str1, String str2){
		return upperConcat.upperConcatStrings(str1, str2);
	}
}

interface UpperConcat{
	String upperConcatStrings(String str1, String str2);
}

class SecondClass{
	// Understanding scope in lambdas and anonymous inner classes
	
	String doStringStuffAnonymous(){
		//int i = 1;
		final int i = 1;
		UpperConcat uc  = new UpperConcat() {
			
			@Override
			public String upperConcatStrings(String str1, String str2) {
				// when we add any code to edit value of i, then we get error that variable should be final.
				// variable passed to anonymous inner classes, cannot be kept at sync for both classes by jvm, as anonymous inner class can pass it to some other classes then there can data discrepancy.
				// Hence only a copy is passed to anonymous classes. Making variable final makes sure that variable initialized is not changed and maintain consistency in data. 
				System.out.println("\n"+"i value in anonymous inner class:: " + i);
				// Local variable i defined in an enclosing scope must be final or effectively final
				// effectively final means been assigned value and not changed any where in flow, compiler understands it and takes care of it. if not it has to be declared final
				// if variables comes from external source to the method we have to declare as final for that variable. as it can changed else where which compiler might not get to know
				// if the variable is in same method and no modification done then it is effectively final, else we have to make it final
				// If we add final, the we get error "The final local variable i cannot be assigned, since it is defined in an enclosing type"
				// i++;
				return str1.toUpperCase()+str2.toUpperCase();
			}
		};
		return Application.doStringConcatination(uc, "AbC", "dEf");
	}
	
	String doStringStuffLambda(){
		int j = 1;
		//String str1 = "Vijay";// You get below error in lambda
		// Lambda expression's parameter str1 cannot redeclare another local variable defined in an enclosing scope.
		UpperConcat up = (str1, str2) -> {
			// Local variable j defined in an enclosing scope must be final or effectively final
			//j++;
			// IMP:  Similar rules as above variables used in lambda block of code must be final or effectively final.
			System.out.println("\n"+"j value in Lambda:: " + j);
			return str1.toUpperCase()+str2.toUpperCase();
		};
		// IMP: variable in lambda blocks are not accessible outside lambda block or cannot use the same variable name for new variable
		//System.out.println("str1 outside lambda" + str1);// str1 cannot be resolved as a variable
		// The below code clearly shows no impact on lambda block and lambda blocks are substituted with respective values when ever code block is executed 
		String str1 = "Vijay";
		System.out.println("\nnew str1 variable after lambda code block:: " + str1);
		return Application.doStringConcatination(up, "uVW", "XyZ");
	}
}

class AnotherClass{
	
	// We will try to check if Anonymous class is embedded as part of the class code or separate class
	// Similarly we will check for lambdas also
	String doStringStuff(){
		
		System.out.println("\nAnotherClass Name:: " + getClass().getName());
		System.out.println("\nAnotherClass Simple Name:: " + getClass().getSimpleName());

		// Not using lambdas
		/**
			return Application.doStringConcatination(new UpperConcat() {
	
				@Override
				public String upperConcatStrings(String str1, String str2) {
					// You can check in bin folder with corresponding package, you will find anther class org.pjay.app4.AnotherClass$1
					// Which means that anonymous inner class code is not nested in the same class, they form different classes with $1, $2...$n depending on number of anonymous inner classes you have
					System.out.println("\nAnonymous Class Name:: " + getClass().getName());
					//System.out.println("\nAnonymous Class Simple Name:: " + getClass().getSimpleName());// Simple name will not be printed
					return str1.toUpperCase() + str2.toUpperCase();
				}
			}, "WelCome TO ", "The WorLd oF LamBdas!");
		 */
		
		// Using Lambdas
		// We will try to check if Lambda code is embedded as part of the class code or separate class
		//return Application.doStringConcatination((str1, str2) -> str1.toUpperCase()+str2.toUpperCase(), "WelCome TO ", "The WorLd oF LamBdas!");
		return Application.doStringConcatination((str1, str2) -> {
			// Class name is org.pjay.app4.AnotherClass and simple name AnotherClass. This is the same class in which the coded is present, hence lambdas are embedded in the class
			// lambdas are like nested block of code with the same scope as the nested block
			System.out.println("\nInside Lambda Class Name:: " + getClass().getName());
			System.out.println("\nInside Lambda Class Name:: " + getClass().getSimpleName());
			return str1.toUpperCase()+str2.toUpperCase();
		}, "WelCome TO ", "The WorLd oF LamBdas!");
	}
	
	{
		// Initializer block of code for AnotherClass, this gets called after constructor is called
		System.out.println(" ::Inside initializer block of code for AnotherClass:: ");
//		System.out.println("\nAnotherClass Name:: " + getClass().getName());
//		System.out.println("\nAnotherClass Simple Name:: " + getClass().getSimpleName());
	}
}