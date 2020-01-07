package com.hari;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Narahari
 *
 */
public class DefaultMethodExample {

	static List<String> stringList = Arrays.asList("Java", "Spring", "Cloud", "Hibernate", "WebServices", "DevOops",
			"AngularJs");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Before Java 8
		 */
		Collections.sort(stringList);
		System.out.println("Sorting Collection.sort : " + stringList);

		/**
		 * In Java 8 - Ascending Order
		 */
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorting List.sort - Ascending : " + stringList);

		/**
		 * In Java 8 - Descending Order
		 */
		stringList.sort(Comparator.reverseOrder());
		System.out.println("Sorting List.sort- Descending order : " + stringList);
	}
}
