package com.hari;

import java.util.List;
import java.util.function.Predicate;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class PredicateEmployeeExample {
	
	static Predicate<Employee> predicate1 = (employee) -> employee.getDeptNo() >= 5; 
	static Predicate<Employee> predicate2 = (employee) -> employee.getSalInLaks() >= 6.5; 
	
	static List<Employee> employeeList = EmployeeService.getEmployeeList();
	
	public static void filterEmplyeeByDeptNo() {
		System.out.println("filterEmplyeeByDeptNo : ");
		employeeList.forEach( employee -> {
			if(predicate1.test(employee)) {
				System.out.println(employee);
			}
		});
	}
	
	public static void filterEmployeeBySalInLaks() {
		System.out.println("filterEmployeeBySalInLaks :");
		employeeList.forEach( employee -> {
			if(predicate2.test(employee)) {
				System.out.println(employee);
			}
		});
	}
	
	public static void filterEmployeeByDeptNoAndSalInLaksAND() {
		System.out.println("filterEmployeeByDeptNoAndSalInLaksAND :");
		employeeList.forEach( employee -> {
			if(predicate1.and(predicate2).test(employee)) { // Predicate Chaining
				System.out.println(employee);
			}
		});
	}

	public static void filterEmployeeByDeptNoAndSalInLaksOR() {
		System.out.println("filterEmployeeByDeptNoAndSalInLaksOR :");
		employeeList.forEach( employee -> {
			if(predicate1.or(predicate2).test(employee)) { // Predicate Chaining
				System.out.println(employee);
			}
		});
	}
	
	public static void filterEmployeeByDeptNoAndSalInLaksNegate() {
		System.out.println("filterEmployeeByDeptNoAndSalInLaksNegate :");
		employeeList.forEach( employee -> {
			if(predicate1.or(predicate2).negate().test(employee)) { // Predicate Chaining
				System.out.println(employee);
			}
		});
	}
	
	public static void main(String[] args) {
		filterEmplyeeByDeptNo();
		filterEmployeeBySalInLaks();
		filterEmployeeByDeptNoAndSalInLaksAND();
		filterEmployeeByDeptNoAndSalInLaksOR();
		filterEmployeeByDeptNoAndSalInLaksNegate();
	}
	
}
