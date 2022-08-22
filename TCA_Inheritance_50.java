import java.io.*;

class A
{
	int i=11;

	void display()
	{
		System.out.println("I am in A's display!!!");
		System.out.println(i);
	}
}
class B extends A
{
	int j = 22;
	void show()
	{
		System.out.println("I am in B's display!!!");
		System.out.println(j);
		display();
	}
}
public class TCA_Inheritance_50
{
	public static void main(String []args)
	{
		A oba = new A();
		oba.display();

		System.out.println("---------------------------------");

		B obb = new B();
		obb.show();

		System.out.println("---------------------------------");

		A obA = new B();
		obA.display();

		System.out.println("---------------------------------");

		//B obB = new A();             //error: incompatible types: A cannot be converted to B
		//obB.display();

	}
}