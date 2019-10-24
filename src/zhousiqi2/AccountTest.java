package zhousiqi2;

public class AccountTest {
	public static void main(String[] args) {
		Account a1=new Account(12386,15);
		Account a2=new Account(12345);
		a1.setBalance(20);
		a2.credit(10);
		a1.debit(5);
		System.out.println("The accountNumber of a1 is:"+a1.getAccountNumber());
		System.out.println("The balance of a1 and a2 are:"+a1.getBalance()+" "+a2.getBalance());
		System.out.println(a1);
		System.out.println(a2);
	}

}
