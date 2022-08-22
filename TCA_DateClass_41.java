import java.io.*;
import java.util.Date;




public class TCA_DateClass_41
{
	public static void main(String []args)
	{
		Date d = new Date();
		System.out.println();

		int hh = d.getHours();
		int mm = d.getMinutes();
		int ss = d.getSeconds();

		System.out.println("Time = "+ hh + ":" + mm + ":" + ss);


		int day = d.getDate();
		int month = d.getMonth() + 1;
		int year = d.getYear() + 1900;

		System.out.println("Date : "+ day + "-" + month + "-" + year); 
	}
}