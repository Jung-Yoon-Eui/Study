package JavaArray;

public class ArrayExm {	// 1차원 배열

	public static void main(String[] args) {

		int[] arr = new int[3];
		
		for(int i=0; i < arr.length; i++) {
			
			arr[i] = i;
			System.out.println(arr[i]);
			
		}
	}
}


