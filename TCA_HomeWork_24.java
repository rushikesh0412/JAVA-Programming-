
/*
1. Accept radius[float or double] from user and display area and perimeter of the circle.
2. Accept two numbers[Keyboard or command Line] from user and display maximum from it.
3. Accept 'n' numbers[Keyboard or command Line] from user and display maximum from it.
*/

import java.util.*;
import java.lang.Math.*;


public class TCA_HomeWork_24{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		/*
		//Problem 1
		

		System.out.print("Enter the redius of the Circle : ");
		double r = sc.nextDouble();

		System.out.println("Area of the Circle is "+ (Math.PI*r*r));
		System.out.println("Perimeter of the Circle is "+ (2*Math.PI*r));


		//Problem 2

		System.out.print("Enter the First number : ");
		double a = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double b = sc.nextDouble();

		if(a>b)
		{
			System.out.println("Maximum : "+ a);
		}
		else
		{
			System.out.println("Maximum : "+ b);
		}


		//Problem 3

		System.out.println("Enter how many number you want to enter : ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		double max=0;
		int i;

		System.out.println("Enter the number: ");
		for(i=0; i<n; i++)
		{
			arr[i] = sc.nextDouble();
			if(arr[i] > max)
			{
				max = arr[i];
			}

		}
		System.out.println("Maximum value is "+ max);
		*/



		//Problm 3 

		System.out.println("How many number you want to enter? ");
		int x = sc.nextInt();

		System.out.print("Enter the 1 element : ");
		double max = sc.nextDouble();
		double min = max;

		for(int i=2; i<=x; i++)
		{
			System.out.print("Enter the "+ i +" element : ");
			double y = sc.nextDouble();
			if(y>max)
			{
				max = y;
			}
			else if(y<min)
			{
				min = y;
			}



		}
		System.out.println("Maximum value is : "+ max);
		System.out.println("Maximum value is : "+ min);

	}
}