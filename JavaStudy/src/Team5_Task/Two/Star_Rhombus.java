package Team5_Task.Two;

import java.util.Scanner;

public class Star_Rhombus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�缱�� ���⸦ �Է��ϼ��� : ");
		int star = sc.nextInt();
			
		for(int i=0, x=0; i<star; i++,x++){	// x�� j�� �ݺ� Ƚ���� �÷��ֱ� ����.
			
			for(int j=0; j<star+x; j++){
		
				System.out.print( (j>=x) ? "*" : " " );
			}	
				
			System.out.println();
		}   	 
	}
}

