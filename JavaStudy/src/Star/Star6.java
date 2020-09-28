package Star;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("마름모의 크기를 지정하세요. : ");
		
		int star = sc.nextInt();
		int hs = star/2;
		
		for(int i=0; i<star; i++){
			
			for(int j=0; j<star; j++){
		
				if(i<=hs){	// 위
					
					if(i+j<hs || j-i>hs){ // 왼쪽 위, 오른쪽 위
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
					
				}else if(i>hs){	// 아래
					
					if(i-j>hs || i+j>hs*3){ // 왼쪽 아래, 오른쪽 아래
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

