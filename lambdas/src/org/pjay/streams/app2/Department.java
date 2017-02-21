/**
 * 
 */
package org.pjay.streams.app2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vijayk
 *
 */
public class Department {
	
	private String name;
	private List<Employee> employees;
	
	public Department(String deptName) {
		name = deptName;
		employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public String getName() {
		return name;
	}

}
