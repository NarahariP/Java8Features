package com.hari;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamMapFilterReduceExample {

	/**
	 * @return
	 */
	private static Double getSalaryOfEmployeee() {
		return EmployeeService.getEmployeeList().stream() // retrrn Stream<Employee>
				.filter(employee -> employee.getDeptNo() >= 5) // Filter to get who's dept number >=5
				.filter(employee -> employee.getGender().equals("Male")) // again filter oon gender
				.map(Employee::getSalInLaks) // return Stream<Double>
				.reduce(0.0, (a, b) -> a + b); // .reduce(0.0, Double::sum); This is available in Java Api
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("getSalaryOfEmployeee:: " + getSalaryOfEmployeee());
	}
}
