package Java1;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		int a,b;   // �� �� �Է� ���� ���� 
		String x;  // ������ �Է� ���� ����
		
		Scanner sc = new Scanner(System.in);  // Ű���� �Է� ��ü ����
		
		System.out.println("������ �Է����ּ���.");
		
//		�Է�
		a = sc.nextInt(); 
		x = sc.next();
		b = sc.nextInt();
		
		switch(x){
		case "+":
			System.out.println(a+b);
		break;
		case "-":
			System.out.println(a-b);
		break;
		case "*":
			System.out.println(a*b);
		break;
		case "/":
			System.out.println(a/b);
		break;
		default : System.out.println("�߸��� ��û�Դϴ�.");
		
		}
	}
}

