/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arithmetic operators

		// declare variables
		int a = 12, b = 5;

		// addition operator
		System.out.println("a + b = " + (a + b));

		// subtraction operator
		System.out.println("a - b = " + (a - b));

		// multiplication operator
		System.out.println("a * b = " + (a * b));

		// division operator
		System.out.println("a / b = " + (a / b));

		// modulo operator
		System.out.println("a % b = " + (a % b));

		// assignment operators

		// create variables
		int c = 4;
		int var;

		// assign value using =
		var = c;
		System.out.println("var using =: " + var);

		// assign value using =+
		var += c;
		System.out.println("var using +=: " + var);

		// assign value using =*
		var *= c;
		System.out.println("var using *=: " + var);

		// Relational operators

		int j = 7, k = 11;

		// value of j and k
		System.out.println("j is " + j + " and k is " + k);

		// == operator
		System.out.println(j == k); // false

		// != operator
		System.out.println(j != k); // true

		// > operator
		System.out.println(j > k); // false

		// < operator
		System.out.println(j < k); // true

		// >= operator
		System.out.println(j >= k); // false

		// <= operator
		System.out.println(j <= k); // true

		// logical operators
		// && operator
		System.out.println((5 > 3) && (8 > 5)); // true
		System.out.println((5 > 3) && (8 < 5)); // false

		// || operator
		System.out.println((5 < 3) || (8 > 5)); // true
		System.out.println((5 > 3) || (8 < 5)); // true
		System.out.println((5 < 3) || (8 < 5)); // false

		// ! operator
		System.out.println(!(5 == 3)); // true
		System.out.println(!(5 > 3)); // false

		// unary
		int num = 5;

		// increase num by 1
		++num;

		// Increment and decrement operators
		int aa = 12, bb = 12;
		int result1, result2;

		// original value
		System.out.println("Value of aa: " + aa);

		// increment operator
		result1 = ++aa;
		System.out.println("After increment: " + result1);

		System.out.println("Value of bb: " + bb);

		// decrement operator
		result2 = --bb;
		System.out.println("After decrement: " + result2);

		// ternary operators
		int februaryDays = 29;
		String result;

		// ternary operator
		result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);
	}

}
