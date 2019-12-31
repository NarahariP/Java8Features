package com.hari;

import java.util.Optional;

/**
 * @author Narahari
 *
 */
public class OptionalPresentExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * isPresent() it's going to be verify do we have value of not
		 */
		final Optional<String> optionalString = Optional.ofNullable("Some Value");
		System.out.println(optionalString.isPresent());
		if (optionalString.isPresent()) {
			System.out.println(optionalString.get());
		}

		/**
		 * ifPresent() -> It will tell us to we have value or not and it will option to
		 * perform additional operation on that optional value
		 */
		final Optional<String> optional = Optional.ofNullable("Some Value");
		optional.ifPresent(string -> System.out.println(string));

	}
}
