import java.io.*;



//Note : We can applay Inheritance on an Interface

interface A
{
	void display();            //bydefault public abstract
}
interface B extends A
{
	void show();			   //bydefault public abstract
}
class MLI implements B
{
	
	public void display()
	{
		System.out.println("I am in display!!!");
	}
	public void show()
	{
		System.out.println("I am in Show!!!");
	}
	
}
public class TCA_InterfaceImplimentys_59
{
	public static void main(String []args)
	{
		B ob = new MLI();
		ob.display();
		ob.show(); 
	}
}







//Note : Java does not support multiple inheritance but java implements multiple inheritance

/*
interface A
{
	abstract public void display();            //bydefault public abstract
}
interface B 
{
	abstract public void show();
}
class MLI implements A,B 
{
	
		public void display()
		{
			System.out.println("I am in display!!!");
		}
		public void show()
		{
			System.out.println("I am in Show!!!");
		}
	
}
public class TCA_InterfaceImplimentys_59
{
	public static void main(String []args)
	{
		MLI ob = new MLI();
		//B ob = new MLI();                 //error: cannot find symbol symbol:   method display() location: variable ob of type B
		//A ob = new MLI();					// error: cannot find symbol symbol:   method show() location: variable ob of type A

		ob.display();
		ob.show(); 
	}
}
*/