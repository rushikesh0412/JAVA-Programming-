import java.io.*;
import java.lang.Math;

abstract class Shape
{
	public double area;
	public double perimeter;

	abstract public void area();
	abstract public void perimeter();
}
class Circle extends Shape
{
	private double radius;

	Circle(double radius)
	{
		this.radius = radius;

	}
	public void area()
	{
		area = (Math.PI*radius*radius);
		System.out.println("Area of Circle: "+ area);
	}
	public void perimeter()
	{
		perimeter = (2*Math.PI*radius);
		System.out.println("Perimeter of Circle : "+ perimeter);
	}

}
class Rectangle extends Shape
{
	private double lenght, breadth;

	Rectangle(double lenght, double breadth)
	{
		this.lenght = lenght;
		this.breadth = breadth;
	}
	public void area()
	{
		area = (lenght*breadth);
		System.out.println("Area of Rectangle: "+ area );	
	}
	public void perimeter()
	{
		perimeter = (2*(lenght + breadth));
		System.out.println("Perimeter of Rectangle : "+ perimeter);

	}

}
class Triangle extends Shape
{
	private double base, height;

	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public void area()
	{
		area = ((1/2)*base*height);
		System.out.println("Area if triangle : "+ area);
	}
	public void perimeter()
	{
		perimeter = (base + height+ ((base*base) + (height*height)) );
		System.out.println("Perimeter of Triangle: "+ perimeter);
	}


}


public class TCA_AbstractClassMethod_56
{
	public static void main(String []args)
	{
		//For Circle 
		Circle c = new Circle(4.5);
		c.area();
		c.perimeter();

		System.out.println("----------------------------------");

		//For rectangle
		Rectangle r = new Rectangle(4.6,4.9);
		r.area();
		r.perimeter();
		
		System.out.println("----------------------------------");

		//For triangle
		Triangle t = new Triangle(4.6, 6.5);
		t.area();
		t.perimeter();




	}
} 