package in.co.cg.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class calculatorAdd {

	@Test
	//@Ignore
	public void AddTwoPositive()
	{
		Calculator Add=new Calculator();
		int ans=Add.add(5,5); 
		Assert.assertEquals(10, ans);
	}
	
	@Test
	public void AddTwoNegative()
	{
		Calculator Add=new Calculator();
		int ans=Add.add(-45,-5); 
		Assert.assertEquals(-50, ans);
	}
	@Test
	public void AddOnePositiveAndOneNegative()
	{
		Calculator Add=new Calculator();
		int ans=Add.add(-45,5); 
		Assert.assertEquals(-40, ans);
	}
	@Test
	public void AddTwoZeroes()
	{
		Calculator Add=new Calculator();
		int ans=Add.add(0,0); 
		Assert.assertEquals(0, ans);
	}
	
	


}
