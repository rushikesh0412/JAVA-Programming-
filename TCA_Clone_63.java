import java.io.*;

class A implements Cloneable
{
	int i;
	double d;
	int a[];

	A()
	{
		this.i  = 10;
		this.d  = 3.5;
		a = new int[2];
		a[0] 	= 11;
		a[1] 	= 22;
	}

	protected A clone() throws CloneNotSupportedException
	{
		A t    = (A)super.clone();

		t.a = new int[a.length];
		t.a[0] = this.a[0];
		t.a[1] = this.a[1];

		return t; 
	}
	void display()
	{
		System.out.println(i);
		System.out.println(d);
		System.out.println(this.a[0]);
		System.out.println(this.a[1]);
	}
	
}
public class TCA_Clone_63
{
	public static void main(String []args) throws Exception
	{
		A ob1 = new A();

		A ob2 = ob1.clone();            //Twin,s object created

		ob1.a[0] = 35; 

		System.out.println("Original Copy: ");
		ob1.display();

		System.out.println("-----------------------------");

		System.out.println("Cloned Copy : ");
		ob2.display(); 
	}
}