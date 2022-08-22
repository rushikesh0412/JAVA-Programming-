
//Lab Assignment 3: 3.	Write a program to simulate Go back N Modes of Sliding Window Protocol in peer to peer mode.
//**** Server Code ****
import java.io.*;
import java.net.*;
import java.util.*;

class testserver
{
public static void main(String args[])throws IOException
{
System.out.println("...........Server..........");
System.out.println("Waiting for connection....");
InetAddress addr=InetAddress.getByName("Localhost");
ServerSocket ss=new ServerSocket(500);

Socket client=new Socket();
client=ss.accept();

BufferedInputStream in=new BufferedInputStream(client.getInputStream());
DataOutputStream out=new DataOutputStream(client.getOutputStream());

System.out.println("Received request for sending frames");
int p=in.read();

boolean f[]=new boolean[p];

int pc=in.read(); //Choice ... Error or non-error
System.out.println("Sending....");

if(pc==0)//No error case
{
	for(int i=0;i<p;++i)
	{
	System.out.println("sending frame number "+i);
	out.write(i);
	out.flush();
	System.out.println("Waiting for acknowledgement");
	try
	{
	Thread.sleep(7000);
	}
	catch(Exception e){}

	int a=in.read();
	System.out.println("received acknowledgement for frame "+i+" as "+a);
	}
	out.flush();
	}
else // Error Case
{
	for(int i=0;i<p;++i)
	{
	if(i==2) //Creating a scenario of error (not sending the frame)
		{
		System.out.println("sending frame no "+i);
		}
	else
		{
		System.out.println("sending frame no "+i);
		out.write(i);
		out.flush();
		System.out.println("Waiting for acknowledgement ");
		try
			{
			Thread.sleep(7000);
			}
		catch(Exception e){}

		int a=in.read();

		if(a!=255)
			{
			System.out.println("received ack for frame no: "+i+" as "+a);
			f[i]=true;
			}
		}// end of inner else
}// end of for

// check which frames have not been ack

for(int a=0;a<p;++a)
{
	if(f[a]==false)
		{
		System.out.println("Resending frame "+a);
		out.write(a);
		out.flush();
		System.out.println("Waiting for ack ");
		try
			{
			Thread.sleep(5000);
			}
		catch(Exception e){}

		int b=in.read();
		System.out.println("received ack for frame no: "+a+" as "+b);
		f[a]=true;
		}
	}
	out.flush();
}// end of else which is for error 

in.close();
out.close();
client.close();
ss.close();
System.out.println("Quiting");

}// end main method
}// end main class
//testserver.java
//Displaying Client.java.