package Team5_Task.Three;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];	// 입력되는 정수는 100개 이하

		for(int i=0; i<num.length; i++){

			System.out.print("숫자 입력 : ");
			num[i] = sc.nextInt();	// 배열에 입력값 저장

			if(num[i] == 0) {	// 0이 되면 아래 반복문 출력 후 종료
				System.out.println("입력 개수 : "+i);

				for(int j=0; j<=i; j++) {

					if(num[j]%2==0) {	// 짝수이면 2로 나눈 나머지
						System.out.print(num[j]/2+"\t");                        
					}
					else {				// 짝수가 아니면  2배
						System.out.print(num[j]*2+"\t");
					}
				}
				break;
			}
		}
	}
}
