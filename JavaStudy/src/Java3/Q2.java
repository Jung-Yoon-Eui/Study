package Java3;

import java.util.Scanner;

public class Q2 {

	// �Ǽ� 3���� �Է� �޾� ���� �κ��� �հ��
	// �Ǽ��� ����� ���� �� ���� �κи� ���
	
	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.println("sum "+((int)a+(int)b+(int)c)); //���� �κ� �հ�
		System.out.println("avg "+(int)(a+b+c)/3);

	}
}
