package com.hari;

import static java.util.stream.Collectors.joining;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamJoiningExample {

	private static String getEmployeeNames1() {
		return EmployeeService.getEmployeeList().stream().map(Employee::getName).collect(joining());
	}

	private static String getEmployeeNames2() {
		return EmployeeService.getEmployeeList().stream().map(Employee::getName).collect(joining("-"));
	}

	private static String getEmployeeNames3() {
		return EmployeeService.getEmployeeList().stream().map(Employee::getName).collect(joining("-", "(", ")"));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getEmployeeNames1());
		System.out.println(getEmployeeNames2());
		System.out.println(getEmployeeNames3());
	}
}
