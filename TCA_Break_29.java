import java.io.*;



public class TCA_Break_29
{
	public static void main(String[] args)
	{
		

		//Break Statement
		for(int i=1; i<=5; i++)
		{
			if(i == 3)
			{
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n");







//Break with lebal
	TCA:	for(int j=1; j<=5; j++)
			{

				for(int i=1; i<=5; i++)
				{
					if(i == 3)
					{
						break TCA;
					}
					System.out.print(i + " ");
				}
				System.out.print("\n");

		 	}

		 	System.out.println("\n");



//Continue 


		for(int i=1; i<=5; i++)
		{
			if(i == 3)
			{
				continue;
			}
			System.out.print(i + " ");
		}



		System.out.println("\n");


//Continue with lebal
		TCA:	for(int j=1; j<=5; j++)
			{

				for(int i=1; i<=5; i++)
				{
					if(i == 3)
					{
						continue TCA;
					}
					System.out.print(i + " ");
				}
				System.out.print("\n");

		 	}

		 	System.out.println("\n");              // . is use for member acces operator



		 	//Arthmetic operator

		 	double a = 5%3;
		 	System.out.println(a);

		 	double b = (-5)%3;
		 	System.out.println(b);

		 	double c = 5% (-3);
		 	System.out.println(c);

		 	double d = (-5)%(-3);
		 	System.out.println(d);




	}
}