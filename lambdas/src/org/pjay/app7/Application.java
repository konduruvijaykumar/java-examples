/**
 * 
 */
package org.pjay.app7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Employee john = new Employee("John Doe", 33);
		Employee vijay = new Employee("Vijay Konduru", 23);
		Employee andy = new Employee("Andy Labat", 41);
		Employee snow = new Employee("Snow White", 37);
		Employee tim = new Employee("Tim Buchalka", 28);
		Employee prince = new Employee("Price White", 39);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(tim);
		employees.add(snow);
		employees.add(andy);
		employees.add(vijay);
		employees.add(john);
		employees.add(prince);
		
		// Let's use Function<T, R> T - the type of the input to the function and R - the type of the result of the function
		
		Function<Employee, String> getFirstName = (employee) -> {
			return employee.getName().substring(0, employee.getName().indexOf(" "));
		};
		
		//System.out.println("First Name of john employee:: " + getFirstName.apply(john));
		
		Function<Employee, String> getLastName = (Employee employee) -> {
			return employee.getName().substring(employee.getName().indexOf(" ")+1);
		};
		
		//System.out.println("Last Name of snow employee:: " + getLastName.apply(snow));
		
		System.out.println("\nRandomly print first name and last name");
		Random random = new Random();
		for (Employee employee : employees) {
			if(random.nextBoolean()){
				System.out.println("First name::\t" + getAName(employee, getFirstName));
			}else{
				System.out.println("Last name::\t" + getAName(employee, getLastName));
			}
		}
		
		// Chaining functions
		Function<Employee, String> upperCaseName = employee -> employee.getName().toUpperCase();
		Function<String, String> upperCaseFirstName = name -> name.substring(0,name.indexOf(" "));
		
		// Verify other chaining function compose(.. before), this is reverse of below function. Inside compose function executes first and the other
		Function chainFunc = upperCaseName.andThen(upperCaseFirstName);
		System.out.println("\n" + "upperCaseName.andThen(upperCaseFirstName) Results:: " + chainFunc.apply(employees.get(0)));
		
		// BiFunctions takes three arguments T, U -- the type of the first, second argument to the function. R -- the type of the result of the function
		//BiFunction<String, Employee, String> concatAgeBiFunc = (String name, Employee employee) -> name.concat(" " + employee.getAge());
		/*
			BiFunction<String, Employee, String> concatAgeBiFunc = (String name, Employee employee) -> {
				return name.concat(" " + employee.getAge());
			};
		*/
		BiFunction<String, Employee, String> concatAgeBiFunc = (name, employee) -> name.concat(" " + employee.getAge());
		
		String upperCaseNameStr = upperCaseName.apply(employees.get(0));
		System.out.println("\n" + "concatAgeBiFunc results are:: " + concatAgeBiFunc.apply(upperCaseNameStr, employees.get(0)));
		
		// UinaryOperators takes one argument returns argument of input type. We chain this functions using andThen(), compose()
		IntUnaryOperator intUnaryOperator = k -> k+8;
		System.out.println("\n" + "intUnaryOperator Results:: " + intUnaryOperator.applyAsInt(8));
		
		// Consumer demo. This does not return value, hence while chaining consumer other consumer works on argument passed. As there is no return from other consumer
		//Consumer<String> upperCaseConsumer = name -> name.toUpperCase();
		Consumer<String> upperCaseConsumer = name -> {
			//name.toUpperCase();
			// Lambda expression's local variable upperCaseName cannot redeclare another local variable defined in an enclosing scope.
			//String upperCaseName = name.toUpperCase();
			// Lambda expression's local variable upperCaseNameStr cannot redeclare another local variable defined in an enclosing scope.
			//String upperCaseNameStr = name.toUpperCase();
			String upCaseName = name.toUpperCase();
			System.out.println("\n"+"Value from upperCaseConsumer:: " + upCaseName);
			// Void methods cannot return a value
			//return upCaseName;
		};
		Consumer<String> printNameConsumer = name -> System.out.println("\n"+"Value from printNameConsumer:: " + name);
		// only one method present for Chaining "andThen()"
		upperCaseConsumer.andThen(printNameConsumer).accept("Hello World!");
	}
	
	private static String getAName(Employee emp, Function<Employee, String> nameFunction){
		return nameFunction.apply(emp);
	}

}
