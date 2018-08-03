package in.com.datalayer;

import java.util.HashSet;
import java.util.Set;

import in.com.servicelayer.Employee;

public class EmployeeCollection {
	
	private static Set<Employee> employeeCollection;
	
	static {
		employeeCollection = new HashSet<>();
	}
	
	public void addEmployee(Employee employee)
	{
		employeeCollection.add(employee);
	}
	
	public Set<Employee> viewAll(){
		return employeeCollection;
	}
	
}
