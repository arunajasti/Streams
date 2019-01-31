package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		// instance
		try {
			fr = new FileReader("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");
			br = new BufferedReader(fr);
			
			String line;
			while((line=br.readLine()) != null)
			{
				System.out.println(line);
			}
		} 
		catch (FileNotFoundException e)//filereader catch
		{
          e.printStackTrace();
		} catch (IOException e) //while catch
		{
			
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
				System.out.println("\n File is reading Successfully.....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
