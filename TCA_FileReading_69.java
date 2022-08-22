//Write a program which accepts file name from command line & display its contents. [reading a file chracter by character]
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TCA_FileReading_69
{
	public static void main(String args[]) throws Exception
	{
	 	File f = new File(args[0]);

	 	if(!f.exists())
	 	{
	 		System.out.println(args[0]+" is not found!!!");
	 		System.exit(0);
	 	}
	 	if(!f.isFile())
	 	{
	 		System.out.println(args[0]+ " is not file!!!");
	 		System.exit(0);
	 	}

	 	//String fname[] = f.list();
		//System.out.println("No of Entries: "+ fname.length);

		FileReader fr = new FileReader(f);

		int ch =-1;
		while(true)
		{
			ch = fr.read();
			if(ch == -1)
			{
				break;
			}
			System.out.print((char)ch);

		}
		fr.close();



	}
}