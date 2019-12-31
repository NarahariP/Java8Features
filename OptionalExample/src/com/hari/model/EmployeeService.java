package com.hari.model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Narahari
 *
 */
public class EmployeeService {

	public static Supplier<Employee> employeeSupplier = () -> {
		final Bike bike = new Bike();
		bike.setName("ABCD");
		bike.setModel("Model");
		final Employee employee = new Employee(8, "Abc", 2, "Male", 5.6, Arrays.asList("Java", ".Net", "Oracle"));
		employee.setOptionalBike(Optional.ofNullable(bike));
		return employee;
	};

	/**
	 * @return List<Employee>
	 */
	public static List<Employee> getEmployeeList() {
		final Employee emp1 = new Employee(1, "Abc", 2, "Male", 5.6, Arrays.asList("Java", ".Net", "Oracle"));
		final Employee emp2 = new Employee(2, "Mno", 2, "FeMale", 9.5, Arrays.asList("Angular", "Python", "Oracle"));

		final Employee emp3 = new Employee(3, "UVW", 5, "Male", 4.6, Arrays.asList("Java", "HTML", "C++"));
		final Employee emp4 = new Employee(4, "GHI", 5, "FeMale", 12.1, Arrays.asList("HTML", ".Net", "MySQL"));

		final Employee emp5 = new Employee(5, "PQR", 7, "FeMale", 5.6, Arrays.asList(".Net", "C#", "SQL Server"));
		final Employee emp6 = new Employee(6, "XYZ", 7, "Male", 10.6, Arrays.asList("Java", ".Net", "Oracle"));

		final List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
		return employeeList;
	}
}
