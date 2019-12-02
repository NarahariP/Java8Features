package com.hari;

import java.util.List;
import java.util.function.Supplier;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello";
		System.out.println("Supplier Example: "+supplier.get());
		Supplier<List<Employee>> employeeSupplier = () -> EmployeeService.getEmployeeList();
		System.out.println("Supplier :" +employeeSupplier.get());
		
	}
}
