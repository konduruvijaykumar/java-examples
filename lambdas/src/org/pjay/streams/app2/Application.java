/**
 * 
 */
package org.pjay.streams.app2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
		
		Employee john = new Employee("John Doe", 33);
		Employee vijay = new Employee("Vijay Konduru", 23);
		Employee andy = new Employee("Andy Labat", 41);
		Employee snow = new Employee("Snow White", 37);
		Employee tim = new Employee("Tim Buchalka", 28);
		Employee prince = new Employee("Price White", 39);
		Employee pvjay = new Employee("Pjay Vjay", 23);
		
		Department hr = new Department("Human Resources");
		hr.addEmployee(andy);
		hr.addEmployee(prince);
		hr.addEmployee(tim);
		hr.addEmployee(john);
		hr.addEmployee(pvjay);
		
		Department accounting = new Department("Accounts");
		accounting.addEmployee(vijay);
		accounting.addEmployee(snow);
		
		List<Department> departments = new ArrayList<>();
		departments.add(hr);
		departments.add(accounting);
		
		// Lambda expression's parameter departments cannot redeclare another local variable defined in an enclosing scope.
		// System print will depend on Override of toString() method in employee Object. If not default will be executed from Object class
		// Used for converting a steam object into its containing or has a collection objects stream. This operation cannot be used to save data
		departments.stream().flatMap(departmentlist -> departmentlist.getEmployees().stream()).forEach(System.out::println);
		
		// Lets try collect() for saving data into our variables, instead of just printing data like above
		// Syntax error on token "startsWith", AssignmentOperator expected after this token "String::startsWith("G")" cannot use methods with parameters
		/*
			List<String> sortedSomeNumbers = someNumbers
												.stream()
												.map(String::toUpperCase)
												.filter(s -> s.startsWith("G"))
												.sorted()
												.collect(Collectors.toList());
		*/
		
		// There are two types of collect methods with different arguments, please verify documentation
		// We use other function to build output as specific object like array list
		List<String> sortedSomeNumbers = someNumbers
				.stream()
				.map(String::toUpperCase)
				.filter(s -> s.startsWith("G"))
				.sorted()
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		System.out.println("=============== sortedSomeNumbers ===============");
		for (String string : sortedSomeNumbers) {
			System.out.println("sortedSomeNumbers:: \t" + string);
		}
		
		Map<Integer, List<Employee>> groupByAgeMap = departments
														.stream()
														.flatMap(departmentlist -> departmentlist.getEmployees().stream())
														.collect(Collectors.groupingBy(employee -> employee.getAge()));
		
		for (Integer keyAge : groupByAgeMap.keySet()) {
			System.out.println("\nkeyAge value in groupByAgeMap:: \t" + keyAge);
			groupByAgeMap.get(keyAge).forEach(employee -> {
				System.out.println("Employee info in groupByAgeMap:: \t" + employee.toString());
			});
		}
		
		// Lets use reduce method in streams, as there are two employees with same age any one is returned. To get reverse use "(e1, e2) -> e1.getAge()>e2.getAge()?e2:e1"
		System.out.println("\n=============== Use Reduce Method ==============");
		departments.stream()
					.flatMap(departmentlist -> departmentlist.getEmployees().stream())
					.reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1:e2)
					.ifPresent(System.out::println);
		
		// Stream operations are lazily operated. When lambda operations does not have any terminal operation the that lambda will not get executed
		// When we do operations on input stream and never use the output or do a terminal operation then lambda snippet is never executed
		System.out.println("\n================= Stream.of() =================");
		// No output as there is no terminal operation
		/*
			Stream.of("ABC","CDA","SRD","CC","MDM","NC","CCCC","AC","BCA").filter(s -> {
				System.out.println("String value in Stream.of() operation:: " + s);
				return s.length() == 3;
			});
		*/
		
		/*
			Stream.of("ABC","CDA","SRD","CC","MDM","NC","CCCC","AC","BCA").filter(s -> {
				System.out.println("String value in Stream.of() operation:: " + s);
				return s.length() == 3;
			}).distinct().forEach(System.out::println);
		*/
		Stream.of("ABC","CDA","SRD","CC","MDM","NC","CCCC","AC","BCA").filter(s -> {
			System.out.println("String value in Stream.of() operation:: " + s);
			return s.length() == 3;
		}).count();
	}

}
