import java.io.*;


public class TCA_ExceptionHandelling_64
{
	public static void main(String [] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println("Enter tha value of a: ");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter the value of b: ");
			int b = Integer.parseInt(br.readLine());

			int c = a/b;
			System.out.println("Value of a: "+ c);
		}
		catch(IOException ioe)
		{
			System.out.println("Exception: "+ ioe);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception: "+ ae);
		}
		catch(Exception e)
		{
			System.out.println("UnknownError: "+ e);
		}
	}
}