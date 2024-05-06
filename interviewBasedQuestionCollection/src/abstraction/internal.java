package abstraction;

public class internal extends external {
	
	private int  Balance = 45678;

	@Override
	void checkBalance() {
		System.out.println("your balance is :-"+Balance);
		
	}

	@Override
	void cashDeposite() {
		System.out.println("deposited successfully");
		
	}

	@Override
	void cashWithdrawal() {
		System.out.println("withdrawal successfully");
		
	}

}
