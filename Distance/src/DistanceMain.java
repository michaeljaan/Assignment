//distance main function
import java.util.Scanner;
public class DistanceMain 
{

	public static void main(String[] args) {
		Distance Ram= new Distance();//object 1
		Distance Sam= new Distance();//object 2
		Distance Sum= new Distance();//sum object 
		
		Scanner scanner=new Scanner(System.in);
		int feet;//local variable
		double inch;//local variable
		
		System.out.println("Enter Ram's distance in Inches:");
		inch=scanner.nextDouble();
		Ram.setInches(inch);//input 1st inches
		System.out.println("Enter Ram's distance in Feet:");
		feet=scanner.nextInt();
		Ram.setFeet(feet);//input 1st feets 
		
		System.out.println("Enter Sam's distance in Inches:");
		inch=scanner.nextDouble();
		Sam.setInches(inch);//input 1st inches
		System.out.println("Enter Sam's distance in Feet:");
		feet=scanner.nextInt();
		Sam.setFeet(feet);//input 2nd feet
		
		inch=Sum.AddInches(Ram.getInches(), Sam.getInches());//add 2 inches
		Sum.setInches(inch);
		feet=Sum.AddFeet(Ram.getFeet(), Sam.getFeet());//add 2 feets
		Sum.setFeet(feet);
		
		System.out.println("Ram's Distance:");
		Ram.Display();//display 1st distance
		
		System.out.println("Sam's Distance:");
		Sam.Display();//display 2nd display
		
		System.out.println("Sum Distance is:");
		Sum.Display();//display sum distance
	}

}
