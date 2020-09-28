package Team5_Task.Five;

import java.util.Scanner;

public class Invol {

	public static void main(String[] args) {
		
		int a,b;
		int c = 1;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(int i=0; i<b; i++){
			
			c*=a;
		}
			System.out.println(c);
	}	
}
