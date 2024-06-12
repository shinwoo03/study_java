package runnable;

public class RunnableMain {
	public static void main(String[] args) {
		
		Runnable digit = new DigitRunnable();
		Runnable alphabet = new AlphabetRunnable();
		
		Thread t1 = new Thread(digit);
		Thread t2 = new Thread(alphabet);
		
		t1.start();
		t2.start();
		
	}

}
