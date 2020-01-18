package com.hari;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Narahari
 *
 */
public class ComparingTimesDurationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final LocalTime localTime = LocalTime.of(10, 50);
		final LocalTime localTime2 = LocalTime.of(11, 59);

		final long diffOfTimes = localTime.until(localTime2, ChronoUnit.MINUTES);
		System.out.println("Difference of two times  : " + diffOfTimes);

		final Duration betweenDuration = Duration.between(localTime, localTime2);
		System.out.println("Diff between times in Days : " + betweenDuration.toDays());
		System.out.println("Diff between times in Hours : " + betweenDuration.toHours());
		System.out.println("Diff between times in Millis : " + betweenDuration.toMillis());
		System.out.println("Diff between times in Minutes : " + betweenDuration.toMinutes());
		System.out.println("Diff between times in Nanos : " + betweenDuration.toNanos());

		final Duration ofHoursDuration = Duration.ofHours(3);
		System.out.println("ofHoursDuration.toHours : " + ofHoursDuration.toHours());
		System.out.println("ofHoursDuration.toMinutes : " + ofHoursDuration.toMinutes());
		System.out.println("ofHoursDuration.toMillis : " + ofHoursDuration.toMillis());

	}

}
