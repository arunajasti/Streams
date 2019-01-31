package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderWithStringTokenizer {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr=new FileReader("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");
		BufferedReader br=new BufferedReader(fr);

		String line;
		int count=0;
		try {
			while((line=br.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(line);
				System.out.println("Break the string into Tokens: " );
				while(str.hasMoreTokens())
				{
				System.out.println( str.nextToken());
				count++;
			}}
			System.out.println("how many words in the file: " + count++);//print how many tokens in that file
		} catch (IOException e) //this is while catch
		{
			
			e.printStackTrace();
		}
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
