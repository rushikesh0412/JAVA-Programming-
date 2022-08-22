import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;


public class TCA_FileHandelingEven_70
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("How many numbers: ");
		int n = Integer.parseInt(br.readLine());

		FileWriter fw = new FileWriter("even.text");
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter number: ");
			int num = Integer.parseInt(br.readLine());

			if(num%2 == 0)
			{
				String str = Integer.toString(num);
				fw.write(str+ "\n");
			}
		}
		fw.close();
	}
}