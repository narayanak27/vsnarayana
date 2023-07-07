package Practice;

public class CountingPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PrimeNumber="";
		for(int i=2;i<=100;i++)
		{
			int counter=0;
			for(int num=i;num>=1;num--) 
			{
				if(i%num==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				PrimeNumber=PrimeNumber+i+" ";
			}
			
		}
		System.out.println("Enter the primenumbers from 1 to 100 : ");
		System.out.println(PrimeNumber);

	}

}
