import java.io.*;

class A
{
	int i = 4;
	int j = 6;
	
	public String toString()
	{

		System.out.println("["+i+","+j+"]");

		
		A ob = new A();
		int i = ob.hashCode();
		String s = String.format("A@%x",i);

		return s;
		
	}
	

}
public class TCA_toString_62
{
	public static void main(String []args)
	{
		A ob = new A();
		System.out.println("Ref value : "+ ob);
		System.out.println("Ref value : "+ ob.toString());
		System.out.println("Hash code : "+ ob.hashCode());
		

		//Finding Ref value from hash code
		//System.out.println("Ref value : "+ String.format("%x",ob.hashCode()));




	}
}