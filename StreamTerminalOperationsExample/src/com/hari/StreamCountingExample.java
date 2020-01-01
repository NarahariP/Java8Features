package com.hari;

import java.util.stream.Collectors;

import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamCountingExample {

	private static Long countEmployees() {
		return EmployeeService.getEmployeeList().stream().collect(Collectors.counting());
	}

	private static Long countEmployeesWithFilter() {
		return EmployeeService.getEmployeeList().stream().filter(employee -> employee.getSalInLaks() >= 5.0)
				.collect(Collectors.counting());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Total Employess :: " + countEmployees());
		System.out.println("Total Employess with filter :: " + countEmployeesWithFilter());
	}
}
