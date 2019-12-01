package com.hari;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.function.Consumer;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class BiConsumerExample {
	
	static List<Employee> employeeList = EmployeeService.getEmployeeList();
	static Consumer<Employee> consumer1 = (employee) -> System.out.print(employee.getName());
	static Consumer<Employee> consumer2 = (employee) -> System.out.println(employee.getKnowTechs());

	public static void printNameWay1() {
		System.out.println("printNameWay1 :");
		Consumer<Employee> consumer = (employee) -> System.out.println(employee);
		employeeList.forEach(consumer);
	}
	
	public static void printNameWay2() {
		System.out.println("printNameWay2 :");
		employeeList.forEach((employee) -> System.out.println(employee));
	}
	
	public static void printNameAndKnowTechs1() {
		System.out.println("printNameAndKnowTechs1 :");
		employeeList.forEach(consumer1.andThen(consumer2)); //Consumer Chaining
	}
	
	public static void printNameAndKnowTechs2() {
		System.out.println("printNameAndKnowTechs2 :");
		employeeList.forEach((employee) -> {
			System.out.println(employee.getName() +":"+employee.getKnowTechs());
		}); 
	}
	
	public static void printNameAndKnownTechUsingConditions() {
		System.out.println("printNameAndKnownTechUsingConditions :");
		employeeList.forEach( (employee) -> {
			if(employee.getDeptNo() >= 5 && employee.getSalInLaks() >= 6.5) {
				consumer1.andThen(consumer2).accept(employee);
			}
		});
	}
	
	public static void main(String[] args) {
		printNameWay1();
		printNameWay2();
		printNameAndKnowTechs1();
		printNameAndKnowTechs2();
		printNameAndKnownTechUsingConditions();
	}
	
}
