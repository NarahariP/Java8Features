package com.hari;

import java.util.List;
import java.util.function.BiConsumer;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class BiConsumerExample {
	
	static List<Employee> employeeList = EmployeeService.getEmployeeList();
	
	public static void test() {
		
		BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a : "+a +" ; b : "+b);
		biConsumer.accept("Hari", "P");
		
		BiConsumer<Integer, Integer> biConsumerMultiply = (a,b) -> System.out.println("Multiplication: " +a*b);
		BiConsumer<Integer, Integer> biConsumerDiv= (a,b) -> 		System.out.println("Division: "+a/b);
		biConsumerMultiply.andThen(biConsumerDiv).accept(10, 2);
	}
	
	public static void nameAndKnownTechs() {
		BiConsumer<String, List<String>> biConsumer = (name, kownTechs) ->{
			System.out.println(name +" : "+kownTechs);
		};
		employeeList.forEach( employee -> biConsumer.accept(employee.getName(), employee.getKnowTechs()));
	}
	
	public static void main(String[] args) {
		test();
		nameAndKnownTechs();
	}
}
