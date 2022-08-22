import java.io.*;
import java.io.BufferedReader;


public class TCA_ExceptionHandeling_65
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double ans = 0.0;
		double a = 45;

		try
		{
		double b = Integer.parseInt(args[0]);
		ans = a/b;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("You should have to give input!!");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("You can not give input as string!!! ");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("When you give input as 0 You will be get output as infinity!!!");
		}


		System.out.println("Answer : "+ ans);

		System.out.println("End main!!!");

	}
}