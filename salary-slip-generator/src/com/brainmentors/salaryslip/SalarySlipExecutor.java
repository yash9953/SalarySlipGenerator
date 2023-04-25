package com.brainmentors.salaryslip;

import com.brainmentors.salaryslip.models.Employee;
import com.brainmentors.salaryslip.service.EmployeeService;
import com.brainmentors.salaryslip.views.Printing;
import com.brainmentors.salaryslip.views.UserInput;
//ctrl+shift+o
public class SalarySlipExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInput input = new UserInput();
		Employee emp=input.takeInput();
		EmployeeService service = new EmployeeService(emp.getSalary());
		Printing printing = new Printing();
		printing.printSalarySlip(emp, service);
	}

}
