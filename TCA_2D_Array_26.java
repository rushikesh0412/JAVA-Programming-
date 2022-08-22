//28-09-2021
//Lecture 26

//Array :-    Array is the collection of similer types of elements.
//2D Array :- 

import java.util.*;

public class TCA_2D_Array_26{

	public static void main(String []args) 
	{
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
        
        System.out.println(arr.length);
        System.out.println(arr[0].length);





        System.out.println("Accepting matrix: ");
		System.out.println("Enter the array elements: ");
		for(int i=0; i<(arr.length); i++)
		{
			for(int j=0; j<(arr[i].length); j++)
			{
				System.out.print("Array["+i+"]["+j+"] = ");
				arr[i][j] = sc.nextInt();
			}
			
			
		}


		System.out.println("Symmetric matrix: ");
		for(int i=0; i<(arr.length); i++)
		{
			for(int j=0; j<(arr[i].length); j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
			
		}


		System.out.println("Diagonal elements are: ");
		System.out.println("Logic 1: ");
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				
				if(i == j)
				{
					System.out.print(arr[i][j] + " ");

				}	
				
			}
			System.out.print("\n");
			
		}
		

		System.out.println("Logic 2: Optimize time complexity");

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i][i]);
		}


	}
	
}