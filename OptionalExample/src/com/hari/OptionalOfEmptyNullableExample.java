package com.hari;

import java.util.Optional;

/**
 * @author Narahari
 *
 */
public class OptionalOfEmptyNullableExample {

	private static Optional<String> ofNullableWithoutNull() {
		final Optional<String> optionalName = Optional.ofNullable("Hari");
		return optionalName;
	}

	private static Optional<String> ofNullableWithNull() {
		final Optional<String> optionalName = Optional.ofNullable(null);
		return optionalName;
	}

	private static Optional<String> ofWithoutNull() {
		final Optional<String> optionalName = Optional.of("Hari");
		return optionalName;
	}

	private static Optional<String> ofWithNull() {
		final Optional<String> optionalName = Optional.of(null);
		return optionalName;
	}

	private static Optional<String> empty() {
		final Optional<String> optionalName = Optional.empty();
		return optionalName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<< ofNullable>>>>>>>>>>>>>>>>>>");
		System.out.println(ofNullableWithoutNull().isPresent());
		System.out.println("Converting case :: " + ofNullableWithoutNull().map(String::toUpperCase).get());
		System.out.println(ofNullableWithoutNull().get());
		System.out.println(ofNullableWithNull().isPresent());

		System.out.println("<<<<<<<<<<< empty >>>>>>>>>>>>>>>>>>");
		System.out.println(empty());
		System.out.println(empty().isPresent());

		System.out.println("<<<<<<<<<<< of >>>>>>>>>>>>>>>>>>");
		System.out.println(ofWithoutNull().isPresent());
		System.out.println("Converting case :: " + ofWithoutNull().map(String::toUpperCase).get());
		/**
		 * Here we will get NPE because of methods always expects valid value as input
		 */
		System.out.println(ofWithNull());
	}
}
