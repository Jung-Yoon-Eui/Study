package Java3;

import java.util.Stack;

public class P180Q6 {

	// 하노이의 탑
	private int n;	// 원반 개수
	private long count = 0L;	// 움직인 횟수

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
		
		// n-1 재귀 호출 > 출력, 카운트↑ > n-1 재귀 호출 > n = 1 재귀 탈출. 
		System.out.println("["+ n +"]번 원반을"+ x +"기둥에서"+ y +"기둥으로 옮김");
		this.setCount(this.getCount() + 1);
		
		if(n>1) {
			move(n-1,y,6-x-y);
		}
	}
}
