package com.packages.methods;

import java.util.Scanner;

public class CalculateNetSalary {

	// % = value / total * 100
	// value = (% * total) / 100

	// Class for Allowances
	public static class Allowances {
		double hra, ta, da, totalAllowance;

		public Allowances(double hra, double ta, double da) {
			this.hra = hra;
			this.ta = ta;
			this.da = da;
			this.totalAllowance = hra + ta + da;
		}
	}

	// class for Deductions
	public static class Deductions {
		double ma, pf, totalDeductions;

		public Deductions(double ma, double pf) {
			this.ma = ma;
			this.pf = pf;
			this.totalDeductions = ma + pf;
		}
	}

	// method to calculate total allowance
	static Allowances totalAllowances(double salary) {
		double hra = (45.0 / 100) * salary;
		double ta = (25.0 / 100) * salary;
		double da = (30.0 / 100) * salary;
		
		return new Allowances(hra, ta, da);
	}

	// method to calculate total deductions
	static Deductions totalDeductions(double salary) {
		double ma = (5.0 / 100) * salary;
		double pf = (25.0 / 100) * salary;
		
		return new Deductions(ma, pf);
	}

	// method to calculate net salary
	static double netSalary(Allowances salaryAllowance, Deductions salaryDeductions, double salary) {
		double totalSalary = salary + salaryAllowance.totalAllowance - salaryDeductions.totalDeductions;
		return totalSalary;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee's Basic Salary : ");
		double salary = scan.nextDouble();

		Allowances salaryAllowance = totalAllowances(salary);
		Deductions salaryDeductions = totalDeductions(salary);

		System.out.println("In Hand Salary is : " + netSalary(salaryAllowance, salaryDeductions, salary));

		scan.close();
	}
}

/*
 * Why to make inner class as public static ?
 * 
 * Making the inner class `public` and `static` depends on whether you intend to
 * use the inner class outside of the `CalculateNetSalary` class and whether it
 * needs to be accessed independently of an instance of the outer class. Let me
 * explain the implications of making it `public` and `static`:
 * 
 * 1. **Public Inner Class**: - When you declare the inner class as `public`, it
 * can be accessed from outside the `CalculateNetSalary` class using
 * `CalculateNetSalary.Allowances`. - If you have other classes or components
 * that need to use this `Allowances` class independently, it makes sense to
 * declare it as `public`.
 * 
 * 2. **Static Inner Class**: - A `static` inner class does not require an
 * instance of the outer class to be created before you can create an instance
 * of the inner class. This allows you to use it in a more standalone manner. -
 * If the `Allowances` class doesn't need to access any instance-specific data
 * or methods from the outer class, it can be made `static`. This is a good
 * practice if the inner class doesn't have any reliance on the outer class's
 * state.
 * 
 * If you intend to use the `Allowances` class only within the context of the
 * `CalculateNetSalary` class and it doesn't need to be accessed independently
 * from outside, you can make it a non-public inner class by simply declaring it
 * as `class Allowances { ... }`. This restricts its visibility to only within
 * the `CalculateNetSalary` class.
 * 
 * 
 */