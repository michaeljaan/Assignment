import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee Ram=new Employee();
		Employee Shyam=new Employee();
		Employee Sam=new Employee();
		
		String Name;
		double MonthlyBasics;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1st employee Name");
		Name=scanner.nextLine();
		Ram.setName(Name);
		
		System.out.println("Enter 1st Employee Monthly basics:");
		MonthlyBasics=scanner.nextDouble();
		Ram.setMonthlyBasic(MonthlyBasics);
		
		System.out.println("The Salary details of 1st Employee:");
		System.out.println("Employee ID:"+ Ram.getId());
		System.out.println("Employee Name:"+ Ram.getName());
		System.out.println("Monthly basics:"+ Ram.getMonthlyBasic());
		System.out.println("Annual Basic:"+Ram.getAnnualBasic());
		System.out.println("Monthly Gross:"+Ram.getMonthlyGrossSalary());
		System.out.println("Annual Gross:"+Ram.getAnnualGrossSalary());
		System.out.println("Monthly Deduction:"+ Ram.getMonthlyDeduction());
		System.out.println("Monthly take home:"+ Ram.getMonthlyTakeHome());
		System.out.println("Annual take home:" + Ram.getAnnualTakeHome());
		
		
		

	}

}
