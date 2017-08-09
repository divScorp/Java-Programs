package ClassAndObjects;

class BankAccount {
	int accountNum = 0;
	float accountBalance = 0;

	public BankAccount() {
	}

	public BankAccount(int accountNumber, float balance) {
		accountNum = accountNumber;
		accountBalance = balance;
	}

	void setAccountNumber(int num) {
		accountNum = num;
	}

	void withdraw(float amount) {
		accountBalance = accountBalance - amount;
	}

	void deposit(float amount) {
		accountBalance = accountBalance + amount;
	}
	void status(){
		System.out.println("Account Number: "+accountNum);
		System.out.println("Account Balance: "+accountBalance);
	}
}

public class Bank {

	public static void main(String[] arg) {
		BankAccount account1 = new BankAccount();
		account1.setAccountNumber(456);
		account1.deposit(1000);
		account1.status();
		BankAccount account2 = new BankAccount(142, 2000);
		account2.withdraw(500);
		account2.status();
		
	}
}
