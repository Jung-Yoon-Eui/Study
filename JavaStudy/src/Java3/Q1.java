package Java3;

import java.util.Scanner;

public class Q1 {

	// 0이 입력 되기 전까지 양의 정수를 입력 받아홀수의 개수와 짝수의 개수 구하기

	public static void main(String[] args) {
	
		int a;
		
		int odd = 0;   // 홀수
		int even = 0;  // 짝수
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			a = sc.nextInt();
			
			if(a==0) break;
			
			if(a>0 && a%2!=0){
				odd++;
			}else if(a>0 && a%2==0){
				even++;
			}
		}	
			System.out.println("odd : "+odd);
			System.out.println("even : "+even);
	}
}
