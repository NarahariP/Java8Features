package com.hari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Narahari
 *
 */
public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,5,8,4);
		
		/**
		 * Imperative read distinct/ unique list
		 * Before Java 8
		 */
		List<Integer> uniqueList = new ArrayList<>();
		for (Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Imperative Disticnt values: "+uniqueList);
		
		/**
		 * Declarative read distinct/ unique list
		 * In Java 8
		 */
		List<Integer> uniqueList1  = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Declarative Distinct Values: "+uniqueList1);
		
		/**
		 * Simplified In Java 8
		 */
		
		System.out.println("Simplified Declarative Distinct Values: "+integerList.stream().distinct().collect(Collectors.toList()));
	}
}
