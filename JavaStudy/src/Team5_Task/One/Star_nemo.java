package Team5_Task.One;

import java.util.Scanner;

public class Star_nemo {

	public static void main(String[] args) {

		int n;	// 정사각형의 한 변의 길이를 저장할 변수 선언.
		// n은 홀수이면서 3이상 20이하의 값.

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("한 변의 길이 : ");
			n = sc.nextInt();
			
			if (n%2==0 || n<3 || n>20){	// n이 짝수이거나, 3미만이거나, 20초과  일 때
				System.out.println("길이를 수정하세요.");	// 다시 입력
				
			}else{		// 맞는 범위만 남음
				break;	// 해당 반복문을 종료 후 별찍기 시작
			}
		}
		
		for (int i = 1; i < n+1; i++) {		// 가로
			
			for (int j = 0; j < n+1; j++) {	// 세로
			
				if (i == 1 || i == n) 	// 윗변과 아랫변 (첫줄과 마지막줄)	
					System.out.print("*");	// 모두 채움
				else { // 윗변과 아랫변이 아닐 때
					if (j == 0 || j == n) {	// 왼쪽변과 오른쪽변에 *
						System.out.print("*");
					}else{ 	// 중앙 공백
						System.out.print(" ");
					}
				}
			}
				System.out.println();	
		}
	}
}
