package com.hari;

import java.util.Comparator;

/**
 * @author Narahari
 *
 */
public class ComparatorLambdaExpressionExample {

	public static void main(String[] args) {

		/**
		 * Before Java 8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); //0 -> o1==o2, 1 -> o1>02, -1 -> o1<o2
			}
		};
		System.out.println("Before Java 8 comparator Result: "+comparator.compare(8, 4));

		/**
		 * In Java 8
		 * Lambda  syntax: () -> {}
		 */
		 Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {return a.compareTo(b);};
		 System.out.println("In Java 8 comparatorLambda result: "+comparatorLambda.compare(1, 4));
		 
		 Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) ->  a.compareTo(b);
		 System.out.println("In Java 8 comparatorLambda1 result: "+comparatorLambda1.compare(8, 8));

		 Comparator<Integer> comparatorLambda2 = (a, b) ->  a.compareTo(b);
		 System.out.println("In Java 8 comparatorLambda2 result: "+comparatorLambda2.compare(8, 4));


	}
}