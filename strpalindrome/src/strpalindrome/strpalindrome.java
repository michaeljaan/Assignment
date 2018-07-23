package strpalindrome;
import java.util.Scanner;
public class strpalindrome {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string to be reverse:");
	String str= sc.nextLine();
	String [] words = str.split(" ");
	String reverse="";
	for(int i=0;i<words.length;i++)
	{
		for(int j=words[i].length()-1;j>=0;j--)
		{
			reverse += words[i].charAt(j);
		}
		System.out.print(reverse + " ");
		reverse = "";
	}
	}

}
