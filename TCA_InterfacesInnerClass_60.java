import java.io.*;


interface A
{
	/*
	void f1()
	{
		System.out.println("inner-f2");				//error: interface abstract methods cannot have body
	}
	*/

	void f2();
	void f3();

}
class B
{
	A oba = new A()
	{
		int j = 4;

		
		public void f2()
		{
			System.out.println("inner-f2");
		}
		public void f3()
		{
			System.out.println("inner-f3");
		}

		void f4()
		{
			System.out.println("inner-f4");
		}

	};
}
public class TCA_InterfacesInnerClass_60
{
	public static void main(String []args)
	{

		B b = new B();
		b.oba.f1();
		b.oba.f2();
		b.oba.f3();
		//b.oba.f4();
		
	}
}