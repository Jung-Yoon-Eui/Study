package Team5_Task.Five;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];
		int max = arr[0];

		for(int i:arr){

			arr[i] = sc.nextInt();
			
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("�ִ밪 : "+max);
	}
}
