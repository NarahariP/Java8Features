package com.hari;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamMapExample2 {

	static List<String> numberList = Arrays.asList("One", "Two", "Three", "Four", "Five");

	private static String converListIntoString() {
		return numberList.stream().collect(Collectors.joining(","));
	}

	private static String getAllEmployeeNamesAsString(List<Employee> employeeList) {
		return employeeList.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.joining(", "));
	}

	public static void main(String[] args) {
		System.out.println("Numbers in list format :: " + numberList);
		System.out.println("Numbers in Single String Format :: " + converListIntoString());
		System.out.println("Names form Object as Single String :: "
				+ getAllEmployeeNamesAsString(EmployeeService.getEmployeeList()));
	}

}
