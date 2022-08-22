//24-09-2021
//Lecture No. : 24


//In java you can craete Array and object Dynamically



import java.io.*;

class Student{
	int rollno;
	String name;
	public void setRollno(int Roll_no){
		this.rollno = Roll_no;

	}
	public int getRollno(){
		return rollno;
	}

}
public class TCA_MemoryAllocation_24{
	public static void main(String []args)
	{

		int[] a = new int[3];

		Student s = new Student();

		//s.setRollno(5);
		//System.out.println(s.getRollno());


		int hc = a.hashCode();      //hashCode() method  is use for grtting hash Code
		System.out.println("HashCode :- " + hc );

		String str = a.toString();                  //toString is use for getting Reference
		System.out.println("Reference :- " + str); 
		System.out.println("Reference :- " + a);   
		


	}
}