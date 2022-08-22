import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

//Assignment No. 2 :  Student[rollno. , name, persent]

class Student
{
	int rollNo;					//Use to store Student Roll No. 
	String name;				//use to store Student Name
	double persent;				//Use to Store Student persent 

	void accept() throws IOException
	{
		//InputStreamReader r=new InputStreamReader(System.in);    
    	//BufferedReader br=new BufferedReader(r); 

    	//or

    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    	//or

		//Scanner sc = new Scanner(System.in);

		System.out.print("Enter your roll no. : ");
		rollNo  = Integer.parseInt(br.readLine());							//Accept Student roll no.

		System.out.print("Enter your name     : ");
		name    = br.readLine();											//Accept Student name

		System.out.print("Enter your persent  : ");
		persent = Double.parseDouble(br.readLine());						//Accept Student persent 

		System.out.println("");

	}

	void display()
	{
		//System.out.println("Student Roll No. : " + rollNo );		//Display Roll no.
		//System.out.println("Student name     : " + name   );		//Display name 
		//System.out.println("Persentage       : " + persent);		//Display persent 
		//System.out.println("");


		System.out.println(rollNo +"\t\t"+ name +"\t\t"+persent);
	}
}
public class TCA_CreateMultiObject_36
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number you want to create the object : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("");

		Student ob[] = new Student[n];
		for(int i=0; i<n; i++)
		{
			ob[i] = new Student();
			ob[i].accept();
		}


		System.out.println("Roll No."+"\t"+"Student Name"+"\t"+"Persent");
		System.out.println("-------------------------------------------");
		for(int i=0; i<n; i++)
		{
			ob[i].display();
		}

	}
}