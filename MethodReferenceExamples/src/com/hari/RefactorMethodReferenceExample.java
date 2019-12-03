package com.hari;

import java.util.function.Predicate;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class RefactorMethodReferenceExample {

	static Predicate<Employee> employeeLambda = (employee) ->employee.getDeptNo()>=5;
	
	static Predicate<Employee> employeeMethodReference = RefactorMethodReferenceExample::validateDeptNo;
	
	public static boolean validateDeptNo(Employee employee) {
		return employee.getDeptNo()>=5;
	}
	
	public static void main(String[] args) {
		System.out.println(employeeLambda.test(EmployeeService.employeeSupplier.get()));
		
		System.out.println(employeeMethodReference.test(EmployeeService.employeeSupplier.get()));
	}
	
}
