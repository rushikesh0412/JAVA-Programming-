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
public class TCA_ps2_34
{
	public static void main(String []args) throws IOException
	{
		//Student 1
		Student s1 = new Student();   //s1 => 0, null, 0.0
		s1.accept();
		//s1.display();

		//Student 2
		Student s2 = new Student();	  //s1 => 0, null, 0.0	
		s2.accept();
		//s2.display();

		//Student 3
		Student s3 = new Student();   //s1 => 0, null, 0.0
		s3.accept();
		//s3.display();


		System.out.println("Roll No."+"\t"+"Student Name"+"\t"+"Persent");
		System.out.println("-------------------------------------------");
		s1.display();
		s2.display();
		s3.display();
	}
}