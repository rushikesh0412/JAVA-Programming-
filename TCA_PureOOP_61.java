import java.io.*;

class A
{





	
}

public class TCA_PureOOP_61
{
	public static void main(String []args) throws Exception
	{
		A ob = new A();
		System.out.println("Ref Value   : "+ ob);
		System.out.println("Hash Code   : "+ ob.hashCode());
		System.out.println("Class of ob : "+ ob.getClass());					//Find the class of ob
		System.out.println("Parent of A : "+ ob.getClass().getSuperclass());	//Find the super class of class

		System.out.println("---------------------------------------------");

		TCA_PureOOP_61 b = new TCA_PureOOP_61();
		System.out.println("Ref Value   : "+ b);
		System.out.println("Hash Code   : "+ b.hashCode());
		System.out.println("Class of ob : "+ b.getClass());						//Find the class of ob
		System.out.println("Parent of A : "+ b.getClass().getSuperclass());		//Find the super class of class


	}
}