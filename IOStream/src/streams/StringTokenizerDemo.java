package streams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s1 = "Aruna will get a job very soon";
		StringTokenizer str = new StringTokenizer(s1);// first constructor pass int he string

		/*
		 * or StringTokenizer str=new StringTokenizer("Aruna will get a job very soon");
		 */
		System.out.println("Using 1st Constructor string");
		while (str.hasMoreTokens())// split the string into multiple tokens
		{
			System.out.println(str.nextToken());
		}

		String s2 = "Aruna, will, get, a ,job ,very, soon";// here delimiter is "," comma just separate commas by using
		// 2nd constuctor
		StringTokenizer str1 = new StringTokenizer(s2, ",");
		System.out.println("\n");
		System.out.println("Using 2nd constructor string, demiliter ");
		while (str1.hasMoreTokens())// split the string into multiple tokens
		{
			System.out.println(str1.nextToken());

		}

		String s3 = "Aruna, will, get, a ,job ,very, soon";// here delimiter is "," comma just separate commas by using
		// 2nd constuctor
		StringTokenizer str2 = new StringTokenizer(s3, ",", false);// if boolean is true it shows with comma in o/p if
																	// its false it doesnt show commas in o/p
		System.out.println("\n");
		System.out.println("Using 3rd constructor string,delimiter,boolean ");
		while (str2.hasMoreTokens())// split the string into multiple tokens
		{
			System.out.println(str2.nextToken());
		}
	}
}
