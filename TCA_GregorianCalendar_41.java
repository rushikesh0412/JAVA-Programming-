import java.io.*;
import java.util.Date;
import java.util.SimpleDateFormate;
import java.util.GregorianCalendar;
import java.util.Calendar;



public class TCA_GregorianCalendar_41
{
	public static void main(String []args)
	{
			Date d = new Date();

			SimpleDateFormate sdf = null;
			String str = null;

			sdf = new SimpleDateFormate("dd/MM/yyyy");
			str = sdf.format(d);
			System.out.println("Current Date id : "+ str);

			

	}
}