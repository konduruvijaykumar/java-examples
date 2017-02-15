/**
 * 
 */
package org.pjay.app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		List<Employee> employees = new ArrayList<>();
		employees.add(tim);
		employees.add(snow);
		employees.add(andy);
		employees.add(vijay);
		employees.add(john);
		
		// Using Anonymous class sorting.
		// https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
		/**
			Collections.sort(employees, new Comparator<Employee>() {
	
				@Override
				public int compare(Employee emp1, Employee emp2) {
					//return emp1.getAge().compareTo(emp2.getAge());
					return emp1.getName().compareTo(emp2.getName());
				}
				
			});
		 */
		
		// Lets use Lambdas
		//Collections.sort(employees, (Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName()));
		Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
		
		for (Employee employee : employees) {
			System.out.println("Name:: " + employee.getName() + "\t Age:: " + employee.getAge());
		}
	}

}

class Employee{
	private String name;
	private Integer age;
	
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
