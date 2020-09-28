package Star;

public class Star4 {

	public static void main(String[] args) {

		for(int i=1;i<4;i++){ // 도형을 그릴 라인 수
			
			for(int j=1; j<4-i; j++){	
										//	i = 1 > 공백 2개 
				System.out.print(" "); 	//	i = 2 > 공백 1개 
										//	i = 3 > 공백 0개 
			}							//		----> j < (i범위 - i)
										
			for(int j=1 ;j<2*i; j++){	//	i = 1 > * 1개 > j<2
										//	i = 2 > * 3개 > j<4
				System.out.print("*"); 	//	i = 3 > * 5개 > j<6
										//		----> j < 2*i	
				}

			System.out.println("");	// 내부 반목문이 끝난 후 개행
		}
	}
}

