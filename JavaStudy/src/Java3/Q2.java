package Java3;

import java.util.Scanner;

public class Q2 {

	// 실수 3개를 입력 받아 정수 부분의 합계와
	// 실수의 평균을 구한 뒤 정수 부분만 출력
	
	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.println("sum "+((int)a+(int)b+(int)c)); //정수 부분 합계
		System.out.println("avg "+(int)(a+b+c)/3);

	}
}
