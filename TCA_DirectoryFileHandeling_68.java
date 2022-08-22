import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TCA_DirectoryFileHandeling_68
{
	public static void main(String args[])
	{
		File file = new File(args[0]);

		try
		{
			
			if(!file.isDirectory())
			{
				System.out.println(args[0]+" Directory is not found!!!");
				System.exit(0);
			}
			if(!file.exists())
			{
				System.out.println(args[0]+" Directory does not exist!!!");
				System.exit(0);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}

		System.out.println("Directory Name  : "+ file.getName());
		System.out.println("Directory Path  : "+ file.getAbsolutePath());
		System.out.println("Directory Size  : "+ file.length());
		System.out.println("Readable  		: "+ file.canRead());
		System.out.println("Writable  		: "+ file.canWrite());
		System.out.println("Executable		: "+ file.canExecute());

	}
}