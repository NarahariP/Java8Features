package com.hari;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author Narahari
 *
 */
public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
		System.out.println("Binary operator:" +binaryOperator.apply(5, 8));
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Binary Operator MaxBy :"+maxBy.apply(5, 4));
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Binary Operator minBy :"+minBy.apply(5, 4));
		
	}
}
