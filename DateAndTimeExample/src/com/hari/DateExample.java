package com.hari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Narahari
 *
 */
public class DateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// LocalDate
		final LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);

		final LocalDate customDate = LocalDate.of(2020, 02, 12);
		System.out.println("Custom LocalDate : " + customDate);

		final LocalDate dayOfYear = LocalDate.ofYearDay(2020, 14);
		System.out.println("Day of Year : " + dayOfYear);
		final LocalDate dayOfYear2 = LocalDate.ofYearDay(2020, 365);
		System.out.println("Day of Year 2 : " + dayOfYear2);

		/**
		 * Get values from LocalDate
		 */
		System.out.println("Day of Month : " + localDate.getDayOfMonth());
		System.out.println("Day of Year : " + localDate.getDayOfYear());
		System.out.println("Month Value : " + localDate.getMonthValue());
		System.out.println("Year : " + localDate.getYear());
		System.out.println("Day of Week : " + localDate.getDayOfWeek());
		System.out.println("Lenght of Month : " + localDate.lengthOfMonth());
		System.out.println("Length of Year : " + localDate.lengthOfYear());
		System.out.println("Epoch Day : " + localDate.toEpochDay());
		System.out.println("Era : " + localDate.getEra());
		System.out.println("Chronology : " + localDate.getChronology());
		System.out.println("Month : " + localDate.getMonth());
		System.out.println("Is Leep Year : " + localDate.isLeapYear());
		System.out.println("Is leep Year Date: " + localDate.ofYearDay(2021, 1));
		System.out.println("Is leep Year : " + localDate.ofYearDay(2021, 1).isLeapYear());
		System.out.println("Day of Month using TemporalFiled : " + localDate.get(ChronoField.DAY_OF_MONTH));

		// LocalTime
		final LocalTime localTime = LocalTime.now();
		System.out.println("Local Time : " + localTime);

		// LocalDateTime
		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local DateAndTime : " + localDateTime);

		/**
		 * Modify Local Date
		 */
		System.out.println("Current Date : " + localDate);
		System.out.println("2+ date : " + localDate.plusDays(2));
		System.out.println("2- date : " + localDate.minusDays(2));
		System.out.println("Minus years with ChronoUnit : " + localDate.minus(1, ChronoUnit.YEARS));
		System.out.println("Date withYear" + localDate.withYear(2019));
		System.out.println("Date withDayOfMonth : " + localDate.withDayOfMonth(19));
		System.out.println("Date withDayOfYear : " + localDate.withDayOfYear(200));
		System.out.println("Date withMonth : " + localDate.withMonth(5));
		System.out.println("with ChronoFiled : " + localDate.with(ChronoField.YEAR, 2020));
		System.out.println("First Day of next Month With TemporalAdjusters: "
				+ localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

		System.out.println("Local Date : " + localDate);
		System.out.println("Custom Date : " + customDate);
		System.out.println("isEqual : " + localDate.isEqual(customDate));
		System.out.println("isBefore : " + localDate.isBefore(customDate));
		System.out.println("isAfter : " + localDate.isAfter(customDate));
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES)); // false - because localDate
																							// don't have time
																							// information
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.DAYS)); // true
		System.out.println("isSupported : " + localDate.isSupported(ChronoField.DAY_OF_MONTH)); // true
		System.out.println("isSupported : " + localDate.isSupported(ChronoField.HOUR_OF_DAY)); // false - because
																								// localDate don't have
																								// time information
	}
}
