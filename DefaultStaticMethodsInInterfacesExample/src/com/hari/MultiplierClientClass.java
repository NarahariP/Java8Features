package com.hari;

import java.util.Arrays;
import java.util.List;

import com.hari.interfacee.MultiplierInterface;
import com.hari.interfacee.impl.MultiplierInterfaceImpl;

/**
 * @author Narahari
 *
 */
public class MultiplierClientClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final List<Integer> integerList = Arrays.asList(4, 5, 9, 6, 3);
		final MultiplierInterface multiplierInterface = new MultiplierInterfaceImpl();
		System.out.println("Result : " + multiplierInterface.multiply(integerList));
		System.out.println("Default Method from Interface : " + multiplierInterface.multiplyDefault(integerList));
		System.out.println(
				"Default Overriding Method from class : " + multiplierInterface.multiplyDefaultOverriding(integerList));
		System.out.println("Static Method from Interface : " + MultiplierInterface.isEmpty(integerList));
	}
}
