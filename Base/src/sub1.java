//child class
public class sub1 extends Base1
{
	private int m;

	public sub1(int i, int j, int k, int m) //all parameter constructor
	{
		super(i, j, k);
		this.m = m;
	}

	public sub1( int j, int k, int m)//3 parameter constructor
	{
		super(j, k);
		this.m = m;
	}
	public sub1(int k, int m) //2 parameter constructor
	{
		super(k);
		this.m = m;
	}

	public void Disp()//display member function
	{
		System.out.println(getI()+","+getJ()+","+getK()+","+m);

	}
	
}
