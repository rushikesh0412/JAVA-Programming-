import java.io.*;

class A
{
	int i =4;
	A()
	{
		System.out.println("I am in A's constructor!!!");
	}
	void display()
	{
		System.out.println("I am is A's display!!!");
		System.out.println(i);
	}
}
class B extends A
{
	int j = 45;
	
	B()
	{
		//super();
		System.out.println("I am is B's constructor!!!");
	}
	void display()
	{
		super.display();
		System.out.println("I am in B's display!!!");
		System.out.println(j);
	}
}


public class TCA_MethodOverriding_51
{
	public static void main(String []args)
	{
		A obA = new A();
		obA.display();

		System.out.println("------------------------------");
		B obB = new B();
		obB.display();

		System.out.println("------------------------------");
		A ob = new B();
		ob.display();

		System.out.println("------------------------------");
		//B ob2 = new A();										//error: incompatible types: A cannot be converted to B
		//ob2.display();
	}
}