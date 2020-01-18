package com.hari;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Narahari
 *
 */
public class ComparingDatesPeriodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final LocalDate localDate = LocalDate.of(2020, 1, 2);
		final LocalDate localDate2 = LocalDate.of(2021, 5, 26);

		System.out.println(localDate + " : " + localDate2);
		final Period period = localDate.until(localDate2);
		System.out.println("Days : " + period.getDays());
		System.out.println("Months : " + period.getMonths());
		System.out.println("Years : " + period.getYears());

		final Period betweenPeriod = Period.between(localDate, localDate2);
		System.out.println("Days : " + betweenPeriod.getDays());
		System.out.println("Months : " + betweenPeriod.getMonths());
		System.out.println("Years : " + betweenPeriod.getYears());
	}
}
