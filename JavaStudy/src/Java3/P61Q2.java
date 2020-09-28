package Java3;

import java.util.Scanner;

public class P61Q2 {

	// �迭�� ��Ҹ� ���� ����

	public void swap(int[] arr, int idx1, int idx2) {
		
		// ������ �� ���� ��ȯ
		int keep  = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = keep;
	}
	
	public void reverse(int[] arr) {
		
		// �迭 arr�� ���� ����
		for(int i = 0; i<arr.length/2; i++) {
						
			// �迭 arr�� [i��°] ��ҿ� [�迭�� ����-1-i��°] ��Ҹ� �ٲ�.
			swap(arr,i,arr.length-1-i);
		}				
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� :");
		int num = sc.nextInt();
		
		int[] arrExm = new int[num];

		// �迭�� ��� �� ���� ���� �� ��� ( 1�̻� 11�̸� )
		System.out.print("arrExm[] => [ ");
		
		for(int i=0; i<arrExm.length; i++) {
			
			arrExm[i]=(int)(Math.random()*10+1);
			System.out.print(arrExm[i] + " ");
			
		}
		System.out.println("]");
		
		System.out.println("     ���鿪�� ���ġ���");
			P61Q2 q2 = new P61Q2();
			q2.reverse(arrExm);
		
		System.out.print("arrExm[] => [ ");
		
		for(int i:arrExm) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
}
