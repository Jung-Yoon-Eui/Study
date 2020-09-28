package Java1;

import java.util.Scanner;

public class GetSetCalcMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CalculatorGetSet ye = new CalculatorGetSet();
		
		ye.setA(sc.nextInt());
		ye.setX(sc.next());		
		ye.setB(sc.nextInt());
		
		System.out.println(ye.Equals());
	}
}

