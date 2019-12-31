package com.hari;

import java.util.Optional;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class OptionaOrElseExample {

	/**
	 * orElse
	 */
	private static String orElseValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		return optionalEmployee.map(Employee::getName).orElse("Default");
	}

	private static String orElseInValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(null);
		return optionalEmployee.map(Employee::getName).orElse("Default");
	}

	/**
	 * orElseGet
	 */
	private static String orElseGetValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		return optionalEmployee.map(Employee::getName).orElseGet(() -> "Default");
	}

	private static String orElseGetInValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(null);
		return optionalEmployee.map(Employee::getName).orElseGet(() -> "Default");
	}

	/**
	 * orElseGet
	 */
	private static String orElseThrowValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		return optionalEmployee.map(Employee::getName).orElseThrow(() -> new RuntimeException("Exception"));
	}

	private static String orElseThrowInValid() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(null);
		return optionalEmployee.map(Employee::getName).orElseThrow(() -> new RuntimeException("Run time Exception"));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(orElseValid());
		System.out.println(orElseInValid());
		System.out.println(orElseGetValid());
		System.out.println(orElseGetInValid());
		System.out.println(orElseThrowValid());
		System.out.println(orElseThrowInValid());
	}
}
