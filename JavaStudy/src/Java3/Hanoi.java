package Java3;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원반 몇 개? ");
		int n = sc.nextInt();

		P180Q6 p = new P180Q6(n);
		
		p.move(n,1,2);
		
		System.out.println("총 움직인 횟수 : "+ p.getCount());
	
		sc.close();
	}
}
