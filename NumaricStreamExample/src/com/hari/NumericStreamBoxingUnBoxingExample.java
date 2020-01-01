package com.hari;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Narahari
 *
 */
public class NumericStreamBoxingUnBoxingExample {

	private static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
	}

	private static int unboxingAndSum(List<Integer> integerList) {
		return integerList.stream().mapToInt(Integer::intValue).sum();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Boxing :: " + boxing());
		System.out.println("Unbocking  and int sum :: " + unboxingAndSum(boxing()));
	}
}
