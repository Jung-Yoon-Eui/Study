package Star;

public class Star4 {

	public static void main(String[] args) {

		for(int i=1;i<4;i++){ // ������ �׸� ���� ��
			
			for(int j=1; j<4-i; j++){	
										//	i = 1 > ���� 2�� 
				System.out.print(" "); 	//	i = 2 > ���� 1�� 
										//	i = 3 > ���� 0�� 
			}							//		----> j < (i���� - i)
										
			for(int j=1 ;j<2*i; j++){	//	i = 1 > * 1�� > j<2
										//	i = 2 > * 3�� > j<4
				System.out.print("*"); 	//	i = 3 > * 5�� > j<6
										//		----> j < 2*i	
				}

			System.out.println("");	// ���� �ݸ��� ���� �� ����
		}
	}
}

