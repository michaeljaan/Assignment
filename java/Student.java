//main function
import java.util.Scanner;
class Students
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int a[]= new int[3];//Array of subject A
		int b[]= new int[3];//Array of Subject B
		int c[]= new int[3];//Array of subject C
		
		System.out.println("Enter the marks of each student in subject A");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();//Enter marks in subject A
		}
		System.out.println("Enter the marks of each student in subject B");
		for(int i=0;i<3;i++)
		{
			b[i]=sc.nextInt();//Enter marks in subject B
		}
		System.out.println("Enter the marks of each student in subject C");
		for(int i=0;i<3;i++)
		{
			c[i]=sc.nextInt();//Enter marks in subject C
		}
		int total1=0;double avg1=0.0;
		for(int i=0;i<3;i++)
		{
			total1=total1+a[i];//calculate total
			avg1=total1/3;//calculate average
		}
		System.out.println("Total and Average of subject A");
		System.out.println("total:"+total1+"\n"+"Average"+avg1);
		int total2=0;double avg2=0.0;
		for(int i=0;i<3;i++)
		{
			total2=total2+b[i];
			avg2=total2/3;
		}
		System.out.println("Total and Average of subject B");
		System.out.println("total:"+total2+"\n"+"Average"+avg2);
		int total3=0;double avg3=0.0;
		for(int i=0;i<3;i++)
		{
			total3=total3+c[i];
			avg3=total3/3;
		}
		System.out.println("Total and Average of subject C");
		System.out.println("total:"+total3+"\n"+"Average"+avg3);
	}	
}