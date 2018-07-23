import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double newItem=0.0;
		double discount=0.0;
		double newItemPrice=0.0;
		System.out.println("Enter the Original Price of item:");
		newItem= sc.nextDouble();
		discount=newItem*0.35;
		newItemPrice=newItem-discount;
		System.out.println("The new price of item is : "+newItemPrice);

	}

}
