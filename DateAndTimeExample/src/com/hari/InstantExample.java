package com.hari;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Narahari
 *
 */
public class InstantExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Instant instant = Instant.now();
		System.out.println("Instant : " + instant);

		/**
		 * getEpochSecond will give us to seconds from 1st January 1970, Everyday have
		 * 86400 Seconds
		 */
		System.out.println("getEpochSecond : " + instant.getEpochSecond());

		final Instant ofEpochSecond = instant.ofEpochSecond(0);
		System.out.println("ofEpochSecond : " + ofEpochSecond);

		final Instant instant2 = Instant.now();
		final Duration between = Duration.between(instant, instant2);
		System.out.println("between : " + between.getNano());
	}
}
