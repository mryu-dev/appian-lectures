

class BankAccount {

	int balance;
	BankAccount(int bal) {
		balance = bal;
	}

	public void login(String pass) {
		if(pass.equals("mzos")) {
			Transaction t = new Transaction();
			t.deposit(500);
			t.withdraw(600);	
		}
		else{
			System.out.println("Invalid credentials");
		}
	}

	private class Transaction {
		
		public void deposit(int amt) {
			balance+=amt;
			System.out.println("After deposit balance is:"+balance);
		}
		public void withdraw(int amt) {
			balance-=amt;
			System.out.println("After withdraw balance is:"+balance);
		}
	}

}


public class InnerDemo {
	public static void main(String a[]) {
	BankAccount b = new BankAccount(10000);
	b.login("mzos");
	
	}
}














