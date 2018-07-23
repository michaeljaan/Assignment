//Simple and compound interest
import java.util .*;//import all packages
class SimpleCompound
{
	public static void main(String []args)
	{
		double principal ,rate,time, simple,compound;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the amount :");
		principal=sc.nextDouble();//enter principal amount
		
		System.out.println("Enter the No. of years:");
		time=sc.nextDouble();// Enter time period
		
		System.out.println("Enter the rate of interest");
		rate=sc.nextDouble();//Enter rate of interest
		
		simple=(principal*time*rate)/100;//calculate simple interest
		compound=principal*Math.pow(1.0+rate/100.0,time)-principal;
		System.out.println("Simple Interest="+simple);
		System.out.println("Compound Interest="+compound);
	}
}
