package com.hari;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamGroupingByExample {

	/**
	 * Grouping Employees based on gender by using groupingBy(classifier)
	 */
	private static void grouppingByGender() {
		final Map<String, List<Employee>> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees into custom group names by using groupingBy(classifier)
	 */
	private static void customizedGrouppingBy() {
		final Map<String, List<Employee>> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(employee -> employee.getSalInLaks() >= 6.5 ? "Managers" : "Associates"));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees based on deptNo and within dept again grouping with custom
	 * group names by using groupingBy(classifier, downstream)
	 */
	private static void grouppingByGenderVersion2() {
		final Map<Integer, Map<String, List<Employee>>> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.groupingBy(employee -> employee.getSalInLaks() >= 6.5 ? "Managers" : "Associates")));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees by deptNo and calculating the total salary of the the
	 * group by using groupingBy(classifier, downstream)
	 */
	private static void grouppingByGenderVersion2_1() {
		final Map<Integer, Double> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.summingDouble(Employee::getSalInLaks)));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees by name and calculating the total salary of the the group
	 * by using groupingBy(classifier, downstream)
	 */
	private static void grouppingByGenderVersion2_2() {
		final Map<String, Double> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getName, Collectors.summingDouble(Employee::getSalInLaks)));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees by Name and changing the return type by passing mapFactory
	 * by using groupingBy(classifier, mapFactory, downstream)
	 */
	private static void grouppingByGenderVersion3() {
		final LinkedHashMap<String, Set<Employee>> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getName, LinkedHashMap::new, Collectors.toSet()));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees by deptno and finding highest paid employee from each
	 * group
	 */
	private static void getHighestSalaryEmployee() {
		final Map<Integer, Optional<Employee>> employeesGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.maxBy(Comparator.comparing(Employee::getSalInLaks))));
		System.out.println(employeesGroup);
	}

	/**
	 * Grouping Employees by deptno and finding highest paid employee from each
	 * group and avoiding Optional wrapper
	 */
	private static void getHighestSalaryEmployee2() {
		final Map<Integer, Employee> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Employee::getSalInLaks)), Optional::get)));
		System.out.println(employeeGroup);
	}

	/**
	 * Grouping Employees by deptno and finding least paid employee from each group
	 */
	private static void getLeastSalaryEmployee() {
		final Map<Integer, Optional<Employee>> employeesGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.minBy(Comparator.comparing(Employee::getSalInLaks))));
		System.out.println(employeesGroup);
	}

	/**
	 * Grouping Employees by deptno and finding least paid employee from each group
	 * and avoiding Optional wrapper
	 */
	private static void getLeastSalaryEmployee2() {
		final Map<Integer, Employee> employeeGroup = EmployeeService.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.collectingAndThen(
						Collectors.minBy(Comparator.comparing(Employee::getSalInLaks)), Optional::get)));
		System.out.println(employeeGroup);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		grouppingByGender();
		customizedGrouppingBy();
		grouppingByGenderVersion2();
		grouppingByGenderVersion2_1();
		grouppingByGenderVersion2_2();
		grouppingByGenderVersion3();
		getHighestSalaryEmployee();
		getHighestSalaryEmployee2();
		getLeastSalaryEmployee();
		getLeastSalaryEmployee2();
	}
}
