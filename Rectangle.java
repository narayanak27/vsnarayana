package Practice;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		double length=sc.nextDouble();
		System.out.println("Enter the width of rectangle : ");
		double width=sc.nextDouble();
		double area=length*width;
		System.out.println("area of rectangle is : "+area);

	}

}
