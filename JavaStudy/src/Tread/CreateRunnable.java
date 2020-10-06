package Tread;

public class CreateRunnable implements Runnable {

	public void run() {
		
	}
	
	public static void main(String[] args) {
		
		CreateRunnable ct = new CreateRunnable();
		Thread  t = new Thread(ct);
		t.start();
		
	}
}
