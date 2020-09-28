package Java3;

import java.util.Stack;

public class P180Q6 {

	// �ϳ����� ž
	private int n;	// ���� ����
	private long count = 0L;	// ������ Ƚ��

	public P180Q6(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}

	public void move (int n, int x, int y) {
		
		if(n>1) {
			move(n-1,x,6-x-y);
		}
		
		// n-1 ��� ȣ�� > ���, ī��Ʈ�� > n-1 ��� ȣ�� > n = 1 ��� Ż��. 
		System.out.println("["+ n +"]�� ������"+ x +"��տ���"+ y +"������� �ű�");
		this.setCount(this.getCount() + 1);
		
		if(n>1) {
			move(n-1,y,6-x-y);
		}
	}
}
