package streams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriter {

	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;

		// create a instance
		fr = new FileReader("\\Users\\ramaj\\OneDrive\\Documents\\Multithreading.txt");// given the file location path
		fw = new FileWriter("\\Users\\ramaj\\OneDrive\\Documents\\copyMulitithreading.txt");// using same path but
																							// different file name,
																							// write that same date into
																							// another file.

		int i;// read the data
		while ((i = fr.read()) != -1) 
		{
			fw.write(i);
		}
		System.out.println("file is closed");

		fr.close();
		fw.close();
	}

}
