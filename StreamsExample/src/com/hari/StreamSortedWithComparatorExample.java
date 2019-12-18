package com.hari;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamSortedWithComparatorExample {

	/**
	 * @return
	 */
	public static List<Employee> sortEmployeesByName() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.sorted(Comparator.comparing(Employee::getName)) // Return sorting List of Employees by Name
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public static List<Employee> sortEmployeesByNameReverseOrder() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.sorted(Comparator.comparing(Employee::getName).reversed()) // Return sorting List of Employees by Name
																			// in reverse order
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public static List<Employee> sortEmployeesBySal() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.sorted(Comparator.comparing(Employee::getSalInLaks)) // Return sorting List of Employees by Salary
				.collect(Collectors.toList());
	}

	/**
	 * @return
	 */
	public static List<Employee> sortEmployeesBySalReverseOrder() {
		return EmployeeService.getEmployeeList().stream() // return Stream<Employee>
				.sorted(Comparator.comparing(Employee::getSalInLaks).reversed()) // Return sorting List of Employees by
																					// Salary in reverse order
				.collect(Collectors.toList());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sorting Employees By Name::");
		sortEmployeesByName().forEach(System.out::println);
		System.out.println("Sorting Employees By Name in reverse order::");
		sortEmployeesByNameReverseOrder().forEach(System.out::println);
		System.out.println("Sorting Employees By Salary::");
		sortEmployeesBySal().forEach(System.out::println);
		System.out.println("Sorting Employees By Salary in reverse Order::");
		sortEmployeesBySalReverseOrder().forEach(System.out::println);
	}
}
