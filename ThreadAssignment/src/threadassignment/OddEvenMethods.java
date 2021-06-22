package threadassignment;

public class OddEvenMethods {

	boolean odd;
	int count = 0;
	int MAX = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(" " + count);
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void printEven() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		synchronized (this) {
			while (count < MAX) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(" " + count);
				count++;
				odd = true;
				notify();

			}
		}
	}

	public static void main(String[] args) {

		OddEvenMethods oep = new OddEvenMethods();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printEven();

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				oep.printOdd();

			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
