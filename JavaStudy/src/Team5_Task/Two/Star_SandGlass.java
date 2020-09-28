package Team5_Task.Two;

import java.util.Scanner;

public class Star_SandGlass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int star;
		
		
		while(true) {
				
			System.out.print("모래시계의 크기 : ");
				star = sc.nextInt();
				
				if (star%2==0 || star<3 || star>40){	// n이 짝수이거나, 3미만이거나, 40초과  일 때
					System.out.println("범위를 수정하세요.");	// 다시 입력
					
				}else{		// 맞는 범위만 남음
					break;	// 해당 반복문을 종료 후 별찍기 시작
				}
			}

		int hs = star/2;
		
		// x는 상단 삼각형에서 j의 반복 횟수를 줄여주고, 하단 삼각형에서 j의 반복횟수를 늘려줌.
		for(int i=0, x=0; i<star; i++){	
			
			for(int j=0; j<star-x; j++){
		
				System.out.print( (j>=x) ? "*" : " " );
				
			}	//내부 반복문이 종료 된 후 x의 증감을 정함.
			
					if(i<hs){
					
					// 상단 삼각형은 j의 반복 횟수가 점점 줄어들어야 함. > j의 반복 조건식의 최대값이 줄어야 함 > x가 커져야 함.
						x++;
						
					}else{		
						
					//	하단 삼각형은 j의 반복 횟수가 다시 늘어나야 함.> ... > x가 작아져야 함.
						x--;
					}
				//x의 증감을 정한 후 개행 > 외부 반복문으로 돌아감.
			System.out.println();
		}
	}
}