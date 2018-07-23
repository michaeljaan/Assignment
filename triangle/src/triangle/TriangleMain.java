package triangle;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sides of Triangle");
		int side1=scanner.nextInt();
		int side2=scanner.nextInt();
		int side3=scanner.nextInt();
		
		Triangle triangle=new Triangle(side1,side2,side3);
		
		System.out.println("right?"+triangle.isRight());
		System.out.println("Isosceles?"+triangle.isIsosceles());
		System.out.println("Scalene?"+triangle.isScalene());
		System.out.println("Equilateral?"+triangle.isEquilateral());
		
	}

}
