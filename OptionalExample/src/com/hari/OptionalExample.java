package com.hari;

import java.util.Optional;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class OptionalExample {

	private static String getEmployeeNameWithMultipleNullChecks1() {
		final Employee employee = EmployeeService.employeeSupplier.get();
		if (employee != null) {
			return employee.getName(); // return String
		}
		return null;
	}

	@SuppressWarnings("unused")
	private static String getEmployeeNameWithMultipleNullChecks2() {
		final Employee employee = null;
		if (employee != null) {
			return employee.getName(); // return String
		}
		return null;
	}

	private static Optional<String> getEmployeeNameWithOutMultipleNullChecks1() {
		final Optional<Employee> optioanlEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		if (optioanlEmployee.isPresent()) {
			return optioanlEmployee.map(Employee::getName); // return Optional<String>
		}
		return Optional.empty();
	}

	private static Optional<String> getEmployeeNameWithOutMultipleNullChecks2() {
		final Optional<Employee> optioanlEmployee = Optional.ofNullable(null);
		if (optioanlEmployee.isPresent()) {
			return optioanlEmployee.map(Employee::getName); // return Optional<String>
		}
		return Optional.empty();
	}

	/**
	 * @param args -> Avoiding many null checks.
	 */
	public static void main(String[] args) {

		/**
		 * In this method we have we have multiple null checks to read only property,
		 * just assume if we are reading multiple values from object we need several
		 * null checks this we are avoiding by using Optional in second method
		 */
		final String employeeName1 = getEmployeeNameWithMultipleNullChecks1();
		if (employeeName1 != null) {
			System.out.println("Employee Name :: " + employeeName1);
		} else {
			System.out.println("Employee Name not Found!");
		}

		final String employeeName2 = getEmployeeNameWithMultipleNullChecks2();
		if (employeeName2 != null) {
			System.out.println("Employee Name :: " + employeeName2);
		} else {
			System.out.println("Employee Name not Found!");
		}

		final Optional<String> optionalName1 = getEmployeeNameWithOutMultipleNullChecks1();
		if (optionalName1.isPresent()) {
			System.out.println("Employee Name :: " + optionalName1.get());
		} else {
			System.out.println("Employee Name not found!");
		}

		final Optional<String> optionalName2 = getEmployeeNameWithOutMultipleNullChecks2();
		if (optionalName2.isPresent()) {
			System.out.println("Employee Name :: " + optionalName2.get());
		} else {
			System.out.println("Employee Name not found!");
		}
	}
}
