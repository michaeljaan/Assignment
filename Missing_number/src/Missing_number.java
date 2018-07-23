import java.util.Scanner;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n= sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<n;i++ )
		{
			array[i]=sc.nextInt();
		}
		int total= (n+1)*(n+2)/2;
		for(int j=0;j<n;j++)
		{
			total-=array[j];
		}
		System.out.println("The missing number is: "+total);
	}

}
