package com.hari.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author Narahari
 *
 */
public class EmployeeService {

	/**
	 * @return List<Employee>
	 */
	public static List<Employee> getEmployeeList() {
		Employee emp1 = new Employee("Abc", 2, "Male", 5.6, Arrays.asList("Java", ".Net", "Oracle"));
		Employee emp2 = new Employee("Mno", 2, "FeMale", 9.5, Arrays.asList("Angular", "Python", "Oracle"));
		
		Employee emp3 = new Employee("UVW", 5, "Male", 4.6, Arrays.asList("Java", "HTML", "C++"));
		Employee emp4 = new Employee("GHI", 5, "FeMale", 12.1, Arrays.asList("HTML", ".Net", "MySQL"));
		
		Employee emp5 = new Employee("PQR", 7, "FeMale", 5.6, Arrays.asList(".Net", "C#", "SQL Server"));
		Employee emp6 = new Employee("XYZ", 7, "Male", 10.6, Arrays.asList("Java", ".Net", "Oracle"));
		
		List<Employee> employeeList = Arrays.asList(emp1,emp2, emp3,emp4,emp5, emp6);
		return employeeList;
	}
}
