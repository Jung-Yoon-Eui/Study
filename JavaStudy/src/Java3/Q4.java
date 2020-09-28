package Java3;

import java.util.Scanner;

public class Q4 {

	// 1,2,3 의 합으로 나타내는 방법의 개수 a개 구하기
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int num = 0;

		int[] arr = new int[11];
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		
		for(int i = 3; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		
		for(int i = 0; i < a; i++) {
		
			num = sc.nextInt();
			System.out.println(arr[num]);
		}
		
		sc.close();
	}
}

