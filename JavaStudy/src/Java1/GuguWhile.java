package Java1;

public class GuguWhile {

	public static void main(String[] args) {

		int i=1;
		
		while(i<10) {
			
			int j=2;
			
			while(j<10) {
				
				System.out.printf("%d X %d = %d \t", j,i,(i*j));
				
				j++;
				
			}
			
			i++;	
			System.out.println();
			
		}
	}
}

