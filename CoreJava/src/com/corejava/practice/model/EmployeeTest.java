/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class EmployeeTest {
	public static void main(String[] args) {
		// fill the staff array with three Employee objects
		var staff = new Employee[3];

		staff[0] = new Employee("Paul", 100000, 0, 0);
		staff[1] = new Employee("Marc", 800000, 0, 0);
		staff[2] = new Employee("Ralph", 70000, 0, 0);

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

