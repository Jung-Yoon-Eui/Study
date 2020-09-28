package Java3;

import java.util.Scanner;

public class P61Q2 {

	// 배열의 요소를 역순 정렬

	public void swap(int[] arr, int idx1, int idx2) {
		
		// 지정한 두 값을 교환
		int keep  = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = keep;
	}
	
	public void reverse(int[] arr) {
		
		// 배열 arr를 역순 정렬
		for(int i = 0; i<arr.length/2; i++) {
						
			// 배열 arr에 [i번째] 요소와 [배열의 길이-1-i번째] 요소를 바꿈.
			swap(arr,i,arr.length-1-i);
		}				
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 :");
		int num = sc.nextInt();
		
		int[] arrExm = new int[num];

		// 배열의 요소 값 랜덤 저장 및 출력 ( 1이상 11미만 )
		System.out.print("arrExm[] => [ ");
		
		for(int i=0; i<arrExm.length; i++) {
			
			arrExm[i]=(int)(Math.random()*10+1);
			System.out.print(arrExm[i] + " ");
			
		}
		System.out.println("]");
		
		System.out.println("     ↓↓↓역순 정렬↓↓↓");
			P61Q2 q2 = new P61Q2();
			q2.reverse(arrExm);
		
		System.out.print("arrExm[] => [ ");
		
		for(int i:arrExm) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
}
