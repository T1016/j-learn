/**
 * 
 */
package com.corejava.practice.model;

/**
 * @author tarfaasima
 */

public class Manager extends Employee{
	
	private double bonus;

	public Manager(String name, double salary, int year, int month) {
		super(name, salary, year, month);
		bonus = 0;
	}
	
	public double getSalary() {
		
		double baseSalary = super.getSalary();
		return baseSalary+bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}