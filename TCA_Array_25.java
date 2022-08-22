//27-09-2021
//Lecture 25

//Array :-    Array is the collection of similer types of elements.

public class TCA_Array_25{

	public static void main(String []args)
	{
		int arr[] = new int[3];
		arr[0] = 25;
		arr[1] = 45;
		arr[2] = 85;


		System.out.println(arr[0]);

		System.out.println("For each loop: ");
		for(int data : arr)
		{
			System.out.println(data);
		}


		System.out.println("For loop: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}