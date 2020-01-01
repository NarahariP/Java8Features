package com.hari;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamPartitioningByExample {

	static Predicate<Employee> salPredicate = employee -> employee.getSalInLaks() >= 7.5;

	private static void partitioningBy1() {
		final Map<Boolean, List<Employee>> partitionEmployee = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.partitioningBy(salPredicate));
		System.out.println(partitionEmployee);
	}

	/**
	 * passing downstream
	 */
	private static void partitioningBy2() {
		final Map<Boolean, Set<Employee>> partitionEmployee = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.partitioningBy(salPredicate, Collectors.toSet()));
		System.out.println(partitionEmployee);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		partitioningBy1();
		partitioningBy2();
	}
}
