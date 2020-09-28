package Team5_Task.Two;

import java.util.Scanner;

public class Star_Rhombus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("사선의 굵기를 입력하세요 : ");
		int star = sc.nextInt();
			
		for(int i=0, x=0; i<star; i++,x++){	// x는 j의 반복 횟수를 늘려주기 위함.
			
			for(int j=0; j<star+x; j++){
		
				System.out.print( (j>=x) ? "*" : " " );
			}	
				
			System.out.println();
		}   	 
	}
}

