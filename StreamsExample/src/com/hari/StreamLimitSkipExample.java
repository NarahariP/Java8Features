package com.hari;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Narahari
 *
 */
public class StreamLimitSkipExample {

	static List<Integer> intergerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	/**
	 * @param intergerList
	 * @return - it perform the summation of first 5 elements
	 */
	private static Optional<Integer> limit(List<Integer> intergerList2) {
		return intergerList.stream().limit(5).reduce((a, b) -> a + b);
	}

	/**
	 * @param intergerList2
	 * @return - it perform the summation by skipping first 5 elements
	 */
	private static Optional<Integer> skip(List<Integer> intergerList2) {
		return intergerList.stream().skip(5).reduce((a, b) -> a + b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Optional<Integer> limitOptional = limit(intergerList);
		if (limitOptional.isPresent()) {
			System.out.println("The limit result is:: " + limitOptional.get());
		}
		final Optional<Integer> skipOptional = skip(intergerList);
		if (skipOptional.isPresent()) {
			System.out.println("The skip result is:: " + skipOptional.get());
		}
	}

}
