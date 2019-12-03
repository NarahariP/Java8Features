package com.hari;

import java.util.function.Consumer;

/**
 * @author Narahari
 *
 */
public class ConsumerMethodRefrenceExample {
	
	static Consumer<String> consumerLambda = string -> System.out.println(string.toUpperCase());
	
	/**
	 * Class::methodName
	 */
	static Consumer<String> consumerMethodReference = System.out::println;
	
	public static void main(String[] args) {
		consumerLambda.accept("hari");
		consumerMethodReference.accept("test");
	}

}
