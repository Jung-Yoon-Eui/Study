package Team5_Task.One;

import java.util.Scanner;

public class Star_H {

	public static void main(String[] args) {

		int n;	// H�� ���̸� ������ ���� ����.
				// n�� Ȧ���̸鼭 3�̻� 20������ ��.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("H�� ���� : ");
			n = sc.nextInt();
			
			if (n%2==0 || n<3 || n>20){	// n�� ¦���̰ų�, 3�̸��̰ų�, 20�ʰ�  �� ��
				System.out.println("������ �����ϼ���.");	// �ٽ� �Է�
				
			}else{		// �´� ������ ����
				break;	// �ش� �ݺ����� ���� �� ����� ����
			}
		}
		
		for (int i=1; i<=n; i++) {		// i��
			
			for(int j=1; j<=n; j++) { 	// j��
				
				if (i == (n/2)+1)		// n/2 �� �������� ���� �̹Ƿ� +1 ���־�� ��� ��	
					System.out.print("*");	// ��� �ٸ� ä��
				else {	// ��� ���� �ƴ� ��
					
					if(j==1 || j==n) { 	// j���� ù��° �Ǵ� �������� *	
						System.out.print("*");
					}else 				// j���� �������� ����
						System.out.print(" ");
				}
			}
				System.out.println();
		}
		
	}
}
