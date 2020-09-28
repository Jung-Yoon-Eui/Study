package Team5_Task.Five;

import java.util.Scanner;

public class Max2 {

	int max;
	
	public Max2() {
		max=0;
	}

	public int getMax() {
		return max;
	}

	public int getMax(int i, int j, int k) {

		if(i>max){
			max=i;
		}
		if(j>max){
			max=j;
		}
		if(k>max){
			max=k;
		}
		return max;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Max2  max = new Max2();
		
		int a,b,c =0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("�ִ밪 : " +max.getMax(a,b,c));
	}
}