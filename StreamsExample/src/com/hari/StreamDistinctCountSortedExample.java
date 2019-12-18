package com.hari;

import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamDistinctCountSortedExample {

	/**
	 * @return
	 */
	public static List<String> employeeKnownTechsDistinct() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getKnowTechs) // return Stream<List<Employee>>
				.flatMap(List::stream) // return Stream<String>
				.distinct() // it will work like SQL distinct - return unique values
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public static long employeeKnownTechsCount() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getKnowTechs) // return Stream<List<Employee>>
				.flatMap(List::stream) // return Stream<String>
				.distinct() // it will work like SQL distinct - return unique values
				.count(); // return no of items
	}

	public static List<String> employeeKnownTechsSorted() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.map(Employee::getKnowTechs) // return Stream<List<Employee>>
				.flatMap(List::stream) // return Stream<String>
				.distinct() // it will work like SQL distinct - return unique values
				.sorted() // sort by alphabetical order
				.collect(Collectors.toList());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("employeeKnownTechsDistinct:: " + employeeKnownTechsDistinct());
		System.out.println("employeeKnownTechsCount:: " + employeeKnownTechsCount());
		System.out.println("employeeKnownTechsSorted:: " + employeeKnownTechsSorted());
	}
}
