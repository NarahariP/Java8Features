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
public class StreamExample {

	static Predicate<Employee> employeeDeptPredicate = (employee) -> employee.getDeptNo()>=5;
	static Predicate<Employee> employeeSalPredicate = (employee) -> employee.getSalInLaks()>=5.5;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Read employee name and knowntechs.
		 */
		Map<String, List<String>> employeeMap = EmployeeService.getEmployeeList().stream()
			.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap);
		
		/**
		 * Read employee name and knowntechs.
		 * filtering with deptno is greaterthan 5
		 */
		Map<String, List<String>> employeeMap2 = EmployeeService.getEmployeeList().stream()
			.filter(employee -> employee.getDeptNo()>=5)
			.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap2);
		
		/**
		 * Read employee name and knowntechs.
		 * filtering with deptno is greaterthan 5
		 * seperate the predicate condition
		 */
		Map<String, List<String>> employeeMap3 = EmployeeService.getEmployeeList().stream()
			.filter(employeeDeptPredicate)
			.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap3);
		
		/**
		 * Read employee name and knowntechs.
		 * filtering with deptno is greaterthan 5 and salary is greater than 5.5
		 */
		Map<String, List<String>> employeeMap4 = EmployeeService.getEmployeeList().stream()
			.filter(employeeDeptPredicate)
			.filter(employeeSalPredicate)
			.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap4);
		
		Map<String, List<String>> employeeMap5 = EmployeeService.getEmployeeList().stream()
				.filter(employeeDeptPredicate.and(employeeSalPredicate))
				.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
			System.out.println(employeeMap5);
			
		/**
		 * parallelStream()
		 * Read employee name and knowntechs.
		 * filtering with deptno is greaterthan 5 and salary is greater than 5.5
		 */
		Map<String, List<String>> employeeMap6 = EmployeeService.getEmployeeList().parallelStream()
			.filter(employeeDeptPredicate)
			.filter(employeeSalPredicate)
			.collect(Collectors.toMap(Employee::getName, Employee::getKnowTechs));
		System.out.println(employeeMap6);
	
		/**
		 * Remove skipping particular item from the list based on condition 
		 */
		Predicate<Employee> employeePredicate  = employee ->employee.getId()!=5;
		List<Employee> empList = EmployeeService.getEmployeeList().stream().filter(employeePredicate::test).collect(Collectors.toList());
		System.out.println(empList);
		
		/**
		 * Remove Item by using removeIf() 
		 * UnsupportedOperationException - elements
		 * cannot be removed from this collection. Implementations throw
		 * exception if a matching element cannot be removed or if, in general, removal
		 * is not supported.
		 */
		List<Employee> originalEmployeeList = EmployeeService.getEmployeeList();
		System.out.println(originalEmployeeList);
		Predicate<Employee> employeePredicate2  = employee ->employee.getId()==1;
		boolean flag = originalEmployeeList.removeIf(emp -> employeePredicate2.test(emp));
		System.out.println(flag);
		System.out.println(originalEmployeeList);
		
	}
}
