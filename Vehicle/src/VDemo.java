//main function
public class VDemo
{
	public static void perform(Vehicles vehicle)//function to invoke Start member function
	{
		vehicle.start();
	}

	public static void main(String[] args) 
	{
		Vehicles vehicle[]=new Vehicles[3];//define an array of object of reference type(interface)
		vehicle[0]=new TwoWheeler();
		vehicle[1]=new ThreeWheeler();
		vehicle[2]=new FourWheeler();
	
    
	for(int i=0;i<3;i++)
	{
		if(i==1)//condition only three wheeler should start
		{
		perform(vehicle[i]);//
		}
	}
	}
}
