package com.hari;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.hari.model.Employee;
import com.hari.model.EmployeeService;

/**
 * @author Narahari
 *
 */
public class PredicateAndConsumerExample {

	Predicate<Employee> predicate1 = (employee) -> employee.getDeptNo() >= 5;
	Predicate<Employee> predicate2 = (employee) -> employee.getSalInLaks() >= 7.6;

	BiPredicate<Integer, Double> biPredicate = (deptno, salInLakhs) -> deptno >= 5 && salInLakhs >= 7.6;

	BiConsumer<String, List<String>> biConsumer = (name, knownTechs) -> {
		System.out.println(name + " : " + knownTechs);
	};

	Consumer<Employee> employeeConsumer = (employee) -> {
		if (predicate1.and(predicate2).test(employee)) {
			biConsumer.accept(employee.getName(), employee.getKnowTechs());
		}
	};

	Consumer<Employee> employeeConsumerBipredicate = (employee) -> {
		if (biPredicate.test(employee.getDeptNo(), employee.getSalInLaks())) {
			biConsumer.accept(employee.getName(), employee.getKnowTechs());
		}
	};

	/**
	 * @param employeeList
	 */
	public void printNameAndKownTechs(List<Employee> employeeList) {
		System.out.println("employeeConsumer :");
		employeeList.forEach(employeeConsumer);
		System.out.println("employeeConsumerBipredicate :");
		employeeList.forEach(employeeConsumerBipredicate);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final List<Employee> employeeList = EmployeeService.getEmployeeList();
		new PredicateAndConsumerExample().printNameAndKownTechs(employeeList);
	}
}
