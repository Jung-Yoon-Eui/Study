package JavaArray;

public class ArrayExm3 {	// 3���� �迭

	public static void main(String[] args) {

		int[][][] arr = new int[2][3][4];
		
		int m,x,y; // x=��, y=��
		
		for(m=0; m < arr.length; m++) {
		
			for(x=0; x < arr[m].length; x++) {
				
				for(y=0; y < arr[m][x].length; y++) {
					
					arr[m][x][y] = y;
	
					System.out.print("("+m+","+x+","+ arr[m][x][y]+")");
				}
					System.out.println();
			}
		}
	}
}

