//parent class
abstract public class Base1
{
	private int i,j,k;//instance member

	public Base1(int i, int j, int k) //parameteric constructor
	{
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public Base1(int j, int k) //two parameteric constructor
	{
		super();
		this.j = j;
		this.k = k;
	}

	public Base1(int k)//single paramtere constructor
	{
		super();
		this.k = k;
	}

	public int getI() //getter
	{
		return i;
	}

	public int getJ()//getter 
	{
		return j;
		
	}

	public int getK() //getter
	{
		return k;
	}
	
	abstract public void Disp();//abstract member
}
