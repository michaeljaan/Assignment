package in.com.cg.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = null;
		int wordcount=0;
		try {
			reader = new BufferedReader(new FileReader("P:/Users/nagasr/Desktop/new.txt"));
			
			String currentLine=reader.readLine();
			while(currentLine != null)
			{
				String[] words=currentLine.split(" ");
				wordcount=wordcount +words.length;
				currentLine=reader.readLine();
			}
			System.out.println("number of Words: " + wordcount);
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
