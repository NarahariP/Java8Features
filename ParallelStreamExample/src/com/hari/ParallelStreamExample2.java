package com.hari;

import java.util.List;
import java.util.stream.Collectors;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class ParallelStreamExample2 {

	private static List<String> sequentialStreamGetAllKnowTechs() {
		final long startTime = System.currentTimeMillis();
		final List<String> listOfActivities = EmployeeService.getEmployeeList().stream().map(Employee::getKnowTechs)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		final long endTime = System.currentTimeMillis();
		System.out.println("Duration to Complete :: " + (endTime - startTime));
		return listOfActivities;
	}

	private static List<String> parallelStreamGetAllKnownTechs() {
		final long startTime = System.currentTimeMillis();
		final List<String> listOfActivities = EmployeeService.getEmployeeList().stream().map(Employee::getKnowTechs)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		final long endTime = System.currentTimeMillis();
		System.out.println("Duration to Complete :: " + (endTime - startTime));
		return listOfActivities;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sequentialStreamGetAllKnowTechs();
		parallelStreamGetAllKnownTechs();
	}
}
