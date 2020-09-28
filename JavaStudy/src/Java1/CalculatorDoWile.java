package Java1;

import java.util.Scanner;

public class CalculatorDoWile {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); // 키보드 입력 객체 선언

	int a,b;   // 두 수 입력 변수 선언 
	String x; // 연산자 입력 변수 선언
	String start; // 계산 시작 변수 선언
	String k;

	do {
		start ="";
		System.out.println("계산하시겠습니까? [Y/N]");	
		start = sc.nextLine();

		if (start.equalsIgnoreCase("y")) {

			System.out.println("계산식을 입력하세요.");

			a = sc.nextInt();
			x = sc.next();
			b = sc.nextInt();	

			switch(x){
			
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
				
			default : System.out.println("잘못된 요청입니다.");
			}

		}else if(start!="y") {
			System.out.println("종료되었습니다.");
			break;
		}
		System.out.println("재시작?[Y/N]");
		k= sc.next();

	}while(k.equalsIgnoreCase("y"));
}
}
