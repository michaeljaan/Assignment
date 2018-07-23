//Mark main function
import java.util.Scanner;
class Marks
{
	public static void main(String []args)
	{
	Scanner sc= new Scanner(System.in);
	int mark1,mark2,mark3;// vaiables
	
	System.out.println("Enter the 1st mark: ");
	mark1=sc.nextInt();//input 1st marks
	System.out.println("Enter the 2nd mark: ");
	mark2=sc.nextInt();//input 2nd marks
	System.out.println("Enter the 3rd mark: ");
	mark3=sc.nextInt();// input 3rd marks 
	
	if(mark1>60 && mark2>60 && mark3>60)//condition for passed
	{
	System.out.println("passed");
	}
	
	if((mark1>60 && mark2>60 && mark3<60)||(mark1>60 && mark2<60 && mark3>60)||(mark1<60 && mark2>60 && mark3>60))//condition for promoted
	{
	System.out.println("promoted");
	}
	
	else//condition for failed
	{
	System.out.println("Failed");
	}
	}
}