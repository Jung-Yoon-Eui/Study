package Star;

public class Star5 {

	public static void main(String[] args) {
		
//		��
		for(int i=1; i<4; i++){
			
			for(int j=1; j<4-i; j++){	
				System.out.print(" ");  
			}							 
			for(int j=1 ;j<2*i; j++){	
				System.out.print("*"); 	
			}							 
			System.out.println();		
		}
		
//		��
		for(int i=2; i>0; i--){

			for(int j=1; j<4-i; j++){	//	i = 2 > ���� 2�� : j=1,2
				System.out.print(" "); 	//	i = 1 > ���� 3�� : j=1,2,3  >> j<4-i
			}
				
			for(int j=1; j<2*i; j++){	//	i = 1 > * 3�� : j=1,2,3
				System.out.print("*");	//	i = 2 > * 1�� : j=1		>> j<2*i
			}
			System.out.println();
		}
			System.out.println();	
	}
}


