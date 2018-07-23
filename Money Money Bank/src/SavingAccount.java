
public class SavingAccount 
{
	private static int AccountNumber;
	private String Name;
	private double Balance;
	
	public void Deposit(double Amount)
	{
		Balance+=Amount;
	}
	
	public void Withdraw(double Amount)
	{
		double balance=Balance;
		balance-=Amount;
		if(balance>0)
		{
		Balance-=Amount;
		}
	}

	public SavingAccount() {
		super();
		Name = null;
		Balance = 0;
	}

	public static int getAccountNumber() {
		return AccountNumber;
	}

	public static void setAccountNumber() {
		AccountNumber += 1;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
	
}
