package com.hari;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamMappingExample {

	private static List<String> mapping() {
		return EmployeeService.getEmployeeList().stream()
				.collect(Collectors.mapping(Employee::getName, Collectors.toList()));
	}

	private static Set<String> mappingSet() {
		return EmployeeService.getEmployeeList().stream()
				.collect(Collectors.mapping(Employee::getName, Collectors.toSet()));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Name List :: " + mapping());
		System.out.println("Name Set :: " + mappingSet());
	}
}
