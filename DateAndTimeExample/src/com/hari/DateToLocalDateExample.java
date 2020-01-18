package com.hari;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author Narahari
 *
 */
public class DateToLocalDateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * java.util.Date to LocalDate and vice-versa
		 */
		final Date utilDate = new Date();
		System.out.println("utilDate : " + utilDate);
		final LocalDate localDate = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate : " + localDate);

		final Date utilDate2 = new Date()
				.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("utilDate2 : " + utilDate2);

		/**
		 * java.sql.Date to LocalDate and vice-versa
		 */
		final java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
		System.out.println("SqlDate : " + sqlDate);
		final LocalDate localDate2 = sqlDate.toLocalDate();
		System.out.println("localDate2 : " + localDate2);
		final java.sql.Date sqlDate2 = java.sql.Date.valueOf(localDate2);
		System.out.println("sqlDate2 : " + sqlDate2);
	}
}
