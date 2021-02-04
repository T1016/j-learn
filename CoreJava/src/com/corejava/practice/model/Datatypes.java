/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author T1016
 *
 */
public class Datatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive datatypes
		
		//boolean datatype
		
		boolean b = true;
		if(b == true) {
			System.out.println("The bool value is true");
		}
		
		//byte datatype
		
		byte a = 126;
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		//holds value from -128 to 127
		
		//short datatype
		short s = 40;
		System.out.println(s);
		
		//integer datatype
		int i = 1000;
		System.out.println(i);
		
		//long datatype
		
		long l = 10000000;
		System.out.println(l);
		
		//float datatype
		float f = 5;
		System.out.println(f);
		
		//double datatype
		double d = 5.5;
		System.out.println(d);
		
		//char datatype
		char c = 't';
		System.out.println(c);
		
		//enum datatype
		Color picked = Color.BLACK;
		System.out.println(picked);

	}
	
enum Color{
	BLACK, WHITE;
}

}
