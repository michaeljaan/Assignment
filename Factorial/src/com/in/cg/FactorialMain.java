package com.in.cg;
//main function to calculate factorial of a given number
import java.util.Scanner;
public class FactorialMain {

	public static void main(String[] args) 
	{
		Factorial fact=new Factorial();//object creation
		
		long factorial;//variable declation
		try {//exceptional handling
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number:");
			long num=scanner.nextInt();//input the number to find factorial
			factorial=fact.getfact(num);//invoking function
			System.out.println(factorial);//output factorial
		}catch (Exception e) {
			e.printStackTrace();	
		}
		
		
	}

}

