package triphop.bank;


public class UserTransaction implements Runnable {

	private UserAccount account;
	private int amount;
	
	public UserTransaction(UserAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		
		try {
			account.withdraw(amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}