import java.util.Scanner;
public class Repeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String word=sc.nextLine();
		int length=word.length();
		char ch;
		String ans="";
		for(int i=0;i<length;i++)
		{
			ch=word.charAt(i);
			if(ch!=' ')
				ans=ans + ch;
			word=word.replace(ch,' ');
		}
		System.out.println(ans);
		

	}

}
