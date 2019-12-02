package com.hari;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class FunctionExample {
	
	static Function<String, String> function = (name) ->name.toUpperCase();
	
	static Function<String, String> concatFunction = (name) -> name.toUpperCase().concat("java");

	static Predicate<Employee> predicate1 = (employee) -> employee.getDeptNo() >= 5; 
	
	static Function<List<Employee>, Map<String, Double>> employeeFunction = (employeess -> {
		Map<String, Double> employeeInfo = new HashMap<>();
		employeess.forEach((employee -> {
			if(predicate1.test(employee)) {
				employeeInfo.put(employee.getName(), employee.getSalInLaks());
			}
		}));
		return employeeInfo;
	});
	
	public static String performConcat(String string) {
		return concatFunction.apply(string);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Function Example: "+function.apply("hari"));
		System.out.println("Function Concat Example :"+function.andThen(concatFunction).apply("hari "));// Function chaining - Executes like 1.function then concatFunction
		System.out.println("Function Concat Example :"+function.compose(concatFunction).apply("hari "));// Function Chaining - Executes like 1.concatFunction then fucntion 
		System.out.println(employeeFunction.apply(EmployeeService.getEmployeeList()));
		
		String outputString = performConcat("test ");
		System.out.println("Output String :"+outputString);
		
		
	}
}
