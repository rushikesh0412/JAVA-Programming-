import java.util.*;                                       //Please make available all the classes(library) to this program
import java.io.*;                                         //input & output library

class A{
	int add(int a, int b){
		int c;
		c = a+b;
		return c;                                         //actually your function returning some variable
	}
	static void sub(int a, int b){                          //When you calling by using classname at that time you must use static in the front of the function
		int c;
		c = a-b;
		System.out.println(c);
	}
}
public class Function1{                                   //File name always starting in capiral letter
	public static void display()
	{
		System.out.println("Hello java!");
	}
	public static void main(String []args)               //Commanf line arugument   //public use for command prompt get permision to access
	{
		display();
		A obj = new A();
		int ans = obj.add(5, 6);                            //Calling using object
		System.out.println(ans);

		A.sub(8, 6);                                        //Calling using Class name


	}
}