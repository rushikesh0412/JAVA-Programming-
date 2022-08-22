//Write a program which accepts file name command line & display its contents. [Reading a file line by line]
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;


public class TCA_FileReadLineByLine_69
{
	public static void main(String args[]) throws Exception
	{
		File f = new File(args[0]);

		if(!f.exists())
		{
			System.out.println(args[0] + " is not found!!!");
			System.exit(0);
		}
		if(!f.isFile())
		{
			System.out.println(args[0]+ " is not File!!!");
			System.exit(0);
		}
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		while(true)
		{
			String str = br.readLine();
			if(str == null)
			{
				break;
			}
			System.out.println(str);

		}
		fr.close();
	}
}

