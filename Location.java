package Close_book;
import java.util.Arrays;
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		System.out.println("Enter the elements to be entered : ");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		for(int res:arr) {
			System.out.println(res);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element to search : ");
		int key=sc.nextInt();
		String abc="not present";
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				abc="present";
				
			}
			
		}
		System.out.println(abc);
	}

}
