package Team5_Task.Two;

import java.util.Scanner;

public class Star_SandGlass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int star;
		
		
		while(true) {
				
			System.out.print("�𷡽ð��� ũ�� : ");
				star = sc.nextInt();
				
				if (star%2==0 || star<3 || star>40){	// n�� ¦���̰ų�, 3�̸��̰ų�, 40�ʰ�  �� ��
					System.out.println("������ �����ϼ���.");	// �ٽ� �Է�
					
				}else{		// �´� ������ ����
					break;	// �ش� �ݺ����� ���� �� ����� ����
				}
			}

		int hs = star/2;
		
		// x�� ��� �ﰢ������ j�� �ݺ� Ƚ���� �ٿ��ְ�, �ϴ� �ﰢ������ j�� �ݺ�Ƚ���� �÷���.
		for(int i=0, x=0; i<star; i++){	
			
			for(int j=0; j<star-x; j++){
		
				System.out.print( (j>=x) ? "*" : " " );
				
			}	//���� �ݺ����� ���� �� �� x�� ������ ����.
			
					if(i<hs){
					
					// ��� �ﰢ���� j�� �ݺ� Ƚ���� ���� �پ���� ��. > j�� �ݺ� ���ǽ��� �ִ밪�� �پ�� �� > x�� Ŀ���� ��.
						x++;
						
					}else{		
						
					//	�ϴ� �ﰢ���� j�� �ݺ� Ƚ���� �ٽ� �þ�� ��.> ... > x�� �۾����� ��.
						x--;
					}
				//x�� ������ ���� �� ���� > �ܺ� �ݺ������� ���ư�.
			System.out.println();
		}
	}
}