package JavaArray;

public class ArrayExm2 {	// 2차원 배열

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		
		int x,y; // x=행, y=열
		
		for(x=0; x < arr.length; x++) {
			
			for(y=0; y < arr[x].length; y++) {
				
				arr[x][y] = y;

				System.out.print("("+x+","+arr[x][y]+")");
			}
				System.out.println();
		}
	}
}

