package com.hari.interfacee.impl;

import java.util.List;

import com.hari.interfacee.MultiplierInterface;

public class MultiplierInterfaceImpl implements MultiplierInterface {

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

	@Override
	public int multiplyDefaultOverriding(List<Integer> integerList) {
		System.out.println("Inside Impl class...");
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

}
