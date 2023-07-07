package Practice;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of a circle : ");
		Double radius=sc.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("area of circle : "+area);

	}

}
