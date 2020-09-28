package Java1;

import java.util.Scanner;

public class CalculatorSwitch {
	public static void main(String[] args) {
		int a,b;   // 두 수 입력 변수 선언 
		String x;  // 연산자 입력 변수 선언
		
		Scanner sc = new Scanner(System.in);  // 키보드 입력 객체 선언
		
		System.out.println("계산식을 입력해주세요.");
		
//		입력
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
	}
}

