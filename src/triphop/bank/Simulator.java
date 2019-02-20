package triphop.bank;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
* The Triphop Assignment program implements an application that
* simply Perform operations on the account and the user's Wallet
* 
* The class helps to simulate the thread transaction
*
* @author  Mohammad Alkhalid
* @version 1.0
* @since   2019-02-19 
*/

public class Simulator {

	public static void main(String[] args) {
		
		//Perform test
		
		UserAccount userAccount = new UserAccount(50); // Initial Wallet Balance
		ExecutorService threadsExecutor = Executors.newFixedThreadPool(3); // Number of Threads
		
		for(int i = 0; i < 10; i++) {
			
			int randomAmount = (new Random().nextInt(10)) + 1;
			threadsExecutor.execute(new UserTransaction(userAccount, randomAmount));
		}
		
		threadsExecutor.shutdown();
	}
}
