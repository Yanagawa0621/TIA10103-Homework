package homework9;

class Account {
	private static int lumpSum = 0;

	synchronized public void remittance(int amount) {
		while(lumpSum > 3000) {
			System.out.println("媽媽看到餘額再3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lumpSum += amount;
		System.out.println("媽媽存了" + amount + ",帳戶共有:" + lumpSum);
		notify();

	}

	synchronized public void withdraw(int amount) {
		while (lumpSum < amount) {
			System.out.println("熊大看到帳戶沒錢,暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		lumpSum -= amount;
		
		System.out.println("熊大領了" + amount + ",帳戶共有:" + lumpSum);
		if (lumpSum < 2000) {
			System.out.println("熊大看到餘額在2000以下,要求匯款");
			notify();
		}

	}
}

class Importer extends Thread {
	Account account;

	public Importer(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.remittance(2000);
		}
	}
}

class Withdrawer extends Thread {
	Account account;

	public Withdrawer(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
	}
}

public class XiongDa {
	public static void main(String[] args) {
		Account account = new Account();
		Importer importer = new Importer(account);
		Withdrawer withdrawer = new Withdrawer(account);
		importer.start();
		withdrawer.start();
	}
}
