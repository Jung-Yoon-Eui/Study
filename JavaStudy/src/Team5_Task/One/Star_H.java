package Team5_Task.One;

import java.util.Scanner;

public class Star_H {

	public static void main(String[] args) {

		int n;	// H의 길이를 저장할 변수 선언.
				// n은 홀수이면서 3이상 20이하의 값.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("H의 길이 : ");
			n = sc.nextInt();
			
			if (n%2==0 || n<3 || n>20){	// n이 짝수이거나, 3미만이거나, 20초과  일 때
				System.out.println("범위를 수정하세요.");	// 다시 입력
				
			}else{		// 맞는 범위만 남음
				break;	// 해당 반복문을 종료 후 별찍기 시작
			}
		}
		
		for (int i=1; i<=n; i++) {		// i행
			
			for(int j=1; j<=n; j++) { 	// j열
				
				if (i == (n/2)+1)		// n/2 후 나머지는 버림 이므로 +1 해주어야 가운데 줄	
					System.out.print("*");	// 가운데 줄만 채움
				else {	// 가운데 줄이 아닐 때
					
					if(j==1 || j==n) { 	// j열의 첫번째 또는 마지막은 *	
						System.out.print("*");
					}else 				// j열의 나머지는 공백
						System.out.print(" ");
				}
			}
				System.out.println();
		}
		
	}
}
