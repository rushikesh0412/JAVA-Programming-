import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

//Assignment : 2. student[rollnumber , name , subj1, subj2, subj3, persent, grade]

class Student
{
	String rollNo;					//Use to store Student Roll No. 
	String name;				//use to store Student Name
	int subj1_marks;			//use to store subj1 marks
	int subj2_marks;			//use to store subj2 marks
	int subj3_marks;			//use to store subj3 marks
	double persent;				//Use to Store Student persent
	String grade;				//use to store subject garde
	

	void accept(int i) throws IOException
	{

    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		//System.out.print("Enter your roll no.    : " );
		//rollNo  = Integer.parseInt(br.readLine());						    //Accept Student roll no.

		rollNo = "Cor13_"+ String.valueOf(i+1);

		System.out.print("Enter your name        : " );
		name    = br.readLine();											    //Accept Student name

		System.out.print("Enter your subj1 marks : " );
		subj1_marks  = Integer.parseInt(br.readLine());							//Accept Subj1 marks

		System.out.print("Enter your subj2 marks : " );
		subj2_marks  = Integer.parseInt(br.readLine());							//Accept Subj2 marks

		System.out.print("Enter your subj3 marks : " );
		subj3_marks  = Integer.parseInt(br.readLine());							//Accept Subj3 marks
		System.out.println("");


		persent = (subj1_marks + subj2_marks + subj3_marks)/3.0;             	//Use to calculate persentage

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
		
		System.out.println("*\t"+ rollNo +"\t\t"+ name +"\t\t"+ subj1_marks +"\t\t\t"+ subj2_marks +"\t\t\t"+ subj3_marks +"\t\t\t"+ String.format("%.2f",persent) +"\t\t"+ grade +"*" ); //Use for display result
	}
}
public class TCA_StudentResult_36
{
	public static void main(String []args) throws IOException, CloneNotSupportedException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many number of Students? : ");
		int n = Integer.parseInt(br.readLine());							//How many number of student?

		Student ob[] = new Student[n];										//Create number of students object
		for(int i=0; i<n; i++)
		{
			ob[i] = new Student();											//Create object
			ob[i].accept(i);													//Use for accept inputs
			
		}
		System.out.println("\n");

		System.out.println("*-------------------------------------------------------------------STUDENT RESULT-----------------------------------------------------------------*");
		System.out.println("*--------------------------------------------------------------------------------------------------------------------------------------------------*");
		System.out.println("*\t"+"Roll No."+"\t"+"Student Name"+"\t"+"Subject1 Marks"+"\t\t"+"Subject2 Marks"+"\t\t"+"Subject3 Marks"+"\t\t"+"Persent"+"\t\t"+"Grade"+"\t\t   *");
		System.out.println("*--------------------------------------------------------------------------------------------------------------------------------------------------*");
		for(int i=0; i<n; i++)
		{
			ob[i].display();												//call display function
		}
		System.out.println("*--------------------------------------------------------------------------------------------------------------------------------------------------*");

	}
}