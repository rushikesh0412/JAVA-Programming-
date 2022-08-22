
import java.io.*;

public class Demo
{
	public static void main(String args[]) 
	{

		

		try
	    {
	    	String path ="C:\\Program Files\\VideoLAN\\VLC\\vlc.exe a.mp4";
	        Runtime.getRuntime().exec(path);
	    }
	    catch(IOException ioe)
	    {
	        ioe.printStackTrace();
	    }
		

	}
}

/*
	Runtime.getRuntime().exec("vlc a.mp4");

	3-Months
	---------
	Collection
	Multithreading
	JDBC
	Socket Programming
	Servlet [HTML/CSS/JS]
	JSP		[HTML/CSS/JS]

	TYBCS
		OS
		CC
		AJ
		Ajax/JS/JQuery/Web Technique/XML/...
		DA
		ST



*/