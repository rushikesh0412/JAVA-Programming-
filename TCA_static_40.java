import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;



class A
{
	int i = 4;
	static int j = 5;	//When a variable is declared as static, then a single copy of the variable is created and shared among all objects at a class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

	A()
	{
		System.out.println("Constructor!");
	}
	static
	{
		System.out.println("I am in static Block!");
	}
	A(int a)
	{
		System.out.println("Constructor2!");
		this.j = a;
	}

	void display()
	{
		System.out.println("class display");
		System.out.println(i);
		System.out.println(j);
	}
	static void show()
	{
		System.out.println("class show");
		//System.out.println(i);						//non-static variable i cannot be referenced from a static context
		System.out.println(j);
	}


}
public class TCA_static_40
{
	static
	{
		System.out.println("public class function!");
	}
	public static void main(String []args) throws IOException, NumberFormatException
	{

		System.out.println("Main function!");
		
		A ob = new A(5);
		System.out.println("Main = " + ob.j);
		System.out.println("Main = " + ob.i);

		ob.display();
		ob.show();

	}
}