package com.brainmentors.salaryslip.service;

public class EmployeeService {
	double salary;
	public EmployeeService(double salary) {
		this.salary=salary;
	}
	
	public double hra() {
		return salary * 0.50;
	}
	public double ta() {
		return salary * 0.40;
	}
	public double ma() {
		return salary * 0.25;
	}
	public double da() {
		return salary * 0.20;
	}
	public double pf() {
		return salary * 0.05;
	}
	public double gs() {
		return salary + hra() + da() + ta() + ma();
	}
	public double ns() {
		return gs() - pf();
	}
}
