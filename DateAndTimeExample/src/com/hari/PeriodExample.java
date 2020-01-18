package com.hari;

import java.time.Period;

/**
 * @author Narahari
 *
 */
public class PeriodExample {

	public static void main(String[] args) {

		final Period dayPeriod = Period.ofDays(10);
		System.out.println("Period of 10 days : " + dayPeriod);
		System.out.println("Days Period : " + dayPeriod.getDays());
		System.out.println("Years Period : " + dayPeriod.getYears());
		System.out.println("Months Period : " + dayPeriod.getMonths());
		final Period yearPeriod = Period.ofYears(10);
		System.out.println("Period of 10 Years : " + yearPeriod);
		System.out.println("Days Period : " + yearPeriod.getDays());
		System.out.println("Years Period : " + yearPeriod.getYears());
		System.out.println("Months Period : " + yearPeriod.getMonths());
		final Period monthsPeriod = Period.ofMonths(10);
		System.out.println("Period of Months : " + monthsPeriod);
		System.out.println("Days Period : " + monthsPeriod.getDays());
		System.out.println("Years Period : " + monthsPeriod.getYears());
		System.out.println("Months Period : " + monthsPeriod.getMonths());
	}
}
