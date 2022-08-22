import java.io.*;

class GarbageCollector{
	int i = 11;
	int j = 22;

	GarbageCollector()
	{
		System.out.println("I am a constructor!");
		System.out.println("i = "+ i + "\nj = "+ j);
	}

	public void finalize()                          //this is same as Distructor in c++
	{
		System.out.println("I am in finalize!!!");     //this function is use for removeing the reference of the data members
	}
}

public class TCA_GarbageCollector_46
{
	public static void main(String []args)
	{
		System.out.println("main start!!");
		GarbageCollector ob = new GarbageCollector();
		GarbageCollector ob2 = new GarbageCollector();

		//Create garbage 
		ob = null;
		ob2 = null;

		//calling to the garbage collector
		System.gc();

		//or

		Runtime rt = Runtime.getRuntime();
		rt.gc();

		System.out.println("End of the program!!!");


	}
}







