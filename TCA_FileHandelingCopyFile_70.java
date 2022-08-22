//Write a java Program to copy image from one loacation to another location
import java.io.*;

public class TCA_FileHandelingCopyFile_70
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Pictures\\Rushi photos\\pranjal.jpg");
		byte b[] = new byte[fis.available()];
		fis.read(b);


		FileOutputStream fos = new FileOutputStream("D:\\java\\java program\\pranjal.jpg");
		fos.write(b);

		System.out.println("Copyid Succesfully!!!");
	}
}