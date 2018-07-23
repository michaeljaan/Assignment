//date main function
import java.util.Scanner;
class Date
{
		public static void main(String []args)
		{
		int day,year,month;//local variable
		Scanner sc= new Scanner(System.in);
		String mon=null;
		System.out.println("Enter date in DD MM YYYY order");
		day=sc.nextInt();// input date
		month=sc.nextInt();//input month
		year=sc.nextInt();//input year
		switch(month)//month assignment
		{
			case(01):
			{
			mon="January";
			break;
			}
			case(02):
			{
			mon="February";
			break;
			}
			case(03):
			{
			mon="March";
			break;
			}
			case(04):
			{
			mon="April";
			break;
			}
			case(05):
			{
			mon="May";
			break;
			}
			case(06):
			{
			mon="June";
			break;
			}
			case(07):
			{
			mon="July";
			break;
			}
			case(08):
			{
			mon="August";
			break;
			}
			case(09):
			{
			mon="September";
			break;
			}
			case(10):
			{
			mon="October";
			break;
			}
			case(11):
			{
			mon="November";
			break;
			}
			case(12):
			{
			mon="December";
			break;
			}
		}
		System.out.println(day+"/"+mon+"/"+year);
		}
}