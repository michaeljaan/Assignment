package com.in.cg;
//class to find factorial
public class Factorial 
{
	
	public long getfact(long num) throws Exception //function to find factorial
	{
		long fact=1;
		if(num<2)
		{
			throw new Exception("Number Cannot find factorial");
		}
		long i;	
		for(i=1;i<=num;i++)
		{
		fact=fact*i;//calculate the factorial 
		}
		if(fact>2147438647)
		{
			throw new Exception("FactorialException");
		}
		return fact;
	}
}
