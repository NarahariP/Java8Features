package com.hari;

import java.util.function.UnaryOperator;

/**
 * @author Narahari
 *
 */
public class UnaryOperatiorExample {

	static UnaryOperator<String> unaryOperator = (string) -> string.concat("hari"); //Whenever we have same i/p then we can user this instead of function
	
	public static void main(String[] args) {
		System.out.println("Unary Operator Exmaple :" +unaryOperator.apply("test"));
	}
}
