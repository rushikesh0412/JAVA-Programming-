import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

/*Assignment:  
			1. 	Define class MyNnmber having one private data member int data
				Write a appropriate constructor (use this)
				isNegative()
				isPositive
				isXero
				is Odd
				isEven
				create an object in main
				Use command line argument to pass a value to the object and perform the above test
*/

class MyNumber
{
	private int data;                     //Can not access outside the class
	
	MyNumber()
	{
		this.data = 0;
	}
	MyNumber(int num)
	{
		this.data = num;
	}

	//Use to test number is negative or not
	boolean isNegative()
	{
		return (this.data < 0);
	}

	//Use to test number is positive or not
	boolean isPositive()
	{
		return (this.data >= 0);
	}

	//Use to test nuber is Zero or not
	boolean isZero()
	{
		return (this.data == 0);
	}

	//Use to test number is Odd or not
	boolean isOdd()
	{
		return (this.data%2 != 0);
	}

	//Use to test number is Even or not
	boolean isEven()
	{
		return (this.data%2 == 0);
	}
	

}
public class TCA_AccessSpecifiers_39 
{
	public static void main(String []args) throws IOException, ArrayIndexOutOfBoundsException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");

		MyNumber ob[];														//Create object
		
		


		if((args.length) == 0)												//If do not get input from command line argument then if condition use
    	{
        	System.out.print("How many number you want to enter? : ");
			int n = Integer.parseInt(br.readLine());
			args = new String[n];                                            //create number of object

			for(int i=0; i<n; i++)
			{
				System.out.print("args["+ i +"] = ");
				args[i] = br.readLine();
			}
			System.out.println("\n");


			ob = new MyNumber[(args.length)];
			int num;
			for(int i=0; i<args.length; i++)
			{
				num = Integer.parseInt(args[i]);							//Convert string to int
				ob[i] = new MyNumber(num);
			}
    	}
    	else                                                       			//Whene inputs come from command line arguments the else condition use
    	{

			ob = new MyNumber[(args.length)];
			int num;
			for(int i=0; i<args.length; i++)
			{
				num = Integer.parseInt(args[i]);							//Convert string to int
				ob[i] = new MyNumber(num);
			}

		}

		//Display logic 1
		for(int i=0; i<args.length; i++)
		{
			System.out.println("Given number is: " + args[i]);

			if(ob[i].isPositive())
			{
				System.out.println("\tPositive Number      ");
			}
			else
			{
				System.out.println("\tNot a Positive Number");
			}

			
			if(ob[i].isNegative())
			{
				System.out.println("\tNegative Number      ");
			}
			else
			{
				System.out.println("\tNot Negative Number  ");
			}

			
			if(ob[i].isEven())
			{
				System.out.println("\tEven Number          ");
			}
			else
			{
				System.out.println("\tNot Even Number      ");
			}

			
			if(ob[i].isOdd())
			{
				System.out.println("\tOdd Number           ");
			}
			else
			{
				System.out.println("\tNot Odd Number       ");
			}

			
			if(ob[i].isZero())
			{
				System.out.println( "\tis a Zero           ");
			}
			else
			{
				System.out.println("\tNot a Zero           ");
			}

			System.out.println();
		}

		//Display Logic 2
		for(int i=0; i<args.length; i++)
		{
			System.out.println("Given number is " + args[i]);
			System.out.println("--------------------------");

			System.out.println("Is Positive :"+ isPositive());
			System.out.println("Is Positive :"+ isNegative());
			System.out.println("Is Positive :"+ isZero()    );
			System.out.println("Is Positive :"+ isEven()    );
			System.out.println("Is Positive :"+ isOdd()     );
		}


	}
}