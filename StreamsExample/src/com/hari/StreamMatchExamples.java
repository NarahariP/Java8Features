package com.hari;

import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamMatchExamples {

	/**
	 * @return true if any one of the element matches the predicate otherwise false
	 */
	private static boolean anyMatch() {
		return EmployeeService.getEmployeeList().stream().anyMatch(employee -> employee.getSalInLaks() >= 12.1);
	}

	/**
	 * @return true if any all the element matches the predicate otherwise false
	 */
	private static boolean allMatchFalseCondition() {
		return EmployeeService.getEmployeeList().stream().allMatch(employee -> employee.getSalInLaks() >= 10.5);
	}

	private static boolean allMatchTrueCondition() {
		return EmployeeService.getEmployeeList().stream().allMatch(employee -> employee.getSalInLaks() >= 4.6);
	}

	/**
	 * @return true if any none of the element matches the predicate otherwise false
	 *         its opposite to allMatch
	 */
	private static boolean noneMatchTrueCondition() {
		return EmployeeService.getEmployeeList().stream().noneMatch(employee -> employee.getSalInLaks() >= 13);
	}

	private static boolean noneMatchFalseCondition() {
		return EmployeeService.getEmployeeList().stream().noneMatch(employee -> employee.getSalInLaks() >= 10.5);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Result of anyMatch :: " + anyMatch());
		System.out.println("Result of allMatch as false:: " + allMatchFalseCondition());
		System.out.println("Result of allMatch as true:: " + allMatchTrueCondition());
		System.out.println("Result of noneMatch as true:: " + noneMatchTrueCondition());
		System.out.println("Result of noneMatch as false:: " + noneMatchFalseCondition());
	}

}
