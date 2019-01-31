package streams;

import java.io.BufferedReader;

import java.io.InputStreamReader;

//InputStreamReader: to read the line by line data from KEYBOARD
//Another example of reading data from console until user writes stop
public class InputStreamReaderDemo {

	public static void main(String[] args) throws Exception {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
String name="";
int age;
		while(!name.equals("stop"))
		{
		System.out.println("type username and age ");
		 name=br.readLine();
		 age=Integer.parseInt(br.readLine());
		System.out.println("welcome: " + name + " & " + age + " \n");
		}
		input.close();
		br.close();

	}
	
}
