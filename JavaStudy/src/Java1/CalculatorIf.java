package Java1;

import java.util.Scanner;

public class CalculatorIf {
	public static void main(String[] args) {
		
		int a,b;   // �� �� �Է� ���� ���� 
		String x;  // ������ �Է� ���� ����
		
		Scanner sc = new Scanner(System.in);  // Ű���� �Է� ��ü ����
		
		System.out.println("������ �Է����ּ���.");	
		
//		�Է�
		a = sc.nextInt();
		x = sc.next();
		b = sc.nextInt();
		
		System.out.print(a+"x"+b+"=");
		
/* + */	if(x.equals("+")) {
			System.out.println(a+b);
/* - */	}else if(x.equals("-")) {
			System.out.println(a-b);
/* * */	}else if(x.equals("*")) {
			System.out.println(a*b);
/* / */	}else if(x.equals("/")) {
			System.out.println(a/b);
		}else {
			System.out.println("�߸��� ��û�Դϴ�. �ٽ� ��û�ϼ���.");
		}
	}
}
