import java.io.*;


abstract class Shape
{
	public double radius;

	Shape(double radius)
	{
		this.radius = radius;
	}
	public void show()
	{
		System.out.println("I am in class shape in show function");
	}
	abstract public void area();
}
class B
{
	
	class Circle extends Shape  
	{
		//There is compulsery to implement all the function of the abstract class
		double PI = 3.17;
		double radius;
		Circle(double radius)
		{
			this.radius = radius;
		}
		public void area()
		{
			double ans = PI*radius*radius;
			System.out.println("Area of Circle is : " + ans);
		}
	}
}
class C
{
	Shape obc = new Shape()
	{
		//There is compulsery to implement all the function of the abstract class
		double PI = 3.17;
		
		public void area()
		{
			double ans = PI*radius*radius;
			System.out.println("Area of Circle is : " + ans);
		}
	}; 
}
public class TCA_AbstractInnerClass_60
{
	public static void main(String []args)
	{
		//abstract inner class
		B.Circle ob = new B().new Circle(3.5);
		ob.area();
		ob.show();

		C.Shape ob1 = new C().new Shape();
		ob1.area();
		ob1.show();
	}
}