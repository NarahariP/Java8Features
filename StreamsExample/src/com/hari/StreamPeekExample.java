package com.hari;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamPeekExample {

	static Predicate<Employee> employeeDeptPredicate = (employee) -> employee.getDeptNo() >= 5;
	static Predicate<Employee> employeeSalPredicate = (employee) -> employee.getSalInLaks() >= 5.5;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Peck.
		 */
		final Map<String, List<String>> employeeMap = EmployeeService.getEmployeeList().stream()
				.peek(employee -> System.out.println(employee)).filter(employeeDeptPredicate)
				.peek(employee -> System.out.println("After 1st Filter:: " + employee)).filter(employeeSalPredicate)
				.peek(employee -> System.out.println("After 2nd Filter:: " + employee))
				.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap);
	}

}
