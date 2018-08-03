package in.com.accept;
import java.io.*;
import in.com.servicelayer.Employee;

public class addEmployee implements acceptdata{

		Employee employee=new Employee();
	@Override
	public void addEmployee() throws IOException 
	{
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Enter The Employee Name:");
		String name=input.readLine();
		employee.setEmpName(name);
		
		System.out.println("Enter the Salary:");
		String inputstr=input.readLine();
		double salary=Double.parseDouble(inputstr);
		employee.getSalary();
		
	}

}
