import java.io.*;
import java.lang.String;

public class TCA_toString_71
{
	public static void main(String []args)
	{
		
		String s = "Rushikesh";
		String t = new String("Rushikesh");

		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}

		System.gc();   //Use for Garbage collector

	
		String a = "RUSHI";
		//String b = "RUSHI";
		String b = new String("RUSHI");

		System.out.println("Refrence Value: " + Integer.toHexString(System.identityHashCode(a)));
		System.out.println("Refrence Value: " + Integer.toHexString(System.identityHashCode(b)));
		

		//Reference
		if(a == b)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}


		//Content
		if(a.equals(b))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

		String c = a+b;
		System.out.println(c);
		
	}
}