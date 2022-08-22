import java.io.*;
import java.util.Scanner;

//Assignment No. 1  :   Airthmetic[a,b, sum,sub,mult,div,rem]

class Arithmetic1
{
	float a;			//Use for store first value
	float b;			//Use for store second value
	float sum;			//Use for store Addition
	float sub;			//Use for store Substraction
	float mult;			//Use for store Multiplication
	float div;			//Use for store Division
	float rem;			//Use for store Reminder

	void accept() throws IOException
	{
		Scanner sc = new Scanner(System.in);					//input library

		System.out.print("Enter the first number  : ");	
		a = sc.nextFloat();										//accept value of a

		System.out.print("Enter the second number : ");	
		b = sc.nextFloat();										//accept value of b

		System.out.println("\n");
	}

	void calculate() throws CloneNotSupportedException
	{
		sum  = a + b;											//calculate Addition
		sub  = a - b;											//calculate substraction
		mult = a * b;											//calculate multiplication
		div  = a / b;											//calculate division
		rem  = a % b;											//calculate reminder
	}
	void display()
	{
		System.out.println("First number   : " + a   );  		//display a
		System.out.println("Second number  : " + b   );			//display b
		System.out.println("Addition       : " + sum );			//Display Addition
		System.out.println("Subtraction    : " + sub );			//Display Substraction
		System.out.println("Multiplication : " + mult);			//Display Multipliaction
		System.out.println("Division       : " + div );			//Display Division
		System.out.println("Remainder      : " + rem );			//Display Reminder
		System.out.println("\n");
	}
	void displayAdd()
	{
		System.out.println("Addition       : " + sum );			//Display Addition
		System.out.println("");
	}
	void displaySub()
	{
		System.out.println("Subtraction    : " + sub );			//Display Substraction
		System.out.println("");
	}
	void displayMult()
	{
		System.out.println("Multiplication : " + mult);			//Display Multipliaction
		System.out.println("");
	}
	void displayDiv()
	{
		System.out.println("Division       : " + div );			//Display Division
		System.out.println("");
	}
	void displayRem()
	{
		System.out.println("Remainder      : " + rem );			//Display Reminder
		System.out.println("");
	}
}
public class TCA_ps1_34{
	public static void main(String []args) throws IOException, CloneNotSupportedException
	{
		Arithmetic1 ob = new Arithmetic1();		//ob  => 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
		ob.accept();  				        	//ob  => 3, 5 
		ob.calculate();							//ob  => 8.0, -2.0, 15.0, 0.6, 3.0
		ob.display();							//ob  => 8.0, -2.0, 15.0, 0.6, 3.0
		ob.displayAdd();						//ob  => 8.0
		ob.displaySub();						//ob  => -2.0
		ob.displayMult();						//ob  => 15.0
		ob.displayDiv();						//ob  => 0.6
		ob.displayRem();						//ob  => 3.0

		Arithmetic1 ob2 = new Arithmetic1();	//ob2 => 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
		ob2.accept();							//ob2 => 5, 4
		ob2.calculate();						//ob2 => 9.0, 1.0, 20.0, 1.25, 1.0
		ob2.display();							//ob2 => 9.0, 1.0, 20.0, 1.25, 1.0
		ob2.displayAdd();						//ob2 => 9.0
		ob2.displaySub();						//ob2 => 1.0
		ob2.displayMult();						//ob2 => 20.0
		ob2.displayDiv();						//ob2 => 1.25
		ob2.displayRem();						//ob2 => 1.0

	}
}