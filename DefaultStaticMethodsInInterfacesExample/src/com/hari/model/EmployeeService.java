package com.hari.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

	static List<Employee> employeeList = new ArrayList<>();
	static List<Employee> employeeListWithNull = new ArrayList<>();

	static {
		final Employee employee1 = new Employee(1, "Java", 2, 5.7);
		final Employee employee2 = new Employee(2, "Spring", 8, 15.7);
		final Employee employee3 = new Employee(3, "Hibernate", 2, 4.7);
		final Employee employee4 = new Employee(4, "DevOops", 5, 8.7);
		final Employee employee5 = new Employee(5, "Angular", 8, 12.7);
		final Employee employee6 = new Employee(6, "WebService", 5, 5.7);
		employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6));
		employeeListWithNull
				.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, null));
	}

	public static List<Employee> getAllEmployees() {
		return employeeList;
	}

	public static List<Employee> getAllEmployeesWithNull() {
		return employeeListWithNull;
	}

}
