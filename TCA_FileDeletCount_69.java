//Count how many file & directories in given directory Accepted from command line.
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class TCA_FileDeletCount_69
{
	public static void main(String []args) throws Exception
	{
		File f = new File(args[0]);

		String fname[] = f.list();

		
		if(!f.exists())
		{
			System.out.println(args[0]+" is not found!!!");
			System.exit(0);
		}
		if(!f.isDirectory())
		{
			System.out.println(args[0]+" is not a Directory!!!");
			System.exit(0);
		}
		


		System.out.println("No. of Entires: "+ fname.length);
		int fcount = 0;
		int dcount = 0;

		for(int i=0; i<fname.length; i++)
		{
			File fob = new File(f.getAbsolutePath()+"\\"+fname[i]);
			if(fob.isFile())
			{
				fcount++;
			}
			if(fob.isDirectory())
			{
				dcount++;
			}
		}

		System.out.println("No. of files    : "+ fcount);
		System.out.println("No. of Directory: "+ dcount);
	}
}