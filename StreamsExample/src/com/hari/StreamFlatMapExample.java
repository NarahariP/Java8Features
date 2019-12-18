package com.hari;

import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamFlatMapExample {

	public static List<String> employeeKnownTechs() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getKnowTechs) // return Stream<List<Employee>>
				.flatMap(List::stream) // return Stream<String>
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(employeeKnownTechs());
	}
}
