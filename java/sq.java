import java.util.Scanner;
public class sq{
	private static Scanner sc;
	public static void main(String []args)
	{
		int n,square;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Please enter the number:");
		n=sc.nextInt();
		square=calsquare(n);
		System.out.println("\n The square of a given number is " + n + " = " + square);
		
	}
	public static int calsquare(int num)
	{
		return num * num;
	}
}