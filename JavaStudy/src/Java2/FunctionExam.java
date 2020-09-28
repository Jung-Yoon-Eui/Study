package Java2;

public class FunctionExam {

	public void disp() {
		
		System.out.println("test");
	}
	
	public static void disp2() {
		
		System.out.println("test2222");
	}
	
	
	public static void main(String[] args) {

		// 참조변수 선언
		FunctionExam fe;
		//객체 생성
		fe = new FunctionExam();	
		
//		>> fe가 stack에 올라감. FunctionExam이 heap에 있음
		
		fe.disp(); // 참조형 타입으로 받는 메소드는 인스턴스 메소드!
		
		fe.disp2(); // ↓ 헷갈리지 않게 이렇게! 스태틱 메소드는 클래스 이름으로 받을 수 있다.
		FunctionExam.disp2();
	}
}
