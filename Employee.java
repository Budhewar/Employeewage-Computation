package com.bridgelabz.emp;

import java.util.Random;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employeewage Computation");
		Random random = new Random();
		int attendance = random.nextInt(2);
		if (attendance == 1) {
			System.out.println("Employee is present");

		} else {
			System.out.println("Employee is absent");
		}
		int dailywage = 20;
		int fulldayhour =8;
		int dailyWage = dailywage*fulldayhour;
		System.out.println("dailyWage" +dailyWage);
	}

}
