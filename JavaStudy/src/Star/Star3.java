package Star;

public class Star3 {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			
			for(int j=4; j>0; j--) {	// j�� 4���� 0���� Ŭ������ 1�� �����ϴ� ���� �ݺ�
				
				if(j>i) {	// j�� i���� Ŭ ���� ���� �Է� (���� x)
					System.out.print(" ");	
					
				}else{		// j�� i���� ũ�� ������ * �Է� (���� x)
					System.out.print("*");
					
				}
				
			}
				// j�� 0�� �Ǹ� ���� �ݺ��� ���� ��  ���� �� �ܺ� �ݺ��� ����
				System.out.println();	
		}
	}
}


