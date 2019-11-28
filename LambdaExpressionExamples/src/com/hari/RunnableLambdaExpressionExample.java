package com.hari;

/**
 * @author Narahari
 *
 */
public class RunnableLambdaExpressionExample {

	public static void main(String[] args) {

		/**
		 * Before Java 8
		 */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable...");
			}
		};
		new Thread(runnable).run();

		/**
		 * In Java 8
		 * Lambda  syntax: () -> {}
		 */
		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable with Lambda....");
		};
		new Thread(runnableLambda).run();

		/**
		 * In Java 8
		 * Lambda  syntax: () -> {} - Simplified - when we have single statement no need of curly braces, 
		 * If we have it required otherwise complier will give error 
		 */
		Runnable runnableLambda1 = () -> System.out.println("Inside Runnable with Lambda simplified....");
		new Thread(runnableLambda1).run();

		/**
		 * Before Java 8
		 * Lambda  syntax: () -> {} - Simplified 
		 * Without Creating runnable Object
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable Without Lambda Creating runnable Object");	
			}
		}); 

		/**
		 * In Java 8
		 * Lambda  syntax: () -> {} - Simplified 
		 * Without Creating runnable Object
		 */
		new Thread(()-> System.out.println("Inside Runnable Without Creating runnable Object"));


	}
}