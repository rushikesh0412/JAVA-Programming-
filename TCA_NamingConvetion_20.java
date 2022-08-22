//package name always in small letter


import java.io.*;









class Student{               //In the class every words starting to the capital letter

	void studentName()      //Method name stating to the small letter but sub sequent letter must be capital
	{

	}
}

public class TCA_NamingConvetion_20{
	
	public static void main(String []args)
	{
		//int a = 50;
		//int b = 30;
		//int c = a+b;              //Aerthmetic operator



		//System.out.println("Answer " + a + b);        //Concatination operator
		//System.out.println("Answer " + (a + b)); 
		//System.out.println("sum of "+ a + " and " + b +" is "+ c);




		//String c = "11";
		//String c = "INDIA";     //NumberFormatException occurs
		//int i = Integer.parseInt(c);     //type casting ,Only digit value can store
		//System.out.println("Output: " + i);


		//Q.1 Do addition of two numbe, but number 
		//input = "11" "22"


		//*******************************************************************************************************************
		if(args.length == 2)
		{

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;

		System.out.println("Addition of two number from commant line inputs " + c);
		}
		else
		{
			System.out.println("Invaid number of Arguments");

		}

		

		
		//**********************************************************************************************************************
		int count = 0;
		for(int i=0; i<args.length; i++)
		{
			int a = Integer.parseInt(args[i]);
			count += a;
		}
		System.out.println("Addition of two number from commant line inputs " + count);
	}
}















/*

//Display sum of the all elemets from the command line elements


public class TCA_NamingConvetion_20{
	public static void main(String []args)
	{
		if(args.length == 0)
		{
			System.out.println("No input came from command line!!");
			System.exit(0);
		}
		int sum = 0;

		for(int i=0; i<args.length; i++)
		{
			int num = Integer.parseInt(args[i]);
			sum = sum + num;
		}
		System.out.println("Addition is : " + sum);


	}
}

*/








