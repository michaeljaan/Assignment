import java.util.Scanner;
class marks{
	public static void main(String []args)
	{
	Scanner sc= new Scanner(System.in);
	int mark1,mark2,mark3;
	System.out.println("Enter the 1st mark: ");
	mark1=sc.nextInt();
	System.out.println("Enter the 2nd mark: ");
	mark2=sc.nextInt();
	System.out.println("Enter the 3rd mark: ");
	mark3=sc.nextInt();
	if(mark1>60 && mark2>60 && mark3>60)
	{
	System.out.println("passed");
	}
	if((mark1>60 && mark2>60 && mark3<60)||(mark1>60 && mark2<60 && mark3>60)||(mark1<60 && mark2>60 && mark3>60))
	{
	System.out.println("promoted");
	}
	else
	{
	System.out.println("Failed");
	}
	}
}