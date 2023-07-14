package july14;
import java.util.Scanner;
abstract class Shape {
	abstract void calculateArea();
	Scanner sc=new Scanner(System.in);

}
class Rectangle extends Shape{

	@Override
	public void calculateArea() {
		System.out.println("Enter the length : ");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth : ");
		double breadth=sc.nextDouble();
		
		double area=length*breadth;
		System.out.println(area);
		
		
	}
}
class Circle extends Shape{
	public void calculateArea() {
		System.out.println("Enter the radius : ");
		double radius=sc.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println(area);
		
		
	}
}

