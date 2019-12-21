package com.hari;

import java.util.stream.Stream;

/**
 * @author Narahari
 *
 */
public class StreamOfExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Stream<String> stringSteam = Stream.of("ABC", "XYZ", "MNO");
		stringSteam.forEach(System.out::println);
	}

}
