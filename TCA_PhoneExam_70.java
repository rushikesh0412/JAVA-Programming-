//Write a java Progaram that read a file containg name of person and contact.
//Allow user to Jump any position in the File and prints at the position.
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TCA_PhoneExam_70
{
	public static void main(String args[]) throws IOException
	{
		RandomAccessFile rf = new RandomAccessFile("phone.text", "rw");

		String str = null;

		System.out.println("Contents of File: ");

		while(true)
		{
			str = rf.readLine();

			if(str == null)
			{
				break;
			}
			System.out.println(str);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File("phone.text");

		System.out.print("Enter Position: ");
		int pos = Integer.parseInt(br.readLine());

		if(pos<0 || pos>f.length())
		{
			System.out.println("Invalid Position!!!");
		}
		else
		{
			rf.seek(pos);

			str = rf.readLine();

			if(str == null)
			{
				break;
			}
			System.out.println(str);
		}
		rf.close();
	}
}