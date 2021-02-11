/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class Employee {
	
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	private int year;
	private int month;

	public Employee(String n, double s, int y, int m) {
		name = n;
		salary = s;
		year = y;
		month = m;
		id = 0;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId; // set id to next available id
		nextId++;
	}

	public static int getNextId() {
		return nextId; // returns static field
	}

//	public static void main(String[] args) // unit test
//	{
//		var e = new Employee("Ralph", 70000);
//		System.out.println(e.getName() + " " + e.getSalary());
//	}
}