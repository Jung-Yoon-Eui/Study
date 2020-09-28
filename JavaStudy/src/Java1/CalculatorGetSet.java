package Java1;

public class CalculatorGetSet {

	//필드 변수 선언
	private int equals; // 결과 값
	private int a,b;	// 계산 할 값
	private String x; 	// 연산자 부호
	
	
	//setter
	public void setA(int a) {
		this.a = a;
	}
	
	public void setX(String x) {
		this.x = x;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	

	//getter
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public String getX() {
		return x;
	}
	
	
	//method
	public int Equals() {
		
		switch(x){
			case "+":	// 더하기
				equals = (getA()+getB());
			break;
			case "-":	//빼기
				equals = (getA()-getB());
			break;
			case "*":	//곱하기
				equals = (getA()*getB());
			break;
			case "/":	//나누기
				equals = (getA()/getB());
			break;
		default : System.out.println("잘못된 요청입니다.");
			System.exit(0);	//종료
		}
			return equals;	// 연산 결과 저장
	}
}

