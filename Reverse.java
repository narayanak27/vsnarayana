package Practice;
import java.util.Scanner;
public class Reverse {
	
	public static void main(String[] args) {
		int reversenum=0;
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to reverse : ");
		num=sc.nextInt();
		while(num>0) {
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
			System.out.println("Reverse number is : "+reversenum);
		
	}

}
