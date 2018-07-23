//Tax main function
import java.util.Scanner;
class Tax
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Double income,tax=0.0;//variables
		
		System.out.println("Enter CTC:");
		income=sc.nextDouble();//input income
		
		if(income>0 && income <180000)
		{
		tax=0.0;
		}
		if(income>181001 && income <300000)
		{
		tax=income*0.1;
		}
		if(income>300001 && income <500000)
		{
		tax=income*0.2;
		}
		if(income>500001 && income <1000000)
		{
		tax=income*0.3;
		}
		System.out.println("tax amount ="+tax);//output tax amount
	}
}