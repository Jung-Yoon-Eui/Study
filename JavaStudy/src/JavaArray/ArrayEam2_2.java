package JavaArray;

public class ArrayEam2_2 {

	public static void main(String[] args) {

		int x,y; // x=행, y=열
		
		int[][] a = new int[2][];	//y의 크기를 확정하지 않음
										
		// y의 크기 수동 지정
		a[0] = new int[2];
		a[1] = new int[4];
		
		for(x=0; x<a.length; x++) {
			
			for(y=0; y<a[x].length; y++) {
				
				a[x][y] = y;

				System.out.print("("+x+","+a[x][y]+")");
			}
				System.out.println();
		}
	}
}

