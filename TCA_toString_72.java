import java.io.*;


public class TCA_toString_72
{
	public static void main(String args[])
	{
		
		System.out.println("-------------------------");
		String s = new String("Rushi");
		String t = new String("Hello");
		s = s+t;
		System.out.println(s);
		String s1 = s+t;
		System.out.println(s1);
		System.out.println(s+t);

		System.out.println("-------------------------");
		//StringBuffer C:\Java\jdk1.8.0_261
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("TCA");
		System.out.println(sb);

		System.out.println("-------------------------");
		//StringBuilder C:\Java\jdk1.8.0_261
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append("TCA");
		System.out.println(sb2);

		System.out.println("-------------------------");
		//Reverse String object
		String str = "Rushi";
		StringBuffer sb3 = new StringBuffer(str);

		sb3.reverse();
		str = new String(sb3);
		System.out.println(str);              //Act as ihsuR


		System.out.println("-------------------------");
		//Example 1
		int a = 3;
		int b = 5;
		int c = a+b;

		System.out.println(c);
		System.out.println(a+b);
		System.out.println("Sum = "+ a + b);
		System.out.println("Sum = "+ (a+b));
		System.out.printf("Sum = %d\n",a+b);


		System.out.println("-------------------------");




	}
}