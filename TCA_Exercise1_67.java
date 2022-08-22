import java.io.*;

class InvalidLogin extends Exception
{
	InvalidLogin(String msg)
	{
		super(msg);
	}
}
class SignUp
{
	public int id;
	protected String user_name;
	private String password;

	SignUp(int id, String user_name, String password)
	{
		this.id 	   = id;
		this.user_name = user_name;
		this.password  = password;
	}
	
	void setPassword() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your new password: ");
		String new_password = br.readLine();
		this.password  = new_password;
	}
	void display()
	{
		System.out.println(id + "\t\t" + user_name);
		
	}
	void logIn()
	{
		

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter your  UserName : ");
			String user_name1 = br.readLine();

			if(!(user_name1.equals(this.user_name)))
			{
				throw new InvalidLogin("Invalid Username!");
			}

			System.out.print("Enter your password: ");
			String password1 = br.readLine();
			
			if((password1.equals(this.password)))
			{
				System.out.println("Your account logIn Successfuly!");
			} 
			else
			{
				throw new InvalidLogin("Invalid password!");
			}	
			
		}
		catch(IOException ie)
		{
			System.out.println("I/O Exception : "+ ie);
		}
		catch(InvalidLogin il)
		{
			System.out.println(il);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
public class TCA_Exercise1_67
{
	
	
	
	public static void main(String []args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//SignUp
		System.out.print("How many number of accounts : ");
		int n = Integer.parseInt(br.readLine());
		SignUp ob[] = new SignUp[n];
		
		
		for(int i = 0; i<n; i++)
		{
				

				System.out.print("Enter your  UserName : ");
				String user_name = br.readLine();
				System.out.print("Enter your password: ");
				String password = br.readLine();

				ob[i] = new SignUp(i+1, user_name, password);

				System.out.println("\n");
				
		}



		System.out.println("----------- Account Holders----------");
		System.out.println("ID \t\tUserName \t ");

		for(int i=0; i<n; i++)
		{
			ob[i].display();
		}
		System.out.println("\n");
		
		

		//Login account
		System.out.println("Login your account: ");

		System.out.print("Enter you ID: ");
		int id = Integer.parseInt(br.readLine());

		ob[(id-1)].logIn();

	}
}