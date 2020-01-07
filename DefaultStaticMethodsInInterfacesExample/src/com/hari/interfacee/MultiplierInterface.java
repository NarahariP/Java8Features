package com.hari.interfacee;

import java.util.List;

public interface MultiplierInterface {

	int multiply(List<Integer> integerList);

	default int multiplyDefault(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

	default int multiplyDefaultOverriding(List<Integer> integerList) {
		System.out.println("Inside interface...");
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

	static boolean isEmpty(List<Integer> integerList) {
		return integerList != null && integerList.size() > 0;
	}
}
