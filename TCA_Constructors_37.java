import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

//Assignment No. 2 :  Student[rollno. , name, persent] use constructor

class Student
{
	int rollNo;								//Use to store Student Roll No. 
	String name;							//use to store Student Name
	int subj1_marks;						//use to store subj1 marks
	int subj2_marks;						//use to store subj2 marks
	int subj3_marks;						//use to store subj3 marks
	double persent;							//Use to Store Student persent
	String grade;							//use to store subject garde


	//When you right at least 1 constructor at that time cimpiler do not give you default constructor


	//when user did not pass values has call this function
	Student()
	{
		this.rollNo = 0;
		this.name = "-";
		this.subj1_marks = 0;
		this.subj2_marks = 0;
		this.subj3_marks = 0;

	}

	//When user pass values thet time has call this function
	Student(int rollNo, String name, int subj1_marks, int subj2_marks, int subj3_marks)
	{
		this.rollNo      = rollNo;
		this.name        = name;
		this.subj1_marks = subj1_marks;
		this.subj2_marks = subj2_marks;
		this.subj3_marks = subj3_marks;


		persent = (subj1_marks + subj2_marks + subj3_marks)/3.0;             	//Use to calculate persentage


		//Calculate Grade
		if((subj1_marks<=40) || (subj2_marks<=40) || (subj3_marks<=40))
		{
			grade = "Fail!              ";
		}
		else
		{
			if(70 < persent)
			{
				grade = "Distinction!       ";
			}
			else if((60 < persent) && (persent <= 70))
			{
				grade = "First Class!       ";
			}
			else if((50 < persent) && (persent <= 60))
			{
				grade = "Second Class!      ";
			}
			else if((40 < persent) && (persent <= 50))
			{
				grade = "Pass Class!        ";
			}
			else
			{
				grade = "Fail!              ";
			}
		}
	}

	void display()
	{
		
		System.out.println("*\t"+ rollNo +"\t\t"+ name +"\t\t\t"+ subj1_marks +"\t\t"+ subj2_marks +"\t\t"+ subj3_marks +"\t\t\t"+ String.format("%.2f",persent) +"\t\t"+ grade +"\t*" ); //Use for display result
	}
}
public class TCA_Constructors_37 
{
	public static void main(String []args) throws IOException, NumberFormatException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("");

		System.out.print("How many number of Students? : ");
		int n = Integer.parseInt(br.readLine());								   		//How many number of student?

		System.out.println("");

		Student ob[] = new Student[n];										        	//Create number of students object
		for(int i=0; i<n; i++)
		{

			System.out.print("Enter your name        : " );
			String name    = br.readLine();												//Input user Student name

			System.out.print("Enter your subj1 marks : " );
			int subj1_marks  = Integer.parseInt(br.readLine());							//Input user Subj1 marks

			System.out.print("Enter your subj2 marks : " );
			int subj2_marks  = Integer.parseInt(br.readLine());							//Input user Subj2 marks

			System.out.print("Enter your subj3 marks : " );
			int subj3_marks  = Integer.parseInt(br.readLine());							//Input user Subj3 marks


			//ob[i] = new Student(i+1, name, subj1_marks, subj2_marks, subj3_marks);		//Create object

			ob[i] = new Student();		//Create object

			System.out.println("\n");
			
		}
		System.out.println("\n");


		System.out.println("*------------------------------------------------------------- STUDENT RESULT ------------------------------------------------------------------*");
		System.out.println("*-----------------------------------------------------------------------------------------------------------------------------------------------*");
		System.out.println("*\t"+"Roll No."+"\t"+"Student Name"+"\t\t"+"Subject1 Marks"+"\t"+"Subject2 Marks"+"\t"+"Subject3 Marks"+"\t\t"+"Persent"+"\t\t"+"Grade"+"\t\t\t*" );
		System.out.println("*-----------------------------------------------------------------------------------------------------------------------------------------------*");
		for(int i=0; i<n; i++)
		{
			ob[i].display();												//call display function
		}
		System.out.println("*-----------------------------------------------------------------------------------------------------------------------------------------------*");
		

	}
}
