import java.util.*;

public class TCA_ArrayRepresentation_27{

	public static void main(String []args)
	{
		

		/*
		int arr[], a , b; //here only arr[] this is array



		int []array,x = new int[2],z;   //This all are Array

		for(int i=0; i<x.length; i++)
		{
			
				
			x[i] = sc.nextInt();
				
		}
		*/



		/*
		//At programming level there is no pinter in the java.
		//But at JVM level, JVM has pointer.
		int v[] = null;
		System.out.println(v.length);   //NullPointerException Occurs
		System.out.println(v[0]);
		*/


		//Jaged array
		Scanner sc = new Scanner(System.in);               //New is a instatnce operator
	    int row , col;
		System.out.print("Enter the number of rows: ");
		row = sc.nextInt();

		int arr[][] = new int[row][];
		
        
        //System.out.println(arr.length);
        //System.out.println(arr[0].length);





        System.out.println("Accepting matrix: ");
		System.out.println("Enter the array elements: ");
		for(int i=0; i<(arr.length); i++)
		{
			System.out.print("Enter the number of coloms: ");
			col = sc.nextInt();
			arr[i] = new int[col];
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


	}
	
}