/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class Statictest {
	public static void main(String[] args) {
		// fill the staff array with three Employee objects
		var staff = new Employee[3];

		staff[0] = new Employee("Paul", 100000);
		staff[1] = new Employee("Marc", 800000);
		staff[2] = new Employee("Ralph", 70000);

		// print out information about all Employee objects
		for (Employee e : staff) {

			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + "" + e.getSalary());
		}
		int n = Employee.getNextId(); 
		// calls static method
		System.out.println("Next available id=" + n);
	}
}

class Employee {
	
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;

	public Employee(String n, double s) {
		name = n;
		salary = s;
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

	public static void main(String[] args) // unit test
	{
		var e = new Employee("Ralph", 70000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
