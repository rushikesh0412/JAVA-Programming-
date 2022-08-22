import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

class Student
{
	int i;
	int x;
	int y;

	Student()
	{
		//this(-1);							// call to the function Student(int i)
		this(-1, 1);             			//call to the function Student(int x, int y)
	}
	Student(int i)
	{
		this.i = i;
		this.display();
	}
	Student(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.display();      //Call to the display function
	}
	Student(Student temp)
	{
		x = temp.x;
		y = temp.y;
		this.display();
	}
	

	void display()
	{
		int i =33;
		System.out.println("i = " + i);

		System.out.println("i = " + this.i);
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}

}
public class TCA_this_38 
{
	public static void main(String []args) throws IOException, NumberFormatException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");

		Student ob = new Student();
		//ob.display();


		Student ob2 = new Student(ob);




	}
}