package Practice;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of a triangle : ");
		int base=sc.nextInt();
		System.out.println("Enter the height of a triangle : ");
		int height=sc.nextInt();
		int area=(base*height)/2;
		System.out.println("Area of triangle is : "+area);

	}

}
