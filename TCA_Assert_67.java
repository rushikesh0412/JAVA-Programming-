import java.io.*;

class NegativeNumberException extends Exception
{
	//This is user defined exception

	NegativeNumberException(String msg)
	{
		super(msg);
	}

}

public class TCA_Assert_67
{
	public static void main(String [] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{


			try
			{
				System.out.print("Enter your age: ");
				int age = Integer.parseInt(br.readLine());


				//assert(age>0) : "Age should be greater than 0";			//java.lang.AssertionError -ea & -da  

				
				if(age<0)
				{
					throw new NegativeNumberException("You should not give input less than or equel to zero");
				}
				

				System.out.println("End of try Block!!!");
			}
			catch(NumberFormatException ne)
			{
				ne.printStackTrace();
			}
			catch(NegativeNumberException nne)
			{
				nne.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	}
}