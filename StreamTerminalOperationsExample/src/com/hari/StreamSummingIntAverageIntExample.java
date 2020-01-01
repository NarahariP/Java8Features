package com.hari;

import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamSummingIntAverageIntExample {

	private static int summingInt() {
		return EmployeeService.getEmployeeList().stream().collect(Collectors.summingInt(Employee::getDeptNo));
	}

	private static double summingDouble() {
		return EmployeeService.getEmployeeList().stream().collect(Collectors.summingDouble(Employee::getSalInLaks));
	}

	private static double averageDouble() {
		return EmployeeService.getEmployeeList().stream().collect(Collectors.averagingDouble(Employee::getSalInLaks));
	}

	private static double averageInt() {
		return EmployeeService.getEmployeeList().stream().collect(Collectors.averagingInt(Employee::getDeptNo));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(summingInt());
		System.out.println(summingDouble());
		System.out.println(averageDouble());
		System.out.println(averageInt());
	}

}
