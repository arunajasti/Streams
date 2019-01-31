package streams;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {

			fis = new FileInputStream("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");//give the path of file
			System.out.println("File Opened");
			int i;
			while ((i = fis.read()) != -1)// int thats why -1
			{
				System.out.print((char) i);
			}
			//fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
				System.out.println("\n File Closed");
			} catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}

		
	}

}
