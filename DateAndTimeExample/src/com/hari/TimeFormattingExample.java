package com.hari;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Narahari
 *
 */
public class TimeFormattingExample {

	/**
	 * String to LocalTime
	 */
	private static void parseTime() {

		final String time = "13:15";
		final LocalTime parseTime1 = LocalTime.parse(time);
		System.out.println("parseTime1 : " + parseTime1);
		final LocalTime parseTime2 = LocalTime.parse(time, DateTimeFormatter.ISO_TIME);
		System.out.println("parseTime2 : " + parseTime2);
		final LocalTime parseTime3 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("parseTime3 : " + parseTime3);

		/**
		 * Custom format
		 */
		final String time4 = "15|22";
		final DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH|mm");
		final LocalTime parseTime4 = LocalTime.parse(time4, formatter4);
		System.out.println("parseTime4 : " + parseTime4);

		final String time5 = "15*22";
		final DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH*mm");
		final LocalTime parseTime5 = LocalTime.parse(time5, formatter5);
		System.out.println("parseTime5 : " + parseTime5);

		final String time6 = "15*22*55";
		final DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("HH*mm*ss");
		final LocalTime parseTime6 = LocalTime.parse(time6, formatter6);
		System.out.println("parseTime6 : " + parseTime6);

	}

	/**
	 * LocalTime to String
	 */
	private static void formatTime() {

		final LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		final String formatDate1 = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("formatDate1 : " + formatDate1);

		final String formatDate2 = localTime.format(DateTimeFormatter.ISO_TIME);
		System.out.println("formatDate2 : " + formatDate2);

		final DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH|ss");
		final String formatDate3 = localTime.format(formatter3);
		System.out.println("formatDate3 : " + formatDate3);

		final DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH*ss");
		final String formatDate4 = localTime.format(formatter4);
		System.out.println("formatDate4 : " + formatDate4);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parseTime();
		formatTime();
	}
}
