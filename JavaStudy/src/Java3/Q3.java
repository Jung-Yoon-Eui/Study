package Java3;

import java.util.Scanner;

public class Q3 {

	// 0�� �Էµ� �� ���� ������ �Է� �޾�
	// 3�� ����� 5�� ����� ������ ���� ���� ���
	
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
