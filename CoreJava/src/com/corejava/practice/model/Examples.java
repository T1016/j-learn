/**
 * 
 */
package com.corejava.practice.model;

import java.util.Scanner;

/**
 * @author tarfaasima
 *
 */
public class Examples {
	
	public static void main(String[] args) {
		
		
		//Print an Integer entered by an user
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = reader.nextInt();

        System.out.println("You entered: " + number);
        
        //add two integers
        
        int first = 10;
        int second = 20;

        System.out.println("Enter two numbers: " + first + " " + second);
        int sum = first + second;

        System.out.println("The sum is: " + sum);
        
        //multiply two float
        
        float firstfloat = 1.5f;
        float secondfloat = 2.0f;

        float product = firstfloat * secondfloat;

        System.out.println("The product is: " + product);
        
        //find quotient and remainder
        
        int dividend = 25, divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        
        //swap two numbers
        
        float f = 1.20f, s = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + f);
        System.out.println("Second number = " + s);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        f = s;

        // Value of temporary (which contains the initial value of first) is assigned to second
        s = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + f);
        System.out.println("Second number = " + s);
        
        //even or odd check
        
        Scanner newreader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = newreader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
		
		
	}

}