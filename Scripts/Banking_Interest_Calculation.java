package File6_Recursion.Scripts;
import java.util.*;

/*
A better way than inheritance is to use interfaces or conditionals!
I will fix this example from using an abstract class account that is a superclass
that is extended by the subclass currentAccount.

I would not change any methods, only the way information is passed between!

I added a getCalculateInterest method because I want to encapsulate the calculateInterest method
logic. There is no sense that these methods should be public, to me at least.
 */

class Account{
	String name;
	int number, balance;
	int date;

	//added empty constructor
	public Account() {
	}

	//methods
	public double getCalculateInterest() {
		return calculateInterest();
	}

	public void getValues() {
		setValues(name, number, balance, date);
	}

	private void setValues(String name, int number, int balance, int date) {
		//logic here
	}

	private double calculateInterest() {
		//logic here
		return 0;
	}
	
}

class CurrentAccount {

	private final Account account;

	public CurrentAccount(Account account) {
		this.account = account;
	}

	public void calculate() {
		double interest = account.getCalculateInterest();
	}

	public void values() {
		account.getValues();
	}


}

public class Banking_Interest_Calculation {

	public static void main(String[] args) {
		Account account = new Account();
		CurrentAccount currentAccount = new CurrentAccount(account);

		currentAccount.calculate();
		currentAccount.values();
	}

}
