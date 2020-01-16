package com.hari;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Narahari
 *
 */
public class TimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final LocalTime localTime = LocalTime.now();
		System.out.println("Current Time : " + localTime);

		System.out.println("Local Time With h:m : " + localTime.of(23, 30));
		System.out.println("Local Time With h:m:s : " + localTime.of(23, 30, 55));
		System.out.println("Local Time with h:m:s:ns : " + localTime.of(23, 30, 55, 999));
		System.out.println("Hours : " + localTime.getHour());
		System.out.println("Minutes : " + localTime.getMinute());
		System.out.println("Seconds : " + localTime.getSecond());
		System.out.println("Nano Seconds : " + localTime.getNano());
		System.out.println("Micro Seconds : " + localTime.get(ChronoField.MICRO_OF_SECOND));
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());
		/**
		 * Modify localTime
		 */
		System.out.println("-2 hours :" + localTime.minusHours(2));
		System.out.println("-50 minusMinutes : " + localTime.minusMinutes(50));
		System.out.println("minus with ChronoUnit : " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY, 6));
		System.out.println("localTime with : " + localTime.withHour(4));
		System.out.println("Midnight : " + localTime.with(LocalTime.MIDNIGHT));

		System.out.println("+2 hours : " + localTime.plusHours(2));
		System.out.println("plus with ChronoUnit : " + localTime.plus(5, ChronoUnit.HOURS));
	}
}
