package com.hari;

import java.util.Optional;

import com.hari.model.Bike;
import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class OptionalMapFlatMapFilterExample {

	/**
	 * filter
	 */
	/**
	 * This will print employee value
	 */
	private static void optionalFilterTrueCondiftion() {
		Optional.ofNullable(EmployeeService.employeeSupplier.get()).filter(employee -> employee.getSalInLaks() > 3.5)
				.ifPresent(employee -> System.out.println(employee));
	}

	/**
	 * Here nothing will be printed, because filter condition is failed
	 */
	private static void optionalFilterFalseCondiftion() {
		Optional.ofNullable(EmployeeService.employeeSupplier.get()).filter(employee -> employee.getSalInLaks() > 7.5)
				.ifPresent(employee -> System.out.println(employee));
	}

	/**
	 * map
	 */

	private static void mapTrueCondition() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		if (optionalEmployee.isPresent()) {
			System.out.println(
					optionalEmployee.filter(employee -> employee.getSalInLaks() > 3.5).map(Employee::getName).get());

		}
	}

	private static void mapFalseCondition() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		if (optionalEmployee.isPresent()) {
			final Optional<String> optionalName = optionalEmployee.filter(employee -> employee.getSalInLaks() > 7.5)
					.map(Employee::getName);
			if (optionalName.isPresent()) {
				System.out.println(optionalName.get());
			}

		}
	}

	/**
	 * flatMap
	 */
	public static void flatMap() {
		final Optional<Employee> optionalEmployee = Optional.ofNullable(EmployeeService.employeeSupplier.get());
		final Optional<String> optionalBikeName = optionalEmployee.filter(employee -> employee.getSalInLaks() >= 3.5) // return -> Optional<Employee<Optional<Bike>>>
				.flatMap(Employee::getOptionaBike) // return -> Optional<Bike>
				.map(Bike::getName); // return -> Optional<String>
		if (optionalBikeName.isPresent()) {
			System.out.println(optionalBikeName.get());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		optionalFilterTrueCondiftion();
		optionalFilterFalseCondiftion();
		mapTrueCondition();
		mapFalseCondition();
		flatMap();
	}

}
