import java.util.*;

//22/09/2021
//Lecture No. 22





public class TCA_Coding_21{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num, even=0 , odd=0;

		System.out.print("How many number you want to enter: ");
		int a = sc.nextInt();


		for(int i=0; i<a; i++)
		{
			System.out.print("Enter your "+ (i+1) + " numbers : ");
			num = sc.nextInt();

			if(num % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even no. : "+ even);
		System.out.println("Odd no.  : "+ odd);
	}
}



/*

import jaa.io.*;

public class TCA_Coding_21{
	public static void main(String []arg){
		for(int i=1; i<=10; i++)
		{
			System.out.println(i + " :Hello");

		}
	}

}
*/






//Display All Command line arguments
/*
import java.io.*;

public class TCA_Coding_21{
	public static void main(String []arg){
		for(int i = 0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
*/

//Display all Command line arguments in reverse order
/*
import java.io.*;

public class TCA_Coding_21{
	public static void main(String []arg){
		for(int i = (args.length-1); i>=0; i--)
		{
			System.out.println(args[i]);
		}
	}
}
*/




//Display sum of all elemet of command line arguments.
/*
import java.util.*;

public class TCA_Coding_21{
	public static void main(String []arg){
		if(args.length == 0)
		{
			System.out.println("No input is Received , So We cant perform Addition!!");
			System.exit(0);
		}

		int sum = 0;
		for(int i =0; i<args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);             //Only digit can convert
			System.out.println("Sum of all Elemets = " + sum);
		}
	}
}
*/




