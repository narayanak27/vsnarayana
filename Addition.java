package Assignment;

import java.util.Scanner;

public class Addition {
	int add(int a,int b){
	
	
	int sum=a+b;
	//System.out.println(sum);
	return sum;
	}
	int sub(int a,int b) {
		int subtraction=a-b;
		//System.out.println(subtraction);
		return subtraction;
	}
	int mul(int a,int b) {
		int multiplication=a*b;
		return multiplication;
	}
	float div(float a,float b) {
		float division=a/b;
		return division;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x =");
		int x=sc.nextInt();
		System.out.println("enter the value of y =");
		int y=sc.nextInt();
		Addition obj=new Addition();
		int val=obj.add(x,y);
		System.out.println("sum of a and b is ="+val);
		int bal=obj.sub(x,y);
		System.out.println("subtraction of a and b is ="+bal);
		int pal=obj.mul(x,y);
		System.out.println("multiplication of a and b is ="+pal);
		float dal=obj.div(x,y);
		System.out.println("division of a and b is ="+dal);
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
