package palindrome;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int number,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		int n=number;
		if(number<=0)
		{
			System.out.println("invalid number");
			return;
		}
		while(number>0)
		{
			int x=number%10;
			temp=temp*10 + x;
			number= number/10;
		}
		if(temp==n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
