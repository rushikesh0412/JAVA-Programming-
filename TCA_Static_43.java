import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

class Student{
	int rollno;
	String name;
	double per;
	static int cnt = 101;

	Student(String name, double per)
	{
		this.rollno = cnt;
		cnt++;
		this.name = name;
		this.per = per;

	}
	void display()
	{
		System.out.println(rollno + "\t\t" + name + "\t\t" + per);
	}
	static void toppers(Student tob[])
	{
		double max = 0.0;

		for(int i=0; i<tob.length; i++)
		{
			if(tob[i].per > max)
			{
				max = tob[i].per;
			}
		}

		System.out.println("*********** List of Topper ************");
		System.out.println("*-------- Student Information --------*");
		System.out.println("RollNo. \t Name \t persent");
		System.out.println("*-------------------------------------*");
		for(int i=0; i<tob.length; i++)
		{
			if(tob[i].per == max)
			{
				System.out.println(tob[i].rollno + "\t\t" + tob[i].name + "\t\t" + tob[i].per);
			}
		}
		System.out.println("\t");

	}
	static void allDisplay(Student tob[])
	{
		System.out.println("*-------- Student Information --------*");
		System.out.println("RollNo. \t Name \t persent");
		System.out.println("*-------------------------------------*");
IOException, NumberFormatException
		for(int i=0; i<tob.length; i++)
		{
			tob[i].display();
		}
		System.out.println("\t");
	}
	static void sort(Student tob[])
	{
		for(int i=tob.length-1; i>0; i--)
		{
			for(int j=0; j<i; j++)
			{
				if(tob[j].per > tob[j+1].per)
				{
					Student temp = tob[i];
					tob[j] = tob[j+1];
					tob[j+1] = temp;
				}
			}
		}
	}
}
public class TCA_Static_43
{
	public static void main(String []args) throws 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How may student : ");
		int n = Integer.parseInt(br.readLine());

		Student ob[] = new Student[n];

		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter name: ");
			String sname = br.readLine();

			System.out.print("Enter persent: ");
			double sper = Double.parseDouble(br.readLine());

			ob[i] = new Student(sname , sper);
		}


		Student.allDisplay(ob);											//Display Student Information

		Student.toppers(ob);

		Student.sort(ob);

		System.out.println("\n");
		System.out.println("Data After Sorting persentagewise");

		Student.allDisplay(ob);


	}
}