package Team5_Task.One;

import java.util.Scanner;

public class Star_nemo {

	public static void main(String[] args) {

		int n;	// ���簢���� �� ���� ���̸� ������ ���� ����.
		// n�� Ȧ���̸鼭 3�̻� 20������ ��.

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�� ���� ���� : ");
			n = sc.nextInt();
			
			if (n%2==0 || n<3 || n>20){	// n�� ¦���̰ų�, 3�̸��̰ų�, 20�ʰ�  �� ��
				System.out.println("���̸� �����ϼ���.");	// �ٽ� �Է�
				
			}else{		// �´� ������ ����
				break;	// �ش� �ݺ����� ���� �� ����� ����
			}
		}
		
		for (int i = 1; i < n+1; i++) {		// ����
			
			for (int j = 0; j < n+1; j++) {	// ����
			
				if (i == 1 || i == n) 	// ������ �Ʒ��� (ù�ٰ� ��������)	
					System.out.print("*");	// ��� ä��
				else { // ������ �Ʒ����� �ƴ� ��
					if (j == 0 || j == n) {	// ���ʺ��� �����ʺ��� *
						System.out.print("*");
					}else{ 	// �߾� ����
						System.out.print(" ");
					}
				}
			}
				System.out.println();	
		}
	}
}
