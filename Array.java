package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int sum=0;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		System.out.println("enterthe values of the array");
		array[0]=sc.nextInt();
		array[1]=sc.nextInt();
		array[2]=sc.nextInt();
		array[3]=sc.nextInt();
		array[4]=sc.nextInt();
		for(int result:array) {
			System.out.println(result);
		}
		
			for(int num:array) {
			sum=sum+num;
		}
		System.out.println(sum);
		
		int avg=sum/array.length;
		System.out.println(avg);
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(array)) ;
		System.out.println("max : "+array[array.length-1]+" ");
		System.out.println("min : "+array[0]+" ");
		System.out.println("sorted array : "+Arrays.toString(array)) ;
		System.out.println("enter the element to search : ");
		int key=sc.nextInt();
		String res="not present";
		for(int i=0;i<array.length;i++) {
			if(key==array[i]) {
				res="present";
				//System.out.println("present");
			}
			
			
		}
		System.out.println(res);
		System.out.println("Enter the index should be modified");
		int modify=sc.nextInt();
		System.out.println("Enter the values should be modified");
		array[modify]=sc.nextInt();
		
		System.out.println(Arrays.toString(array));
		
		
	}

}
