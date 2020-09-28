package Java3;

public class P38Q12Q13 {

	// ±¸ºÐ¼±ÀÌ ÀÖ´Â °ö¼ÀÇ¥, µ¡¼ÀÇ¥ Ãâ·Â
	
	public static void main(String[] args) {

		int i=0;
		int j=0;
		
		System.out.println("°ö¼ÀÇ¥");
		for(i=0; i<10; i++) {
			
			if(i==0) {
				System.out.print(" X |");
			}else{
				System.out.print(" "+i+" ");
			}
		}
		System.out.println("\n---+----------------------------");
		
		for(j=1; j<10; j++) {
			
			System.out.print(" "+j+" |");
			
			for(i=1; i<10; i++) {
				
				if(i*j >= 10) {
					System.out.print(" "+(i*j));
				}else {
					System.out.print(" "+(i*j)+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("µ¡¼ÀÇ¥");
		for(i=0; i<10; i++) {
			
			if(i==0) {
				System.out.print(" + |");
			}else{
				System.out.print(" "+i+" ");
			}
		}
		System.out.println("\n---+----------------------------");
		
		for(j=1; j<10; j++) {
			
			System.out.print(" "+j+" |");
			
			for(i=1; i<10; i++) {
				
				if(i+j >= 10) {
					System.out.print(" "+(i+j));
				}else {
					System.out.print(" "+(i+j)+" ");
				}
			}
			System.out.println();
		}
	}
}
