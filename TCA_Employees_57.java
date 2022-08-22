import java.io.*;
import java.io.BufferedReader;

abstract class Staff
{
	public String name;
	public String address;
	Staff(String name , String address)
	{
		this.name    = name;
		this.address = address;
	}

	abstract public void display();

}
class FullTimeStaff extends Staff
{
	private String department;
	private double salary;

	FullTimeStaff(String name, String address, String department, double salary)
	{
		super(name, address);
		this.department = department;
		this.salary     = salary;
	}

	public void display()
	{
		System.out.println(name +"\t"+ address +"\t\t"+ department + "\t\t" + salary);
	}
}
class PartTimeStaff extends Staff
{
	private double no_of_hrs;
	private double rate_per_hr;
	private double salary;

	PartTimeStaff(String name, String address, double no_of_hrs, double rate_per_hr)
	{
		super(name, address);
		this.no_of_hrs   = no_of_hrs;
		this.rate_per_hr = rate_per_hr;
	}
	public void display()
	{
		salary = (no_of_hrs*rate_per_hr);
		System.out.println(name+"\t"+address+"\t\t"+no_of_hrs+"\t\t\t"+rate_per_hr +"\t\t\t" + salary);
	}
}

public class TCA_Employees_57
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("How many no. of employees: ");
		int n = Integer.parseInt(br.readLine());
		Staff ob[] = new Staff[n];

		
		System.out.println("\nMenu:\n");
		System.out.println("Case 1 : Press 1 for Full Time Staff");
		System.out.println("Case 2 : Press 2 for Part Time Staff");

		System.out.println("\n");

		System.out.print("What is your choice: ");
		int choice = Integer.parseInt(br.readLine());

	
		switch(choice)
		{
			case 1:
				for(int i=0; i<n; i++)
				{
					System.out.println("Employee No. "+ i+1 + ": \n");
					System.out.print("\tEnter your name      : ");
					String name = br.readLine();
					System.out.print("\tEnter your address   : ");
					String address = br.readLine();
					System.out.print("\tEnter your department: ");
					String department = br.readLine();
					System.out.print("\tEnter your salary    : ");
					double salary = Double.parseDouble(br.readLine());

					ob[i] = new FullTimeStaff(name, address, department, salary);
				}
				System.out.println("\n");
				System.out.println("\t\tFULL TIME STAFF INFORMATION\t\t");
				System.out.println("NAME \tADDRESS \tDEPARTMENT \tSALARY");
				for(int i=0; i<n; i++)
				{
					ob[i].display();
				}
				break;


			case 2:
				for(int i=0; i<n; i++)
				{
					System.out.println("Employee No. "+ i+1 + ": \n");
					System.out.print("\tEnter your name      : ");
					String name = br.readLine();
					System.out.print("\tEnter your address   : ");
					String address = br.readLine();
					System.out.print("\tEnter no. of hours you did worked: ");
					double no_of_hrs = Double.parseDouble(br.readLine());
					System.out.print("\tEnter rate per hour: ");
					double rate_per_hr = Double.parseDouble(br.readLine());

					ob[i] = new PartTimeStaff(name, address, no_of_hrs, rate_per_hr);


				}
				System.out.println("\n");
				System.out.println("\t\tPART TIME STAFF INFORMATION\t\t");
				System.out.println("NAME \tADDRESS \tNUMBER OF HOURS \tRRATE PER HOUR \t\tSALARY");
				for(int i=0; i<n; i++)
				{
					ob[i].display();
				}
				break;

			default:
				System.out.println("Invalid choice!!!");
		}	

	}
}