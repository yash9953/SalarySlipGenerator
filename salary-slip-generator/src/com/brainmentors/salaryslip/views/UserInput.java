package com.brainmentors.salaryslip.views;

import java.util.Scanner;

import com.brainmentors.salaryslip.models.Employee;

public class UserInput {
	public Employee takeInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter the Name");
		sc.next();
		String name= sc.nextLine();
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();
		Employee emp=new Employee(id,name,salary);
		sc.close();
		return emp;
	}
}
