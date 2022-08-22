import java.io.*;

interface A
{
	public static final int i=4;

	abstract public void display(); //there is not need to write abstract. the bidefault make abstract method
}
class B implements A
{
	int j = 5;

	public void display()
	{
		System.out.println(i);
		System.out.println(j);
	}
	public void show()
	{
		System.out.println("i am in show!!!");
	}
}
public class TCA_Interfaces_58
{
	public static void main(String []args)
	{
		A oba = new B();
		oba.display();
		//oba.show();						//error: cannot find symbol


		System.out.println("--------------------");
		B obb = new B();
		obb.display();
		obb.show();


	}
}