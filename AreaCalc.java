import java.util.*;
abstract class Shape
{
	double a,b;
	Shape()
	{
		System.out.println("\nInside Shape Default Constructor");
		a=0;
		b=0;
	}
	Shape(double x)
	{
		System.out.println("\nInside Shape  1 Parameterized Constructor");
		a=x;
	}
	Shape(double x,double y)
	{
		System.out.println("\nInside Shape 2 Parameterized Constructor");
		a=x;
		b=y;
	}
	abstract void printArea();
}
class Triangle extends Shape
{
	double tarea;
	Triangle()
	{
		System.out.println("\nInside Triangle Default Constructor");
		tarea=0;
	}
	Triangle(double x,double y)
	{	
		System.out.println("\nInside Triangle Parameterized Constructor");
		tarea=0;
	}
	void printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Base:");
		a=sc.nextDouble();
		System.out.println("\nEnter the Height:");
		b=sc.nextDouble();
		tarea=0.5*a*b;
		System.out.println("\nTriangle Area:"+tarea);
	}
}
class Rectangle extends Shape
{
	double rarea;
	Rectangle()
	{
		System.out.println("\nInside Rectangle Default Constructor");
		rarea=0;
	}
	Rectangle(double x,double y)
	{
		super(x,y);
		System.out.println("\nInside Rectangle Parameterized Constructor");
		rarea=0;
	}
	void printArea()
	{
		rarea=a*b;
		System.out.println("\nRectangle Area:"+rarea);
	}
}
class Circle extends Shape
{
	double carea;
	Circle()
	{
		System.out.println("\nInside Circle Default Constructor");
		carea=0;
	}
	Circle(double x)
	{
		System.out.println("\nInside Circle Parameterized Constructor");
		carea=0;
	}
	void printArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Side:");
		a=sc.nextDouble();
		carea=3.14*a*a;
		System.out.println("\nCircle Area:"+carea);
	}
}
class AreaCalc
{
	public static void main(String args[])
	{
		Shape sref;
		Rectangle r=new Rectangle(10,20);
		Triangle t=new Triangle();
		Circle c=new Circle();
		sref=r;	
		sref.printArea();
		sref=t;	
		sref.printArea();
		sref=c;	
		sref.printArea();
	}
}

