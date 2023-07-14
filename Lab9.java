package july14;

public class Lab9 {
	public static String str1=new String("hariharan");
	public static String str2=new String("loose");
	
	public static void main(String[] args) {
		System.out.println(str1+str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.substring(1, 7));
		System.out.println(str2.replace('o','b'));
	}

}
