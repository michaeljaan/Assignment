import java.util.Scanner;
public class DistanceMain {

	public static void main(String[] args) {
		Distance Ram= new Distance();
		Distance Sam= new Distance();
		Distance Sum= new Distance();
		
		Scanner scanner=new Scanner(System.in);
		int feet;
		double inch;
		
		System.out.println("Enter Ram's distance in Inches:");
		inch=scanner.nextDouble();
		Ram.setInches(inch);
		System.out.println("Enter Ram's distance in Feet:");
		feet=scanner.nextInt();
		Ram.setFeet(feet);
		
		System.out.println("Enter Sam's distance in Inches:");
		inch=scanner.nextDouble();
		Sam.setInches(inch);
		System.out.println("Enter Sam's distance in Feet:");
		feet=scanner.nextInt();
		Sam.setFeet(feet);
		
		inch=Sum.AddInches(Ram.getInches(), Sam.getInches());
		Sum.setInches(inch);
		feet=Sum.AddFeet(Ram.getFeet(), Sam.getFeet());
		Sum.setFeet(feet);
		
		
		
		
		System.out.println("Ram's Distance:");
		Ram.Display();
		System.out.println("Sam's Distance:");
		Sam.Display();
		System.out.println("Sum Distance is:");
		Sum.Display();
	}

}
