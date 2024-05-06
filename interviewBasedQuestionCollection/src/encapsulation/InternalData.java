package encapsulation;

public class InternalData extends Externaldata {

	
	private int Balance ;
	
	
	@Override
	int getBalance() {
		System.out.println(Balance);
		return Balance;
	}

	@Override
	void setBalance(int a) {
		this.Balance = a;
		
	}

}
