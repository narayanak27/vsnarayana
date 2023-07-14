package july14;

public class BankCoustomer {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount("narayana",987654321,75000);
		System.out.println(ba);
		ba.setBalance(99898);
		System.out.println(ba.getBalance());

	}

}
