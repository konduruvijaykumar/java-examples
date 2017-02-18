/**
 * 
 */
package org.pjay.app6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
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
		
		/*
			employees.forEach(employee -> {
				System.out.println("\nEmp Name:: " + employee.getName());
				System.out.println("Emp Age:: " + employee.getAge());
			});
		*/
		
		// Print all employees greater than 30 age. First try normal way and then we will use lambdas
		/*
			for (Employee employee : employees) {
				if(employee.getAge() > 30){
					System.out.println("\nEmp Name with age > 30 is:: " + employee.getName());
				}
			}
		*/
		
		// With Lambda
		/*
			employees.forEach(employee -> {
				if(employee.getAge()>30){
					System.out.println("\nEmp Name with age > 30 is:: " + employee.getName());
				}
			});
			
			employees.forEach(employee -> {
				if(employee.getAge() <= 30){
					System.out.println("\nEmp Name with age <= 30 is:: " + employee.getName());
				}
			});
		*/
		
		// The only difference between two lambdas is if condition. Lets try to pass condition and work on it, there is a better way using Predicate conditions. Lets try
		printEmployeesByAge(employees, "Employee Age greater than 30", employee -> employee.getAge() > 30);
		printEmployeesByAge(employees, "Employee Age less than or eqaul to 30", employee -> employee.getAge()<=30);
		// This can be done with anonymous Predicate classes instead of lambda, let try it below
		printEmployeesByAge(employees, "Employee Age below 25", new Predicate<Employee>() {
			
			@Override
			public boolean test(Employee employee) {
				return employee.getAge()<25;
			}
		});
		
		// There are different types of predicates for different datatypes in java like integer, double etc. Use specific predicate for type of parameter you compare. This increases readability
		IntPredicate intPredicate = i -> i>40;
		System.out.println("\nIntPredicate >40 test with 45:: " + intPredicate.test(45));
		System.out.println("\nIntPredicate >40 test with 28:: " + intPredicate.test(28));
		int j = 33;
		System.out.println("\nIntPredicate >40 test with (j+8):: " + intPredicate.test(j+8));
		System.out.println("\nIntPredicate >40 test with (j+7):: " + intPredicate.test(j+7));
		// Error: The target type of this expression must be a functional interface
		//System.out.println("\nIntPredicate >20 test with 20:: " + (i -> i > 20).test(28));
		
		//Chaining predicates, supports Logical "AND (and), OR (or)" operations
		IntPredicate intPredGreaterThan15 = i->i>15;
		IntPredicate intPredLessThan100 = i -> i<100;
		System.out.println("\nintPredGreaterThan15.and(intPredLessThan100).test(50):: " + intPredGreaterThan15.and(intPredLessThan100).test(50));
		System.out.println("\nintPredGreaterThan15.and(intPredLessThan100).test(15):: " + intPredGreaterThan15.and(intPredLessThan100).test(15));
		System.out.println("\nintPredGreaterThan15.and(intPredLessThan100).test(100):: " + intPredGreaterThan15.and(intPredLessThan100).test(100));
		System.out.println("\nintPredGreaterThan15.and(intPredLessThan100).test(101):: " + intPredGreaterThan15.and(intPredLessThan100).test(101));
		
		/*
			Random random = new Random();
			System.out.println("\n============ Printing 10 Random Number ===========");
			for (int k = 0; k < 10; k++) {
				//System.out.println(random.nextInt());
				System.out.println(random.nextInt(500));
			}
		*/
		// Lets have a look at suppliers which has return data types. Different types of suppliers are available please verify
		Random random = new Random();
		Supplier<Integer> supplier = () -> random.nextInt(1000);
		System.out.println("\n============ Printing 10 Random Number ===========");
		for (int k = 0; k < 10; k++) {
			//System.out.println(random.nextInt(500));
			System.out.println(supplier.get());
		}
		
		// Print employees last name
		System.out.println("\n===== Last name of all employees =====");
		employees.forEach(employee -> {
			String lastName = employee.getName().substring(employee.getName().indexOf(" ") + 1);
			System.out.println("Employee Last Name:: " + lastName);
		});
	}
	
	private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
		System.out.println("\n"+ageText);
		System.out.println("=======================================");
		for (Employee employee : employees) {
			if(ageCondition.test(employee)){
				System.out.println("\nEmp Name:: " + employee.getName());
			}
		}
	}

}
