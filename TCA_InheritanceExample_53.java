import java.io.*;
import java.util.*;
import java.lang.Double;
import java.util.Scanner;
import java.io.BufferedReader;

class Student
{
	public int rno;
	private String name;
	private double per;

	Student(int rno, String name, double per)
	{
		this.rno = rno;
		this.name = name;
		this.per = per;

	}

	void display()
	{
		System.out.print(rno +"\t"+ name +"\t"+per +"\t");
	}
}

class Student2020 extends Student
{
	private String email;
	private String whatsappNo;

	Student2020(int rno, String name, double per, String email, String whatsappNo)
	{
		super(rno,name,per);
		this.email = email;
		this.whatsappNo = whatsappNo;
	}

	void display()
	{
		super.display();
		System.out.print(email + "\t" + whatsappNo + "\t");
	}
}
class Student2030 extends Student2020
{
	String photo = "mypic.jpg";
	String bloodgroup;
	String aadharID;

	Student2030(int rno, String name, double per, String email, String whatsappNo,String photo, String bloodgroup, String aadharID)
	{
		super(rno,name,per, email, whatsappNo);
		this.photo = photo;
		this.bloodgroup = bloodgroup;
		this.aadharID = aadharID;
	}

	void display()
	{
		super.display();
		System.out.println(photo + "\t" + bloodgroup + "\t" + aadharID + "\t*");
	}
}

public class TCA_InheritanceExample_53
{
	public static void main(String []args) throws IOException, NumberFormatException 
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many number of students: ");
		int n = Integer.parseInt(br.readLine());

		Student2030 ob[] = new Student2030[n];

		for(int i=0; i<n; i++)
		{
			System.out.print("Enter your name : ");
			String name = br.readLine();

			System.out.print("Enter your persent: ");
			double per = Double.parseDouble(br.readLine());

			System.out.print("Enter your mail ID: ");
			String email = br.readLine();

			System.out.print("Enter your whatsapp number: ");
			String whatsappNo = br.readLine();

			System.out.print("Enter your pic: ");
			String photo = br.readLine();

			System.out.print("Enter your Blood Group: ");
			String bloodgroup = br.readLine();

			System.out.print("Enter your Aadhar ID: ");
			String aadharID = br.readLine();

			ob[i] = new Student2030(i+1 ,name , per , email , whatsappNo, photo, bloodgroup, aadharID);
		}


		//Student2020 ob[] = new Student2020(1 ,"Rushi" , 89.45 , "rushikeshshinde9208@gmail.com" , "+91-9552772017");

		System.out.println("RollNo \t Name \t Persent \t email \t whatsapp Number \t Photo \t Blood Group \t Aadhar ID \t*");
		System.out.println("----------------------------------------------------------------------------------------------");
		for(int i=0; i<n; i++)
		{
			ob[i].display();
		}
		
	}
}