package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader: to read the line by line data from KEYBOARD
public class InputStreamReaderWithBufferedReader {

	public static void main(String[] args) throws IOException {
		
InputStreamReader input=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(input);

System.out.println("type username ");
String name=br.readLine();
System.out.println("welcome: " + name);
	}
	
}
