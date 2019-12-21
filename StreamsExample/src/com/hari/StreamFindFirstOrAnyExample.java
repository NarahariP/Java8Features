package com.hari;

import java.util.Optional;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamFindFirstOrAnyExample {

	/**
	 * @return it returns any object which is satisfy the given condition
	 */
	private static Optional<Employee> findAnyEmployee() {
		return EmployeeService.getEmployeeList().stream().filter(employee -> employee.getSalInLaks() >= 9.6).findAny();
	}

	/**
	 * @return it returns first object which is satisfy the given condition
	 */
	private static Optional<Employee> findFirstEmployee() {
		return EmployeeService.getEmployeeList().stream().filter(employee -> employee.getSalInLaks() >= 9.6)
				.findFirst();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Optional<Employee> findAnyEmployee = findAnyEmployee();
		if (findAnyEmployee.isPresent()) {
			System.out.println("Employee found:: " + findAnyEmployee.get());
		}
		final Optional<Employee> findFirstEmployee = findFirstEmployee();
		if (findFirstEmployee.isPresent()) {
			System.out.println("Employee found:: " + findFirstEmployee.get());
		}
	}
}
