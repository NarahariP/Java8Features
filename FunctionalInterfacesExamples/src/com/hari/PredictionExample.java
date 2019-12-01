package com.hari;

import java.util.function.Predicate;

/**
 * @author Narahari
 *
 */
public class PredictionExample {
	
	static Predicate<Integer>  predicate1 = (a) -> a%2==0;
	static Predicate<Integer>  predicate2 = (a) -> a%5==0;
	
	public static void predicateAnd() {
		System.out.println("Predicate And :" +predicate1.and(predicate2).test(10)); //Predicate chaining
		System.out.println("Predicate And :" +predicate1.and(predicate2).test(7)); //Predicate chaining
	}
	
	public static void predicateOR() {
		System.out.println("Predicate OR :" +predicate1.or(predicate2).test(10)); //Predicate chaining
		System.out.println("Predicate OR :" +predicate1.or(predicate2).test(8)); //Predicate chaining
	}
	
	public static void predicateNegate() { //Negate is going to be reverse the original result
		System.out.println("Predicate OR :" +predicate1.or(predicate2).negate().test(10)); //Predicate chaining
		System.out.println("Predicate OR :" +predicate1.or(predicate2).negate().test(8)); //Predicate chaining
	}
	
	public static void main(String[] args) {
		System.out.println(predicate1.test(4));
		predicateAnd();
		predicateOR();
		predicateNegate(); 
	}

}
