import java.util.Scanner;
public class SavingAccMain {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		SavingAccount Savingaccount=new SavingAccount();
		Savingaccount.setAccountNumber();
		
		double balance;
		String name;
		int accno;
		
		System.out.print("Enter the name:");
		name=scanner.nextLine();
		Savingaccount.setName(name);
		
		System.out.println("Enter Initial deposit in account:");
		balance=scanner.nextDouble();
		Savingaccount.setBalance(balance);
		
		System.out.println("Enter 1 or deposit. 2 for withdrawal:");
		int state=scanner.nextInt();
		
		if(state==1)
		{
			System.out.println("Enter The amount to be deposit:");
			balance=scanner.nextDouble();
			Savingaccount.Deposit(balance);
		}
		else if(state==2)
		{
			System.out.println("Enter The amount to be withdrawn:");
			balance=scanner.nextDouble();
			Savingaccount.Withdraw(balance);
		}
		
		//System.out.println("Enter Account holder Name");
		//name=scanner.nextLine();
		System.out.println("Enter Account Number:");
		accno=scanner.nextInt();
		if(accno==Savingaccount.getAccountNumber())
		{
			//if(name==Savingaccount.getName())
			{
				System.out.println("Account details:");
				System.out.println("Account number:"+Savingaccount.getAccountNumber());
				System.out.println("Account name:"+Savingaccount.getName());
				System.out.println("Balance:"+Savingaccount.getBalance());
			}
		}
		

	}

}
