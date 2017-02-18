/**
 * 
 */
package org.pjay.app5;

import java.util.ArrayList;
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
		
		AnotherClass anotherClass = new AnotherClass();
		
		for (Employee employee : employees) {
			System.out.println("\nEmp Name:: " + employee.getName());
			anotherClass.printValueInLambda(employee.getAge());
		}
		
		/**
			for (Employee employee : employees) {
				System.out.println("\nEmp Name:: " + employee.getName());
				System.out.println("\nEmp Age:: " + employee.getAge());
			}
		 */
		
		employees.forEach(employee -> {
			System.out.println("\nEmp Name:: " + employee.getName());
			System.out.println("Emp Age:: " + employee.getAge());
		});
		
		/**
			//Employee emp = null;
			for (int i = 0; i < employees.size(); i++) {
				Employee emp = employees.get(i);
				System.out.println("\nEmp Name:: " + emp.getName());
				new Thread(() -> {
					// Error: Local variable emp defined in an enclosing scope must be final or effectively final. If variable outside of for scope
					System.out.println("\nEmp Age:: " + emp.getAge());
				}).start();
			}
		 */
		
		anotherClass.printValueInLambda();
		System.out.println("\nmain() function execution ended");
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

class AnotherClass{
	void printValueInLambda(){
		int age = 25;
		Runnable run = () -> {
			try{
				Thread.sleep(10000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Though the method, main function exits still the lambda has age value and is passed values are passed to lambda block when ever it gets executed
			// We can verify this in debug mode put a debug point at our below print line out side lambda, but our sys out debug point activates or code executes only after delay provided
			System.out.println("\nage value in printValueInLambda() function thread:: " + age);
		};
		
		new Thread(run).start();
		
		System.out.println("\nprintValueInLambda() function execution ended");
	}
	
	void printValueInLambda(int age){
		Runnable run = () -> {
			try{
				Thread.sleep(4000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Though the method, main function exits still the lambda has age value and is passed values are passed to lambda block when ever it gets executed
			// We can verify this in debug mode put a debug point at our below print line out side lambda, but our sys out debug point activates or code executes only after delay provided
			System.out.println("\nage value in printValueInLambda(age) function thread:: " + age);
		};
		
		new Thread(run).start();
		
		System.out.println("\nprintValueInLambda(age) function execution ended");
	}
}
