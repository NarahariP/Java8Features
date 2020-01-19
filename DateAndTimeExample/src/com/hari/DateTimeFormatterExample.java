package com.hari;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Narahari
 *
 */
public class DateTimeFormatterExample {

	/**
	 * String to LocalDateTime
	 */
	private static void parseLocalDateTime() {

		final String dateTime = "2020-01-19T13:25:20.919";
		final LocalDateTime parseDateTime1 = LocalDateTime.parse(dateTime);
		System.out.println("parseDateTime1 : " + parseDateTime1);

		final LocalDateTime parseDateTime2 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("parseDateTime2 : " + parseDateTime2);

		final LocalDateTime parseDateTime3 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("parseDateTime3 : " + parseDateTime3);

		/**
		 * Custom format
		 */
		final String dateTime4 = "2020-01-19T13|25|20";
		final DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		final LocalDateTime parseDateTime4 = LocalDateTime.parse(dateTime4, dateTimeFormatter4);
		System.out.println("parseDateTime4 : " + parseDateTime4);

		final String dateTime5 = "2020-01-19ABC13|25|20";
		final DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd'ABC'HH|mm|ss");
		final LocalDateTime parseDateTime5 = LocalDateTime.parse(dateTime5, dateTimeFormatter5);
		System.out.println("parseDateTime5 : " + parseDateTime5);

		final String dateTime6 = "2020-01-19hari13|25|20";
		final DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("yyyy-MM-dd'hari'HH|mm|ss");
		final LocalDateTime parseDateTime6 = LocalDateTime.parse(dateTime6, dateTimeFormatter6);
		System.out.println("parseDateTime6 : " + parseDateTime6);

		final String dateTime7 = "2020|01|19hari13|25|20";
		final DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("yyyy|MM|dd'hari'HH|mm|ss");
		final LocalDateTime parseDateTime7 = LocalDateTime.parse(dateTime7, dateTimeFormatter7);
		System.out.println("parseDateTime7 : " + parseDateTime7);
	}

	/**
	 * LocalDateTime to String
	 */
	private static void formatLocalDateTime() {

		final LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);

		final String formatDateTime1 = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("formatDateTime1 : " + formatDateTime1);

		final DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		final String formatDateTime4 = localDateTime.format(dateTimeFormatter4);
		System.out.println("formatDateTime4 : " + formatDateTime4);

		final DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd'ABC'HH|mm|ss");
		final String formatDateTime5 = localDateTime.format(dateTimeFormatter5);
		System.out.println("formatDateTime5 : " + formatDateTime5);

		final DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("yyyy-MM-dd'hari'HH|mm|ss");
		final String formatDateTime6 = localDateTime.format(dateTimeFormatter6);
		System.out.println("formatDateTime6 : " + formatDateTime6);

		final DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("yyyy|MM|dd'hari'HH|mm|ss");
		final String formatDateTime7 = localDateTime.format(dateTimeFormatter7);
		System.out.println("formatDateTime7 : " + formatDateTime7);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parseLocalDateTime();
		formatLocalDateTime();
	}
}
