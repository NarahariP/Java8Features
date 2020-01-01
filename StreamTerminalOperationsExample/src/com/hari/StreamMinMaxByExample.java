package com.hari;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 */
public class StreamMinMaxByExample {

	/**
	 * @return -> This is Stream minBy Terminal Operation
	 */
	private static Optional<Employee> minBy() {
		return EmployeeService.getEmployeeList().stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalInLaks)));
	}

	/**
	 * @return -> this is Stream min operation but not Terminal Operation
	 */
	private static Optional<Employee> streamMin() {
		return EmployeeService.getEmployeeList().stream().min(Comparator.comparing(Employee::getSalInLaks));
	}

	/**
	 * @return -> This is Stream maxBy Terminal Operation
	 */
	private static Optional<Employee> maxBy() {
		return EmployeeService.getEmployeeList().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalInLaks)));
	}

	/**
	 * @return -> this is Stream max operation but not Terminal Operation
	 */
	private static Optional<Employee> streamMax() {
		return EmployeeService.getEmployeeList().stream().max(Comparator.comparing(Employee::getSalInLaks));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*******MIN***********");
		System.out.println(minBy().get());
		System.out.println(streamMin().get());
		System.out.println("*******MAX***********");
		System.out.println(maxBy().get());
		System.out.println(streamMax().get());
	}
}
