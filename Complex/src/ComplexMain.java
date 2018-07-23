//Complex main function
import java.util.Scanner;
public class ComplexMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Complex complex= new Complex();//object 1
		Complex comPlex= new Complex();//object 2
		Complex compleX= new Complex();//object 3(sum)
	
		System.out.println("Enter the real part of first number");
		complex.real=scanner.nextFloat();//imput 1st real value
		
		System.out.println("Enter the imag part of first number");
		complex.imaginary=scanner.nextFloat();//input 1st Imaginary value
		
		System.out.println("Enter the real part of second number");
		comPlex.real=scanner.nextFloat();//input 2nd real value
		
		System.out.println("Enter the imag part of second number");
		comPlex.imaginary=scanner.nextFloat();//input 2nd imaginary value
		
		complex.display();//display 1st complex number
		comPlex.display();//display 2nd complex number
		
		compleX.real=Complex.sumReal(complex.real,comPlex.real);//assign real sum value to 3rd complex
		compleX.imaginary=Complex.sumImaginary(complex.imaginary,comPlex.imaginary);//assign imaginary sum value to 3rd complex
		compleX.display();//display 3rd complex number

	}

}
