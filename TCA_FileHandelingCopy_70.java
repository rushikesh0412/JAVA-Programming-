import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class TCA_FileHandelingCopy_70
{
	public static void main(String []args) throws Exception
	{
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);

		//f1
		if(!f1.exists())
		{
			System.out.println(args[0] +" is not Found!!!");
			System.exit(0);
		}
		if(!f1.isFile())
		{
			System.out.println(args[0] +" is not File!!!");
			System.exit(0);
		}

		//f2
		if(!f2.exists())
		{
			System.out.println(args[1] +" is not Found!!!");
			System.exit(0);
		}
		if(!f2.isFile())
		{
			System.out.println(args[1] +" is not File!!!");
			System.exit(0);
		}


		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);

		//fw.writer("Author: Sachin Dhane Date:17/12/2021\n");

		int ch=-1;

		while(true)
		{
			ch = fr.read();
			if(ch == -1)
			{
				break;
			}
			fw.write(ch);
		}

		fw.write("END-OF-FILE");
		fr.close();
		fw.close();
	}
}