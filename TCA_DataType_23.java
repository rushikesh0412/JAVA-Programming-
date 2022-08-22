//23-sep-2021
//Lecture no. :- 22


/*
import java.util.*;

public class TCA_DataType_23{
	public static void main(String []args)
	{

		//Primitive Data type

		byte a = -25;         //1 byte use memory  = 2^8  bit - 1(signed bit)   (-128 to 127 in the range number you can store)                 (1 byte = 8 block - 1(Signed ane unsign))
		float b = 9.5f;     //4 byte is use        = 2^32 bit - 1(signed bit)   (float b = 4.5;   shows an error)
		double c = 5.6;     //8 byte is use        = 2^64 bit - 1(signed bit)   ( 5.777777777  that type of number can store)
		char d = 'A';       //2 byte memory used   = 2^16 bit                   (character , any sigle digit number, spcial character, space)     ( )
		boolean e = true;     //1 bit  memory use  = 2^1  bit - 1(signed bit)   (true or false)



		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		//System.out.println(f);
	}
}
*/



import java.util.*;
public class TCA_DataType_23{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();

		System.out.println("Addition : " + (args[0] + a));
	}
}