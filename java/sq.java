//main function Square of number
import java.util.Scanner;
public class Square
{
	private static Scanner scanner;
	public static void main(String []args)
	{
		int number,square;
		Scanner scanner;
		scanner=new Scanner(System.in);
		
		System.out.println("Please enter the number:");
		number=sc.nextInt();//input number to be square
		
		square=calsquare(number);//invoking square function
		System.out.println("\n The square of a given number is " + number + " = " + square);//output result
		
	}
	public static int calsquare(int num)//Square function 
	{
		return num * num;//return 
	}
}