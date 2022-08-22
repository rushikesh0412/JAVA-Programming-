//Write a program which demonstrate RandomAccessFile.
/*   Assuming a.text having single line "India is my Love"  */
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class TCA_RandomAccessFile_70
{
	public static void main(String args[]) throws IOException
	{
		RandomAccessFile rf = new RandomAccessFile("a.text", "rw");

		System.out.println(rf.readLine());      //India is my love

		rf.seek(2);
		System.out.println(rf.readLine());      //dia is my love

		rf.seek(12);
		rf.writeBytes("country");               //replacing love by country.

		/* How to Append */

		File f = new File("a.text");
		rf.seek(f.length());

		rf.writeBytes("I Love my India!!!");
		rf.close();
	}
}