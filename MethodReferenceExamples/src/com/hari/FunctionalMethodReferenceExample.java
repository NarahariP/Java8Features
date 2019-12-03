package com.hari;

import java.util.function.Function;

/**
 * @author Narahari
 *
 */
public class FunctionalMethodReferenceExample {
	
	static Function<String, String> functionLambdaExpression = (string) -> string.toUpperCase();
	
	static Function<String, String> functionMethodRefrence = String:: toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println("Function with Lambda :"+functionLambdaExpression.apply("hari"));
		
		System.out.println("Function with Method Reference :"+functionMethodRefrence.apply("hari"));
	}

}
