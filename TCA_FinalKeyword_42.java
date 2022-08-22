import java.io.*;
import java.util.*;


class KeywordsFinal
{
	final static int a = 4;	//The static keyword means the value is the same for every instance of the class. The final keyword means once the variable is assigned a value it can never be changed. The combination of static final in Java is how to create a constant value.
	final int b = 5;		//Java final keyword is a non-access specifier that is used to restrict a class, variable, and method. If we initialize a variable with the final keyword, then we cannot modify its value. If we declare a method as final, then it cannot be overridden by any subclasses.
	//final static int c;
	final int d;

	KeywordsFinal(int c, int d)
	{

		//this.a = c;									//cannot assign a value to final variable a
		//this.b = d;									//cannot assign a value to final variable a
		//this.c = c;									//cannot assign a value to final static variable c
		this.d = d;										//Whene you declare final variable only once you can Assign it
	}
	void display()
	{
		
		
		System.out.println("a = " + a);
		//a++;											//cannot assign a value to final variable a   
		System.out.println("b = " + b);
		//b++;											//cannot assign a value to final variable b


		//System.out.println("c = " + c);				//variable c might not have been initialized
		System.out.println("d = " + d);
		System.out.println("d = " + d);
		//final static int e = 6;						//modifier static not allowed here
		//System.out.println("e = " + e);

		final int f = 9;
		System.out.println("f = " + f);
	}
}

public class TCA_FinalKeyword_42
{
	public static void main(String []args)
	{
		KeywordsFinal k1 = new KeywordsFinal(1,2);

		k1.display();
	}
}