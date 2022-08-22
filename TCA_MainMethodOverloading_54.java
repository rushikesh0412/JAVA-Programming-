import java.io.*;

public class TCA_MainMethodOverloading_54
{
	public static void main(String []args)
	{
		System.out.println("I am in main method!!!");
		main(2);
		main(2.5);
		main("rushi");

		int j = main();
		System.out.println(j);


	}
	public static void main(int i)
	{
		System.out.println(i);
	}
	public static void main(double d)
	{
		System.out.println(d);
	}
	static void main(String s)
	{
		System.out.println(s);
	}
	static int main()
	{
		int j = 45;  
		return j;
	}
	/*
	int main()
	{
		int j = 45;  //error: non-static method main() cannot be referenced from a static context
		return j;
	}
	*/
}