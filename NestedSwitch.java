package Practice;

public class NestedSwitch {

	public static void main(String[] args) {
		int num=1;
		int month=2;
		switch(num)
		{
			case 1 :
				switch(month){
				case 1:
				{
					System.out.println("mar");
					break;
				}
				case 2:
				{
					System.out.println("april");
					break;
				}
				
				}
				break;
			case 2 :
				switch(month) {
				case 1:
				{
					System.out.println("jan");
					break;
				}
				case 2:
				{
					System.out.println("feb");
					break;
				}
				
				}
				break;
		}

	}

}
