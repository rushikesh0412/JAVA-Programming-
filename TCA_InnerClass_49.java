import java.io.*;


public class A{
	int i=5;
	static int s = 44;

	//Member inner class
	class B
	{
		int j = 66;
		//static int s = 5;			//error
		Void displayB()
		{
			System.out.println("I am in display B");
			System.out.println("Value of i : "+ i);
			System.out.println("Value of s : "+ s);
			System.out.println("Value of j : "+ j);
			
		}
	}


	//Method local inner class 
	void display()
	{
		int j = 11;
		class C
		{
			int k = 22;
			void displayC()
			{
				System.out.println("I am show!!!");
				System.out.println("Value of i: "+ i);
				System.out.println("Value of j: "+ j);
				System.out.println("Value of k: "+ k);
			}
		}
		System.out.println("i am in display!!!");
		System.out.println("Value of i "+ i);
		C ob = new C();
		ob.displayC();
	}

	void displayA()
	{
		System.out.println("Value of i : "+ i);
		System.out.println("Value of s : "+ s);
	}
}
public class TCA_InnerClass_49
{
	public static void main(String []args)
	{
		//calling class A
		A s = new A();
		s.displayA();

		//calling inner calss B
		A.B ob = new A().new b();
		ob.displayB();

		//calling method local inner class
		A c = new A();
		c.display();

	}
}