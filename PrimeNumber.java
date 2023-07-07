package Practice;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime=true;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		sc.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

}
