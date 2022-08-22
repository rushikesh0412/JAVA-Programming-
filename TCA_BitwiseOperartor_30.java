import java.util.*;


//2^0   --->  LSB
//2^n   ----> MSB


//sign int   -----> reserve last-bit for store -
//unsign int -----> reserve last-bit for store + 
public class TCA_BitwiseOperartor_30{
	public static void main(String []args) 
	{
		int a = 5;
		int b = 2;

		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a<<2);
		System.out.println(a>>2);
		System.out.println(a>>>2);

		int c = -5;
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(c>>>2);


	}
}