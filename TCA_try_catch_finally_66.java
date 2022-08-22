import java.io.*;

class A
{
	int ans;

		void display() throws ArithmeticException
		{
			try
			{
				ans = 16/0;
				System.out.println("End of A's try");
			}
			catch(NumberFormatException ne)
			{
				ne.printStackTrace();
			}
			finally
			{
				System.out.println("I am in A's finally!!!");
				//main perpose to close data base files
			}
			System.out.println("End of display!!");
		}
}
public class TCA_try_catch_finally_66
{
	public static void main(String []args) throws Exception
	{
		A ob = new A();
		ob.display();
		System.out.println("End of main!!!");
	}
}
