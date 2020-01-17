package com.hari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Narahari
 *
 */
public class DateTimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final LocalDate localDate = LocalDate.now();
		System.out.println("Currect Date : " + localDate);
		final LocalDateTime localDateTime = localDate.atTime(10, 15);
		System.out.println("Current DateTime : " + localDateTime);

		final LocalTime localTime = LocalTime.now();
		System.out.println("Currect Time : " + localTime);
		final LocalDateTime localDateTime2 = localTime.atDate(localDate);
		System.out.println("Current DateTime : " + localDateTime2);

		final LocalDateTime localDateTime3 = LocalDateTime.now();
		System.out.println("Current Date : " + localDateTime3.toLocalDate());
		System.out.println("Current Time : " + localDateTime3.toLocalTime());
	}
}
