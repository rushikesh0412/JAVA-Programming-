import java.io.*;


class A
{
	void display()
	{
		System.out.println("I am in empty display!!!");
	}
	void display(int i)
	{
		System.out.println(i);
		
	}
	void display(double d)
	{
		System.out.println(d);
	}
	void display(int i, double d)
	{
		System.out.println(i);
		System.out.println(d);
	}
	void display(double d , int i)
	{
		System.out.println(d);
		System.out.println(i);
	}
	void display(int i, int j)
	{
		System.out.println(i);
		System.out.println(j);
	}
	void display(double d, double j)
	{
		System.out.println(d);
		System.out.println(j);
	}
}
public class TCA_MethodOverloading_54
{
	public static void main(String []args)
	{
		A ob = new A();

		ob.display();
		ob.display(4);
		ob.display(3.5);
		ob.display(4,3.5);
		ob.display(3.5,4);
		ob.display(4,4);
		ob.display(3.5,3.5);
		ob.display();
	}
}