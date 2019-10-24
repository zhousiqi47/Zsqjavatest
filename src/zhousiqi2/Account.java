package zhousiqi2;

public class Account {
	private int accountNumber;
	private double balance;
	Account(int acc,double balance)
	{
		accountNumber=acc;
		this.balance=balance;
	}
	Account(int acc)
	{
		accountNumber=acc;
		balance=0.0;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double ba)
	{
	    balance=ba;
	}
	public void credit(double amount)
	{
		balance += amount;
	}
	 public void debit(double amount) 
	 {       
		 if (balance < amount) 
		 {          
			 System.out.println("amount withdrawn exceeds the current balance!");       
		 } 
		 else 
		 {          
			 balance -= amount;       
		 }    
	}
	public String toString()
	{
		return "A/C no:"+accountNumber+", Balance=$"+balance;
	}
	
	
	

}
