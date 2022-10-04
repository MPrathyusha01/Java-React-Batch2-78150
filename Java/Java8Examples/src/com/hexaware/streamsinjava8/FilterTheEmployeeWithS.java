package com.hexaware.streamsinjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheEmployeeWithS {

	public static void main(String[] args) {
		List<Employee> listEmp = new ArrayList<Employee>();

		Employee emp = new Employee("HR123", "Shyama", 56789);
		Employee emp1 = new Employee("HR124", "Sharma", 46789);
		Employee emp2 = new Employee("HR125", "Rama", 86789);
		Employee emp3 = new Employee("HR126", "Krishna", 26789);
		Employee emp4 = new Employee("HR1237", "Shiva", 46789);

		listEmp.add(emp);
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);

		List<Employee> filteredData = listEmp.stream().filter(e -> e.getEmpname().startsWith("S"))
				.collect(Collectors.toList());

		System.out.println("Employees Whose Name Start with 's' " + filteredData);

		List<String> filteredEmpNames = listEmp.stream().filter(e -> e.getEmpname().startsWith("S"))
				.map(e -> e.getEmpname()).collect(Collectors.toList());

		System.out.println("Employees Whose Name Start with 's' " + filteredEmpNames);

		List<Employee> filteredEmpDataOnSal = listEmp.stream().filter(e -> e.getEmpSalary() > 45000)
				.collect(Collectors.toList());

		System.out.println("Employees Whose Salary > 45000 " + filteredEmpDataOnSal);

	}

}