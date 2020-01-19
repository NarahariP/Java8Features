package com.hari;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Narahari
 *
 */
public class DateFormatterExample {

	/**
	 * String to LocalDate
	 */
	private static void parseLocalDate() {

		final String date = "2020-05-15";
		final LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate : " + localDate);
		final LocalDate localDate2 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate2 : " + localDate2);

		/**
		 * Custom Defined DateFormater
		 */
		final String date2 = "2020|05|12";
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		final LocalDate localDate3 = LocalDate.parse(date2, formatter);
		System.out.println("localDate3 : " + localDate3);

		final String date3 = "2020/05/22";
		final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		final LocalDate localDate4 = LocalDate.parse(date3, formatter2);
		System.out.println("localDate3 : " + localDate4);

	}

	/**
	 * LocalDate to String
	 */
	private static void formatLocalDate() {

		final LocalDate localDate = LocalDate.now();
		final String formatDate = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("formatDate : " + formatDate);
		final String formatDate2 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("formatDate2 : " + formatDate2);

		/**
		 * Custom Format
		 */
		final LocalDate localDate1 = LocalDate.now();
		final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		final String formatDate3 = localDate1.format(formatter2);
		System.out.println("formatDate3 : " + formatDate3);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parseLocalDate();
		formatLocalDate();
	}
}
