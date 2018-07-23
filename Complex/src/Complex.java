//Complex Class
public class Complex {
	float real;//instance member
	float imaginary;//instance member
	float sum;//instance member
	
	public void set(float real, float imaginary)//input member function
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	void display()//Display member function
	{
		System.out.println(real+"+"+"i"+imaginary);
	}
	public static float sumReal(float real, float real1)//real Sum member function
	{
		float real2=real+real1;//Add real values;
		return real2;
		 
	}
	public static float sumImaginary(float imaginary, float imaginary1)//Imaginary Sum function 
	{
		float imaginary2=imaginary+imaginary1;//Add imaginary values;
		 return imaginary2;
	}
}
