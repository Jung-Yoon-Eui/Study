package Star;

public class Star3 {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			
			for(int j=4; j>0; j--) {	// j가 4부터 0보다 클때까지 1씩 감소하는 동안 반복
				
				if(j>i) {	// j가 i보다 클 동안 공백 입력 (개행 x)
					System.out.print(" ");	
					
				}else{		// j가 i보다 크지 않으면 * 입력 (개행 x)
					System.out.print("*");
					
				}
				
			}
				// j가 0이 되면 내부 반복문 종료 및  개행 후 외부 반복문 시작
				System.out.println();	
		}
	}
}


