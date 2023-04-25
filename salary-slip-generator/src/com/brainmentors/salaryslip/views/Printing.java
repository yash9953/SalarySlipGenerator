package com.brainmentors.salaryslip.views;

import com.brainmentors.salaryslip.models.Employee;
import com.brainmentors.salaryslip.service.EmployeeService;

public class Printing {
	public void printSalarySlip(Employee emp,EmployeeService service) {
		System.out.println("Salary Slip **********");
		System.out.println("id "+emp.getId());
		System.out.println("Name "+emp.getName());
		System.out.println("Salary "+emp.getSalary());
		System.out.println("Hra "+service.hra());
		System.out.println("da "+service.da());
		System.out.println("ta "+service.ta());
		System.out.println("ma "+service.ma());
		System.out.println("pf "+service.pf());
		System.out.println("gs "+service.gs());
		System.out.println("ns "+service.ns());
	}
}
