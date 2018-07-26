package in.co.cg.test;
//addition class defining various test cases
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorMultiply {

	@Test
	public void MulTwoPositive()
	{
		Calculator Mul=new Calculator();
		int ans=Mul.mul(10,5); 
		Assert.assertEquals(50, ans);
	}
	
	@Test
	public void MulTwoNegative()
	{
		Calculator Mul=new Calculator();
		int ans=Mul.mul(-5,-5); 
		Assert.assertEquals(25, ans);
	}
	@Test
	public void MulOnePositiveAndOneNegative()
	{
		Calculator Mul=new Calculator();
		int ans=Mul.mul(5,-5); 
		Assert.assertEquals(-25, ans);
	}
	@Test
	public void MulOneNegativeAndOnePosition()
	{
		Calculator Mul=new Calculator();
		int ans=Mul.mul(-5,5); 
		Assert.assertEquals(-25, ans);
	}
	@Test
	public void MulTwoZeroes()
	{
		Calculator Mul=new Calculator();
		int ans=Mul.mul(0,0); 
		Assert.assertEquals(0, ans);
	}
	
}
