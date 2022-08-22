import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class TCA_FileHandeling_68 
{
	public static void main(String []args) throws Exception
	{
		args[0] = "a.text";
		File file = new File(args[0]);

		try
		{
			

			if(!file.exists())
			{
				System.out.println(args[0]+" file does not exist!");
				System.exit(0);
			}
			if(!file.isFile())
			{
				System.out.println(args[0]+" is not a file!!!");
				System.exit(0);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}

		System.out.println("File Name : "+ file.getName());
		System.out.println("File Path : "+ file.getAbsolutePath());
		System.out.println("File Size : "+ file.length());
		System.out.println("Readable  : "+ file.canRead());
		System.out.println("Writable  : "+ file.canWrite());
		System.out.println("Executable: "+ file.canExecute());
	}
}