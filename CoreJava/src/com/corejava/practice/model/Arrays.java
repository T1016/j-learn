/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class Arrays {
	public static void main(String[] args) {

		// Arrays for primitive datatypes

		// for integers

		int[] integerArray = { 1, 2, 3, 4, 5 };

		System.out.println(integerArray);

		// for float

		float[] floatArray = { 1, 2, 3, 4, 5 };

		System.out.println(floatArray);

		// for double

		double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };

		System.out.println(doubleArray);

		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println(charArray);

		// using control flow to access the array elements

		for (int i = 0; i < integerArray.length; i++) {

			System.out.println(integerArray[i]);

		}

		for (float element : floatArray) {
			System.out.println(element);
		}

		if (doubleArray.length < 10) {
			for (double element : doubleArray) {
				System.out.println(element);
			}
		}

		int j = 0;
		while (charArray[j] != 'e') {
			System.out.println(charArray[j]);
			j++;
		}

	}
}