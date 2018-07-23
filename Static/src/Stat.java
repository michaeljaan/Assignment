//Class
public class Stat
{
	int i;//non-static member instance
	static int j;//static member instance
	
	public void disp()//non-static member function
	{
		System.out.println(j);//Static instance can be used in non static member function;
	}
	public static void disp1()//static member function
	{
		System.out.println(j);//Non static instance cannot be used in Static member function;
	}
}
