package Practice;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("Given number is : "+number);
		if(number%2==0)
			System.out.println(number+" is even ");
		else
			System.out.println(number+" is not even");
			

	}

}
