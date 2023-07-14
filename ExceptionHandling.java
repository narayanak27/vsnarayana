package july14;

public class ExceptionHandling {
	public void division() {
		try {
			int i=1/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
			System.out.println();
		}
	}


