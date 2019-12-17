package com.hari;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamMapExample {

	private static List<String> nameList() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getName) // return Stream<String> - its converting whole type
				.map(String::toUpperCase) // here it's not converting anything performing some operations
				.collect(toList());
	}

	private static Set<String> nameSet() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getName) // return Stream<String> - its converting whole type
				.map(String::toUpperCase) // here it's not converting anything performing some operations
				.collect(toSet());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nameList());
		System.out.println(nameSet());
	}
}
