
public class Complex {
	float real;
	float imaginary;
	float sum;
	
	public void set(float real, float imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	void display()
	{
		System.out.println(real+"+"+"i"+imaginary);
	}
	public static float sumReal(float real, float real1)
	{
		float real2=real+real1;
		return real2;
		 
	}
	public static float sumImaginary(float imaginary, float imaginary1)
	{
		float imaginary2=imaginary+imaginary1;
		 return imaginary2;
	}
	
	
	
}
