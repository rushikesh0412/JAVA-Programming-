import java.io.*;


abstract class A
{
	void f1()
	{
		System.out.println("F1-A");
	}
	abstract public void f2();
	abstract public void f3();

}
class B extends A{
	public void f2()
	{
		System.out.println("F2-B");

	}
	public void f3()
	{
		System.out.println("F3-B");
	}
	void f4()
	{
		System.out.println("F4-B");
	}
}
public class TCA_AbstractClass_56
{
	public static void main(String []args)
	{
		//A oba = new A();           //error: A is abstract; cannot be instantiated
                
		A oba = new B();
		oba.f1();
		oba.f2();
		oba.f3();
		//oba.f4();         //error: cannot find symbol
		System.out.println("----------------------");


		B obb = new B();
		obb.f1();
		obb.f2();
		obb.f3();
		obb.f4();

	}
}