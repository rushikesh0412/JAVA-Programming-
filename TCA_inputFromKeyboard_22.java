
import java.util.*;
import java.util.Scanner;


public class TCA_inputFromKeyboard_22
{
	public static void main(String []args)
	{
		//BufferReader  (JCB cha khora)
		//BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		//InputStreamReader r=new InputStreamReader(System.in);    
    	//BufferedReader br=new BufferedReader(r);




		//Sysrem.in    (khora)
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your roll number: ");
		int a    = sc.nextInt();
		
		System.out.print("Enter your name: ");
		String str = sc.next();

		
		System.out.println("Roll No. : " + a);
		System.out.println("Student Name: " + str);

	}
}