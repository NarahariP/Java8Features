package com.hari;

public class SortingExample {
	static int[] bubbleSort(int[] numbers) {

		/*
		 * IntStream.range(0, numbers.length - 1) .flatMap(i -> IntStream.range(1,
		 * numbers.length - 1)) .forEach(j -> { if (numbers[j - 1] > numbers[j]) { final
		 * int temp = numbers[j]; numbers[j] = numbers[j - 1]; numbers[j - 1] = temp; }
		 * });
		 */

		final int n = numbers.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println("Array Before Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr = bubbleSort(arr);
		System.out.println("Array After Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
