package Employee;

//package created
public class Emp 
{
	private int id;//attributes
	private String Name;
	private double salary;
	
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
	}


	public void Display()
	{
		System.out.println("ID: "+id);
		System.out.println("EmployeeName: "+Name);
		System.out.println("salary: "+salary);
	}
}
