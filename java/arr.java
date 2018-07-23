import java.util.Scanner;
class arr{
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	int array[] = new int[15];
	int search;
	System.out.println("Enter the elements of array in:");
	for(int i=0;i<=14;i++)
	{
		array[i]=sc.nextInt();
	}
	System.out.println("Enter the element to be searched:");
	search=sc.nextInt();
	for(int k=0;k<=14;k++)
	{
		if(search==array[k])
		{
		System.out.println("Entered element is found in Array");
		return;
		}
	}
	System.out.println("Entered element is not found in array");
	}
}