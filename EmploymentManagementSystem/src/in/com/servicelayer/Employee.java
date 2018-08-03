package in.com.servicelayer;

public class Employee
{

	private String empName;
	private final int empNo;
	private double salary;
	
	private static int empID;
	
	static {
		empID=100;
	}
	{
		this.empNo= ++empID;
	}
	public Employee(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static int getNextEmployeeNo()
	{
		return empID+1;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", salary=" + salary + "]";
	}
	
	
}
