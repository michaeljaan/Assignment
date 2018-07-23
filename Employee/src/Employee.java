
public class Employee {
	private final int id=101;
	private String name;
	private double monthlyBasic;
	double MonthlyGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	static double pf;
	
		
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public double getMonthlyBasic() {
		return monthlyBasic;
	}


	public void setMonthlyBasic(double monthlyBasics) {
		this.monthlyBasic = monthlyBasics;
	}


	double getAnnualBasic()
	{
		double annualBasics= monthlyBasic * 12;
		return annualBasics;
	}
	
	public double getMonthlyGrossSalary()
	{
		double hra= monthlyBasic*0.5;
		double medical=1250, conveyance=800;
		MonthlyGrossSalary= monthlyBasic + medical + conveyance +hra;
		return MonthlyGrossSalary;
	}
	
	double getAnnualGrossSalary()
	{
		double AnnualGrossSalary = 12 * MonthlyGrossSalary;
		return AnnualGrossSalary;
	}
	
	double getMonthlyDeduction()
	{
		double pf,esic,profTax;
		if(monthlyBasic > 6500)
		{
		pf =monthlyBasic * 0.1;
		}
		else
		{
			pf = 6500;
		}
		if(monthlyBasic<=5000)
		{
		esic= monthlyBasic * 0.475;
		}
		else
		{
			esic=0;
		}
		if(monthlyBasic <=10000)
		{
			profTax=50;
		}
		else
		{
		profTax=100;
		}
		MonthlyDeduction= pf + esic + profTax;
		return MonthlyDeduction;
	}
	
	double getMonthlyTakeHome()
	{
		MonthlyTakeHome= MonthlyGrossSalary-MonthlyDeduction;
		return MonthlyTakeHome;
	}
	
	double getAnnualTakeHome()
	{
		double AnnualTakeHome= MonthlyTakeHome*12;
		return AnnualTakeHome;
	}
	
	public static double getPf() {
		return pf;
	}
	public static void setPf(double pf) {
		Employee.pf = pf;
	}
	
}
