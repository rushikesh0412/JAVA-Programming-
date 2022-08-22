import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;


//Assignment : 
			//1.  car[car number , chasisnumber, color, companyname, modelname, price, fueltype] 
			//2.  student[rollnumber , name , subj1, subj2, subj3, persent, grade]

class Car
{
	String car_no;					//Use to store car number
	String chasi_number;			//Use to store chasi number
	String color;					//Use to store car color
	String company_name;			//Use to store Car company name
	String model_name;				//Use to store Car model name
	int price;						//Use to store Car price
	String fuel_type;				//Use to store Car fuel type

	void accept() throws IOException, NumberFormatException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Car number       : " );
		car_no       = br.readLine();											    //Accept car number

		System.out.print("Enter chasi number     : " );
		chasi_number = br.readLine();											    //Accept chasi number

		System.out.print("Enter car color        : " );
		color        = br.readLine();											    //Accept car color

		System.out.print("Enter car company name : " );
		company_name = br.readLine();											    //Accept Car company name

		System.out.print("Enter car model name   : " );
		model_name   = br.readLine();											    //Accept Car model name

		System.out.print("Enter Car price " );
		price        = Integer.parseInt(br.readLine());								//Accept Car price

		System.out.print("Enter car fuel type    : " );
		fuel_type    = br.readLine();											    //Accept Car fuel type

		System.out.println("\n");
	}
	void display()
	{
		System.out.println("*\t"+ car_no +"\t"+ chasi_number +"\t\t\t"+ color +"\t\t\t"+ company_name +"\t\t\t"+ model_name +"\t\t\t"+ price +"\t\t"+ fuel_type +"\t\t   *" );
	}
}

public class TCA_ps1_36
{
	public static void main(String []args) throws IOException, NumberFormatException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many number of Car? : ");
		int n = Integer.parseInt(br.readLine());

		Car c[] = new Car[n];
		for(int i=0; i<n; i++)
		{
			c[i] = new Car();
			c[i].accept();
		}
		System.out.println("\n");

		System.out.println("*-------------------------------------------------------------------Display Available Cars-------------------------------------------------------------------------*");
		System.out.println("*------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
		System.out.println("*\t"+"Car No."+"\t\t"+"chasi Number"+"\t\t"+"Clour"+"\t\t\t"+"Company Name"+"\t\t"+"Model Name"+"\t\t"+"Price"+"\t\t"+"Fuel Type"+"\t\t   *");
		System.out.println("*------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
		for(int i=0; i<n; i++)
		{
			c[i].display();
		}
		System.out.println("*------------------------------------------------------------------------------------------------------------------------------------------------------------------*");
	}
}