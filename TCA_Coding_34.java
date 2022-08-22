

class Arithmetic
{
	int a;					//Use to store first number
	int b;					//Use to store Second number
	int sum;				//Use to store Sum of two number

	 public void accept() throws IOException
	{
		Scanner sc = new Scanner(System.in);				//input library

		System.out.println("Enter the first number  : ");	
		a = sc.nextInt();									//accept value of a

		System.out.println("Enter the second number : ");	
		b = sc.nextInt();									//accept value of b
	}



	void calculate() throws CloneNotSupportedException
	{
		sum = a + b;										//calculate sum
	}
	void display()
	{
		System.out.println("First number  : " + a  );   	//display a
		System.out.println("Second number : " + b  );		//display b
		System.out.println("Addition      : " + sum);		//display sum
	}

}
public class TCA_Coding_34
{
	public static void main(String []args) throws IOException, CloneNotSupportedException
	{
		

		Arithmetic ob = new Arithmetic();   //ob  => 0,0,0
		ob.accept();  				        //ob  => 3,5,0 
		ob.calculate();						//ob  => 3,5,8
		ob.display();						//ob  => 8

		Arithmetic ob2 = new Arithmetic();	//ob2 => 0,0,0
		ob2.accept();						//ob2 => 5,4,0
		ob2.calculate();					//ob2 => 5,4,9
		ob2.display();						//ob2 => 9
		


	}
}

/*

Assignment :
		1.  Airthmetic[a,b, sum,sub,mult,div,rem]
		2.  Student[rollno. , name, persent]

 */