import java.io.*;

//main call hoto
//

//java Demo AAA BBB CCC
//Display all the elements from the 
public class TCA_CommandLineArgument_19{

	public static void main(String []args){
		
		System.out.println(args.length);

		if(args.length == 0)
		{
			System.out.println("No command arguments send!!!");
		}
		else
		{
			System.out.println("My command line Arguments!!!");
			for(int i=args.length-1; i>=0; i--)
			{
				System.out.println(args[i]);
			}
		}
	}
}