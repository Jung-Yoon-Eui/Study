package Java3;

import java.util.Scanner;

public class Q3 {

	// 0이 입력될 때 까지 정수를 입력 받아
	// 3의 배수와 5의 배수를 제외한 수의 개수 출력
	
	public static void main(String[] args) {

		int a;
		
		int check = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			a = sc.nextInt();
			
			if(a==0) break;
			
			if (a%3!=0 && a%5!=0){
				check++;
			}
		}
			System.out.println(check);
	}
}
