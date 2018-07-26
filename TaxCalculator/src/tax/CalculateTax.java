package tax;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTax {

	@Test
	public void test1(String EmpName, String IsIndian, Double EmpSal)
	{
		TaxCalculator EmpTax=new TaxCalculator();
		double ans=EmpTax.taxmAmount(100000);
		Assert.assertEquals(8000,ans,0);
		
	}

}
