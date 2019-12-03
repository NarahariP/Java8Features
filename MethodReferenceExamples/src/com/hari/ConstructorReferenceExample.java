package com.hari;

import java.util.function.Function;
import java.util.function.Supplier;

import com.hari.model.Employee;

/**
 * @author Narahari
 *
 */
public class ConstructorReferenceExample{

	static Supplier<Employee> employeeSupplier = Employee::new; //we are creating an EMployee Object
	
	static Function<String, Employee> employeeFunction = Employee::new; // We are creating an Employee Object by passing name that means we need single parameter constructor is required in Employee class. 
	
	public static void main(String[] args) {
		System.out.println(employeeSupplier.get());
		
		System.out.println(employeeFunction.apply("hari"));
	}
}
