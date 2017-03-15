/**
 * 
 */
package org.pjay.varargs;

import org.pjay.util.Employee;

/**
 * @author vijayk
 *
 */
//https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
//http://stackoverflow.com/questions/3158730/java-3-dots-in-parameters
//http://stackoverflow.com/questions/965690/java-optional-parameters
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		App1 app1 = new App1();
		
		app1.displayDataMetod1(1, 5, 8, 9, 0);
		
		app1.displayDataMethod2("abc", 5, "nope", 8.5f, "test", 900.89d, 5.6f, "C", 6);
		
		String[] names = {"abc", "bca", "cda"};
		app1.displayNames("Vijay", 143, names);
		
		app1.displayNames("Vijay", 1345, "abc", "bca", "cda", "ON", "US");
		
		Employee employees[] = {new Employee("Vijay Konduru", 28), new Employee("PJay", 16)};
		app1.displayEmployees("PJay", 1234, employees);
		
		app1.displayEmployees("Pjay", 345, new Employee("Vijay Konduru", 28), new Employee("PJay", 16), new Employee("VJay", 24));
		
		if(null != args && args.length > 0){
			app1.displayDataMetod3(args);
		}
	}
	
	private void displayDataMetod1(int...ids) {
		System.out.println(" ================== displayDataMetod1(int...ids) ================ ");
		for (int i : ids) {
			System.out.println("displayDataMetod1(int...ids) values:: " + i);
		}
	}
	
	private void displayDataMethod2(Object... objects) {
		System.out.println(" ================== displayDataMethod2(Object... objects) ================ ");
		for (Object object : objects) {
			System.out.println("displayDataMethod2(Object... objects) values:: " + object);
		}
	}
	
	// Error - The variable argument type String of the method displayNames must be the last parameter
	// private void displayNames(String passerName, int passerId, String... names, String someVar) 
	private void displayNames(String passerName, int passerId, String... names) {
		System.out.println(" ================== displayNames(String passerName, int passerId, String... names) ================ ");
		System.out.println("passerName:: " + passerName);
		System.out.println("passerId:: " + passerId);
		for (String value : names) {
			System.out.println("value:: " + value);
		}
	}
	
	//Error - The variable argument type Employee of the method displayEmployees must be the last parameter
	//private void displayEmployees(String passerName, int passerId, Employee...employees, String someVar)
	private void displayEmployees(String passerName, int passerId, Employee...employees) {
		System.out.println(" ================== displayEmployees(String passerName, int passerId, Employee...employees) ================ ");
		System.out.println("passerName:: " + passerName);
		System.out.println("passerId:: " + passerId);
		for (Employee employee : employees) {
			System.out.println("employee values:: " + employee);
		}
	}
	
	private void displayDataMetod3(String... strings) {
		System.out.println(" ================== displayDataMetod3(String... strings) ================ ");
		for (String value : strings) {
			System.out.println("displayDataMetod3(String... strings)s values:: " + value);
		}
	}

}
