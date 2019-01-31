package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
	public static void main(String[] args) {

		
		try(FileReader fr= new FileReader("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");
				BufferedReader br = new BufferedReader(fr);) 
		{
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
		
		}

	}

