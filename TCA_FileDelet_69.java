//Deleting .yext files from given directory according to user choice. Accept Directory name from command line.
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TCA_FileDelet_69
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		File f = new File(args[0]);

		String fname[]  = f.list();
		System.out.println("No. of intries: "+fname.length);

		if(!f.exists())
		{
			System.out.println(args[0]+"  directory is not found!!!");
			System.exit(0);
		}
		if(!f.isDirectory())
		{
			System.out.println(args[0]+" is not a Directory!!!");
			System.exit(0);
		}

		for(int i=0; i<fname.length; i++)
		{
			if(fname[i].endsWith(".text"))
			{

				System.out.println("Do you want to delete "+fname[i]);
				System.out.println("Press 1 for YES");
				System.out.println("Press 2 for No");

				int choice = Integer.parseInt(br.readLine());

				if(choice == 1)
				{
					System.out.println(fname[i]+" is Deleted");
					File fob = new File(f.getAbsolutePath()+"\\"+fname[i]);
					fob.delete();
				}
				
			}
		}




	}
}