package Star;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ũ�⸦ �����ϼ���. : ");
		
		int star = sc.nextInt();
		int hs = star/2;
		
		for(int i=0; i<star; i++){
			
			for(int j=0; j<star; j++){
		
				if(i<=hs){	// ��
					
					if(i+j<hs || j-i>hs){ // ���� ��, ������ ��
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
					
				}else if(i>hs){	// �Ʒ�
					
					if(i-j>hs || i+j>hs*3){ // ���� �Ʒ�, ������ �Ʒ�
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
			}
				System.out.println();
		}
	}
}

