/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class Reference {

	public static void main(String args[]) {

		// first we'll pass the reference by value
		var i = multiplyTheNumber(10);
		System.out.println("The value of i is " + i);

		// secondly we'll pass the reference of the value to modify it
		Plot plot = new Plot();
		System.out.println("The values before updating. X =  " + plot.x_coordinate + " Y = " + plot.y_coordinate);
		updatePlot(plot);
		System.out.println("The values after updating. X =  " + plot.x_coordinate + " Y = " + plot.y_coordinate);

	}

	private static int multiplyTheNumber(int i) {
		// TODO multiplies i with itself
		return i * i;
	}

	public static void updatePlot(Plot plot) {
		plot.x_coordinate = 20;
		plot.y_coordinate = 20;

	}

}

class Plot {
	public int x_coordinate = 10;
	public int y_coordinate = 10;

}