import java.util.Scanner;
class bub{
	public static void main(String []args)
	{
	Scanner sc= new Scanner(System.in);
	int array[]= new int[11];
	System.out.println("Enter the elements of array in:");
	for(int i=0;i<10;i++)
	{
		array[i]=sc.nextInt();
	}
	for(int j=0;j<=8;j++)
	{
		for(int k=0;k<=j-1;k++)
		{
			if(array[k] > array[k+1])
			{
			int temp=array[k];
			array[k]=array[k+1];
			array[k+1]=temp;
			}
		}
	}
	System.out.println("Sorted array is:");
	for(int i=0;i<10;i++)
	{
		System.out.print(array[i] + " ");
	}
	}
}