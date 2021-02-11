/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class ManagerTest {
	
	public static void main(String args[]) {
		
		var manager = new Manager("John", 10000000, 2001, 10);
		manager.setBonus(10000);
		
		var staff = new Employee[1];
		staff[0] = manager;
		
		System.out.println("The manager's salary is : " + staff[0].getSalary());
	}
	
}