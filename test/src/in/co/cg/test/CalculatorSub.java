package in.co.cg.test;
//subtraction class defining various test cases
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorSub {

	@Test
	public void SubTwoPositive()
	{
		Calculator Sub=new Calculator();
		int ans=Sub.sub(10,5); 
		Assert.assertEquals(5, ans);
	}
	
	@Test
	public void SubTwoNegative()
	{
		Calculator Sub=new Calculator();
		int ans=Sub.sub(-45,-5); 
		Assert.assertEquals(-40, ans);
	}
	@Test
	public void SubOnePositiveAndOneNegative()
	{
		Calculator Sub=new Calculator();
		int ans=Sub.sub(45,-5); 
		Assert.assertEquals(50, ans);
	}
	@Test
	public void SubOneNegativeAndOnePosition()
	{
		Calculator Sub=new Calculator();
		int ans=Sub.sub(-45,5); 
		Assert.assertEquals(-50, ans);
	}
	@Test
	public void SubTwoZeroes()
	{
		Calculator Sub=new Calculator();
		int ans=Sub.sub(0,0); 
		Assert.assertEquals(0, ans);
	}
}
