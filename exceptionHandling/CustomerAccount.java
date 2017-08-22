package exceptionHandling;

class HighBalanceException extends Exception{
	private static final long serialVersionUID = 1L;

	public HighBalanceException() {
		super("Customer Balance is more than limit.");
	}
}
class CustomerAccount {
	private int acctNum;
	private double balance;
	public static final double HIGH_CREDIT_LIMIT=2000.00;
	
	public CustomerAccount(int num,double bal) throws HighBalanceException {
		acctNum=num;
		balance=bal;
		if(balance>HIGH_CREDIT_LIMIT) {
			throw new HighBalanceException();
		}
		System.out.println("Account Number: "+acctNum+"\nBalance: "+balance);
	}

	public static void main(String[] args) {
		try {
		  new CustomerAccount(1000211, 3000.00);
		}catch(HighBalanceException h){
			System.out.println(h.getMessage());
			h.getStackTrace();
		}
	}
}
