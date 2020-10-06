package Tread;

public class SingleTreadEx extends Thread{
	
	private int[] temp;
	public SingleTreadEx(String theadname) {
		super(theadname);
		temp = new int[10];
		for(int start =0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for(int start:temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s ,",currentThread().getName());
			System.out.printf("temp value : %d %n ,",start);
		}
	}
	public static void main(String[] args) {
		SingleTreadEx st = new SingleTreadEx("첫번째");
		st.start();
	}
}
