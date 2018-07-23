import java.util.Scanner;
public class ComplexMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Complex complex= new Complex();
		Complex comPlex= new Complex();
		Complex compleX= new Complex();
	
		System.out.println("Enter the real part of first number");
		complex.real=scanner.nextFloat();
		
		System.out.println("Enter the imag part of first number");
		complex.imaginary=scanner.nextFloat();
		
		System.out.println("Enter the real part of second number");
		comPlex.real=scanner.nextFloat();
		
		System.out.println("Enter the imag part of second number");
		comPlex.imaginary=scanner.nextFloat();
		
		complex.display();
		comPlex.display();
		
		compleX.real=Complex.sumReal(complex.real,comPlex.real);
		compleX.imaginary=Complex.sumImaginary(complex.imaginary,comPlex.imaginary);
		compleX.display();

	}

}
