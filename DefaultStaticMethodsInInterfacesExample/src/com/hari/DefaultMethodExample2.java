package com.hari;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class DefaultMethodExample2 {

	static Consumer<Employee> employeeConsumer = employee -> System.out.println(employee);
	static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
	static Comparator<Employee> deptComparator = Comparator.comparing(Employee::getDeptNo);

	private static void sortByName(List<Employee> employeeList) {
		System.out.println("Sort - sortByName");
		employeeList.sort(nameComparator);
		employeeList.forEach(employeeConsumer);
	}

	private static void sortByDeptNo(List<Employee> employeeList) {
		System.out.println("Sort - sortByDeptNo");
		employeeList.sort(deptComparator);
		employeeList.forEach(employeeConsumer);
	}

	private static void sortByComparatorChaining(List<Employee> employeeList) {
		System.out.println("Sort - sortByComparatorChaining");
		employeeList.sort(deptComparator.thenComparing(nameComparator));
		employeeList.forEach(employeeConsumer);
	}

	private static void sortByNameWithNull(List<Employee> employeeList) {
		System.out.println("Sort - sortByNameWithNull : Here null values is goind to be dispalyes as first");
		final Comparator<Employee> nullNameComparator = Comparator.nullsFirst(nameComparator);
		employeeList.sort(nullNameComparator);
		employeeList.forEach(employeeConsumer);
	}

	private static void sortByNameWithNull2(List<Employee> employeeList) {
		System.out.println("Sort - sortByNameWithNull : Here null values is goind to be dispalyes as last");
		final Comparator<Employee> nullNameComparator = Comparator.nullsLast(nameComparator);
		employeeList.sort(nullNameComparator);
		employeeList.forEach(employeeConsumer);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Before Sort");
		EmployeeService.getAllEmployees().forEach(employeeConsumer);
		sortByName(EmployeeService.getAllEmployees());
		sortByDeptNo(EmployeeService.getAllEmployees());
		sortByComparatorChaining(EmployeeService.getAllEmployees());
		/** With null values - here we get NPE */
		// sortByName(EmployeeService.getAllEmployeesWithNull());

		/**
		 * To avoid NPE
		 */
		sortByNameWithNull(EmployeeService.getAllEmployeesWithNull());
		sortByNameWithNull2(EmployeeService.getAllEmployeesWithNull());
	}
}
