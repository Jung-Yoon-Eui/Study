package Team5_Task.Three;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[100];	// �ԷµǴ� ������ 100�� ����

		for(int i=0; i<num.length; i++){

			System.out.print("���� �Է� : ");
			num[i] = sc.nextInt();	// �迭�� �Է°� ����

			if(num[i] == 0) {	// 0�� �Ǹ� �Ʒ� �ݺ��� ��� �� ����
				System.out.println("�Է� ���� : "+i);

				for(int j=0; j<=i; j++) {

					if(num[j]%2==0) {	// ¦���̸� 2�� ���� ������
						System.out.print(num[j]/2+"\t");                        
					}
					else {				// ¦���� �ƴϸ�  2��
						System.out.print(num[j]*2+"\t");
					}
				}
				break;
			}
		}
	}
}
