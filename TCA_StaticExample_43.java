import java.io.*;
import java.io.BufferedReader;


class Cylinder
{
	final static double PI = 3.17;
	double radius;
	double height;
	

	Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}

	double volumeOFCylinder(double radius, double height)
	{
		return PI*radius*radius*height;
	}
	double surfaceAreaOFCylinder(double radius, double height)
	{
		return ((2*PI)*radius*heigth);
	}
}
class Circle
{
	final static double PI = 3.17;
	double radius;
	double height;


	Circle(double radius)
	{
		this.radius = radius;
	}
	Circle(double r , double h)
	{
		this.radius = radius;
		this.height = height;
	}

	double areaOfCircle(double radius)
	{
		return (PI*radius*radius);
	}
	double perimeterOfCircle()
	{
		return 2*PI*radius;
	}
}

class Triangle
{
	double base;
	double height;

	Triangle(double base, double height)
	{
		this.base   = base;
		this.height = height;
	}

	double areaOfTriangle(double base, double height)
	{
		return ((1/2)*base*height);
	}
	double perimeterOfTriangle(double base, double height)
	{
		return ((base*2)*height);
	}

}

public class TCA_StaticExample_43 
{
	public static void main(String []args) throws IOException, NumberFormatException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("Enter the radius of the Circle: ");
		double r = Double.parseDouble(br.readLine());
		Circle c = new Circle(r);
			
		double area = c.areaOfCircle();
		System.out.println("Area of Circle : " + area );
		System.out.println("\n");
		









		//Triangle
		Triangle t = new Triangle();


		//Cylinder
		Cylinder cd =new Cylinder();


	}
}