package in.com.cg.files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfLine {

	public static void main(String[] args) throws IOException
	{
		int lineCount =0;
		
		BufferedReader reader=new BufferedReader(new FileReader("P:/Users/nagasr/Desktop/new.txt"));
		while(true)
		{
			String line=reader.readLine();
			if(line==null)
			{
				break;
			}
				lineCount++;
			
		}
		reader.close();
		System.out.println("Line Count= "+lineCount);
	}

}
