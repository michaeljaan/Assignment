package in.co.cg.test;
//class defning various test cases of division
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorDiv
{
	@Test
	public void DivTwoPositive()
	{
		Calculator Div=new Calculator();
		int ans=Div.div(10,5); 
		Assert.assertEquals(2, ans);
	}
	
	@Test
	public void DivTwoNegative()
	{
		Calculator Div=new Calculator();
		int ans=Div.div(-50,-5); 
		Assert.assertEquals(10, ans);
	}
	@Test
	public void DivOnePositiveAndOneNegative()
	{
		Calculator Div=new Calculator();
		int ans=Div.div(25,-5); 
		Assert.assertEquals(-5, ans);
	}
	@Test
	public void DivOneNegativeAndOnePosition()
	{
		Calculator Div=new Calculator();
		int ans=Div.div(-25,5); 
		Assert.assertEquals(-5, ans);
	}
	@Test(expected = java.lang.ArithmeticException.class)//exception case
	public void DivByZeroes()
	{
		Calculator Div=new Calculator();
		int ans=Div.div(4,0); 
		Assert.assertEquals(4, ans);
	}
	
	
}
