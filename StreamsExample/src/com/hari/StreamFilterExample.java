package com.hari;

import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamFilterExample {

	/**
	 * @return
	 */
	public static List<Employee> filterEmployees() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.filter(employee -> employee.getDeptNo() >= 5) // return Stream<Employee> but it will filter and return
																// who are belongs to deptNo >= 5
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public static List<Employee> multipleFilterEmployees() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.filter(employee -> employee.getDeptNo() >= 5) // return Stream<Employee> but it will filter and return
																// who are belongs to deptNo >= 5
				.filter(employee -> employee.getSalInLaks() >= 8) // return Stream<Employee> it will filter again who's
																	// salary is >= 8
																	// Like this we can add "n" number of filters
				.collect(Collectors.toList());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Filter Employees ::");
		filterEmployees().forEach(System.out::println);

		System.out.println("Multiple Filter Employees ::");
		multipleFilterEmployees().forEach(System.out::println);
	}
}
