package com.hari;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class BiFunctionalExample {
	
	static Predicate<Employee> predicate = (employee) -> employee.getDeptNo() >=5;
	
	static BiFunction<List<Employee>, Predicate<Employee>, Map<String, Double>> biFunction = (employees, employeePredicate) ->{
		Map<String, Double> employeeMap = new HashMap<>();
		employees.forEach( employee ->{
			if(employeePredicate.test(employee)) {
				employeeMap.put(employee.getName(), employee.getSalInLaks());
			}
		});
		return employeeMap;
		
	};
	
	public static void main(String[] args) {
		System.out.println("BiFunctional output1: "+biFunction.apply(EmployeeService.getEmployeeList(), (employee) -> employee.getDeptNo() >=5));
		System.out.println("BiFunctional output2: "+biFunction.apply(EmployeeService.getEmployeeList(), predicate));
	}

}
