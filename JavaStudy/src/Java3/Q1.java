package Java3;

import java.util.Scanner;

public class Q1 {

	// 0�� �Է� �Ǳ� ������ ���� ������ �Է� �޾�Ȧ���� ������ ¦���� ���� ���ϱ�

	public static void main(String[] args) {
	
		int a;
		
		int odd = 0;   // Ȧ��
		int even = 0;  // ¦��
		
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
