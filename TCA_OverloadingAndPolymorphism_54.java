import java.io.*;




class Employee
{
	public int employee_ID;
	private String name;
	private String department;
	private double salary;

	Employee()
	{
		this.employee_ID = 0;
		this.name        = null;
		this.department  = null;
		this.salary      = 0.0;
	}
	Employee(int employee_ID, String name, String department, double salary)
	{
		this.employee_ID = employee_ID;
		this.name 		 = name;
		this.department  = department;
		this.salary      = salary;
	}
	double getsalary()
	{
		return salary;
	}

	void display()
	{
		System.out.print(employee_ID + "\t\t" + name + "\t" + department + "\t\t" + salary + "\t");
	}

}
class Manager extends Employee
{
	private double bonus;
	private double totalsalary;

	Manager()
	{
		this.bonus = 0.0;
	}
	Manager(int employee_ID, String name, String department, double salary, double bonus)
	{
		super(employee_ID, name, department, salary);
		this.bonus = bonus;
	}
	double totalaSalary()
	{
		totalsalary = Double.parseDouble(String.format("%.2f",(bonus+(super.getsalary()))));

		return totalsalary;
	}

	void display()
	{
		super.display();
		System.out.println(bonus + "\t" + totalaSalary()+ "\t");
	}




}
public class TCA_OverloadingAndPolymorphism_54
{
	public static void main(String []args) throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		System.out.print("How may number of Employee: ");
		int n = Integer.parseInt(br.readLine());

		Manager ob[] = new Manager[n];

		for(int i=0; i<n; i++)
		{
			System.out.print("Enter Name      : ");
			String name = br.readLine();

			System.out.print("Enter Department: ");
			String department = br.readLine();

			System.out.print("Enter Salary    : ");
			double salary = Double.parseDouble(br.readLine());

			System.out.print("Enter Bonus     : ");
			double bonus = Double.parseDouble(br.readLine());

			ob[i] = new Manager(i+1, name, department, salary, bonus);
		}

		*/


		int n = 1;
		String y;
		

		do{
			 
			
			
			System.out.println("Employee "+n+" : \n");
			System.out.print("Enter Name      : ");
			String name = br.readLine();

			System.out.print("Enter Department: ");
			String department = br.readLine();

			System.out.print("Enter Salary    : ");
			double salary = Double.parseDouble(br.readLine());

			System.out.print("Enter Bonus     : ");
			double bonus = Double.parseDouble(br.readLine());

			System.out.println("\n");

			ob[n] = new Manager(n+1, name, department, salary, bonus);

			System.out.print("Do you want to continue(yes/no) : ");
			y = br.readLine();
			System.out.println("\t");
			n++;

		}while(y == "yes");

		System.out.println("-------------------------Employee Information-----------------------");
		System.out.println("Employee ID \t Name \t Department \t Salary \t Bonus \t Total Salary");
		for (int i=0; i<n; i++) 
		{
			ob[i].display();
		}

	}
}