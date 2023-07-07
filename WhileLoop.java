package Practice;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer value below 10 : ");
		
		int number=sc.nextInt();
		int sum=0;
		while(number<10) {
			sum=sum+number;
			number++;
			
		}
		System.out.println(sum);

	}

}
