package Java3;

import java.util.Scanner;

public class P166Q1 {

	// ��� �˰��� : ���丮�� ���ϱ�
	
	public static int factorial(int num) {
		
		if(num > 0) {
			return num * P166Q1.factorial(num - 1);
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���丮��? ");
		
		int num = sc.nextInt();
		
		System.out.println(num+ "! = "+ P166Q1.factorial(num));
		
	}
}
