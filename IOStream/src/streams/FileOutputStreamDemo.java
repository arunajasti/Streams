package streams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		
		
		try
		{
			fis=new FileInputStream("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");//give the file location path to read the TEXT
			fos=new FileOutputStream("\\Users\\ramaj\\OneDrive\\Documents\\Multithreadingfile.txt");//write it to an other file(change the name of file) 
			
			/*check this code
			fis=new FileInputStream("\\Users\\ramaj\\OneDrive\\Documents\\IMG_3072.jpg");//read the img
			fos=new FileOutputStream("\\Users\\ramaj\\OneDrive\\Documents\\RS.jpg");//write it to an other file(change the name) */
			
			int i;
			while((i=fis.read())!=-1)
			
			{
				fos.write(i);//here we are not using S.O.Pln//fileoutputstream
			}
		} 
		catch (FileNotFoundException e) //This catch for new File FileNotFoundException
		{
			e.printStackTrace();
		} catch (IOException e)//This catch for fis.read() IOException
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
				fos.close();
				System.out.println("File Closed");
				System.out.println("check the RS image in documents,Delete the RS img in documents and execute this program and it will be there");
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
