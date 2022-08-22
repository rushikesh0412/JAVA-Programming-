import java.io.*;
import java.util.Date;

class A
{
	int rollNo = 101;
	String name;
	int sub1, sub2, sub3, sub4, sub5;



	A(String name , int... marks)
	{
		this.name = name;
		this.sub1 = marks[0];
		this.sub2 = marks[1];
		this.sub3 = marks[2];
		this.sub4 = marks[3];
		this.sub5 = marks[4];
	}

	void display()
	{
		System.out.println("*-------------------Student Information----------------*");
		System.out.println("Roll No. \tName \tsub1 \tsub2 \tsub3 \tsub4 \tsub5");
		System.out.println(rollNo + "\t\t" +name +"\t" + sub1 +"\t" + sub2 +"\t"+ sub3 +"\t"+ sub4 +"\t"+ sub5);
		
	}
}
public class TCA_NumbersOfVariables_44
{
	public static void main(String []args)
	{
		A a = new A("Rushi", 15, 14 , 63, 85, 85);     //Create Object
		a.display();                                   //Display student Information

		
	}
}