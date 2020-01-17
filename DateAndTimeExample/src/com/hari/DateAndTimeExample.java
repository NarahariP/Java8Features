package com.hari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Narahari
 *
 */
public class DateAndTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Currect Date and Time : " + localDateTime);
		System.out.println("Custom Date and Time : " + localDateTime.of(2020, 2, 15, 11, 15));
		System.out.println("Custom Date and Time : " + localDateTime.of(2022, 5, 16, 23, 45, 55, 999));
		System.out.println("Currrent Date and Time : " + localDateTime.of(LocalDate.now(), LocalTime.now()));
		System.out.println("Currect Year : " + localDateTime.getYear());
		System.out.println("Currect month : " + localDateTime.getMonth());
		System.out.println("Currect Month Value : " + localDateTime.getMonthValue());
		System.out.println("Currect hour : " + localDateTime.getHour());
		System.out.println("Currect Minute : " + localDateTime.getMinute());
		System.out.println("Current Seconds : " + localDateTime.getMinute());
		System.out.println("Current seconds : " + localDateTime.getSecond());
		System.out.println("Current nano seconds : " + localDateTime.getNano());
		System.out.println("Day of the Year : " + localDateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println("Current Day of Month : " + localDateTime.getDayOfMonth());
		System.out.println("Current Day of Year : " + localDateTime.getDayOfYear());
		System.out.println("Currect Minute of the Day : " + localDateTime.getLong(ChronoField.MINUTE_OF_DAY));
		System.out.println("Current Day of week : " + localDateTime.getDayOfWeek());

		/**
		 * Modifying LocalDateTime
		 */
		System.out.println("DateTime +9 days : " + localDateTime.plusDays(9));
		System.out.println("DateTime +10 hours : " + localDateTime.plusHours(10));
		System.out.println("DateTime +50 minutes : " + localDateTime.plusMinutes(50));
		System.out.println("DateTime -9 days : " + localDateTime.minusDays(9));
		System.out.println("DateTime -10 hours : " + localDateTime.minusHours(10));
		System.out.println("DateTime -50 minutes : " + localDateTime.minusMinutes(50));
		System.out.println("DateTime with DayOfMonth : " + localDateTime.withDayOfMonth(25));
		System.out.println("DateTime withDayOfYear : " + localDateTime.withDayOfYear(15));
		System.out.println("DateTime with ChronoField : " + localDateTime.with(ChronoField.MINUTE_OF_DAY, 10));
		System.out.println(localDateTime.truncatedTo(ChronoUnit.MILLIS));
	}

}
