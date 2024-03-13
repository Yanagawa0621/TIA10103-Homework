package homework9;

public class BigEaterCompetition implements Runnable {
	private int bowl = 1;
	private String name;

	public BigEaterCompetition() {

	}

	public BigEaterCompetition(String name) {
		this.name = name;
	}

	public void setBigEaterCompetition(String name) {
		this.name = name;
	}

	public void getBigEaterCompetition() {

	}

	public void run() {
		while (bowl <= 10) {
			System.out.println(name + "吃第" + bowl + "碗飯");
			bowl++;
			if (bowl == 11) {
				System.out.println(name + "吃完了!");
			}
			try {
				Thread.sleep((long) ((Math.random() * 3000) + 500));
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		BigEaterCompetition r1 = new BigEaterCompetition("詹姆士");
		BigEaterCompetition r2 = new BigEaterCompetition("饅頭人");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		System.out.println("===============大胃王快食比賽開始!===============");
		t1.start();
		t2.start();
	}
}
