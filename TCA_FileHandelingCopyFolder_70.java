//Write a java Program to copy image from one loacation to another location
import java.io.*;

public class TCA_FileHandelingCopyFolder_70
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("E:\\DSA Playlist");
		byte b[] = new byte[fis.available()];
		fis.read(b);


		FileOutputStream fos = new FileOutputStream("D:\\DSA Playlist");
		fos.write(b);

		System.out.println("Copyid Succesfully!!!");
	}
}