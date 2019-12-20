package com.hari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class StreamReduceExample {

	/**
	 * @param integerList
	 * @return
	 */
	private static Optional<Integer> multipleUsingStreamReduceWithOutIdentity(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a * b);
	}

	/**
	 * @param integerList
	 * @return
	 */
	private static int multipleUsingStreamReduceWithIdentity(List<Integer> integerList) {
		return integerList.stream()
				/**
				 * Initially a=1 (Identity) b= 1 (from stream) return result = 1*1 = 1 Initially
				 * a=1 (result) b= 3 (from stream) return result = 1*3 = 3 Initially a=3
				 * (result) b= 8 (from stream) return result = 3*8 = 24 ....
				 */
				.reduce(1, (a, b) -> a * b);
	}

	private static Optional<Employee> getHighestSalaryEmployee() {
		return EmployeeService.getEmployeeList().stream() // Employees one by one
				.reduce((employee1, employee2) -> employee1.getSalInLaks() > employee2.getSalInLaks() ? employee1
						: employee2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final List<Integer> integerList = Arrays.asList(1, 3, 8, 5, 5);
		final List<Integer> integerEmptyList = new ArrayList<>();
		final Optional<Integer> optionalResult = multipleUsingStreamReduceWithOutIdentity(integerList);
		System.out.println(optionalResult.isPresent());
		if (optionalResult.isPresent()) {
			System.out.println("Result:: " + optionalResult.get());
		}
		System.out.println(multipleUsingStreamReduceWithIdentity(integerList));
		final Optional<Integer> optionalResult1 = multipleUsingStreamReduceWithOutIdentity(integerEmptyList);
		System.out.println(optionalResult1.isPresent());
		if (optionalResult1.isPresent()) {
			System.out.println("Result:: " + optionalResult1.get());
		}

		System.out.println("Highest Salary Emeployee:: ");
		final Optional<Employee> employeeOptional = getHighestSalaryEmployee();
		if (employeeOptional.isPresent()) {
			System.out.println(employeeOptional);
		}
	}

}
