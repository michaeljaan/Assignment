class arm
{
	public static void main(String []args)
	{
		int c=0,n=153,rem,t;
		t=n;
		while(n!=0)
		{
		rem=n%10;
		n=n/10;
		c=c+(rem*rem*rem);
		}
		if(t==c)
		{
			System.out.println("no is armstrong");
			
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}
}