package Java2;

class CallTest {

	private CallTest() {
		System.out.println("This 생성자 호출");
	}
	
	// 메소드	// static 메소드는 객체를 만들지 않아도 사용 가능.
	public static CallTest  getCall() {
					//  ↑ 리턴 타입을 클래스로!
		
		CallTest call = new CallTest();		// 메소드 내에서 객체 생성!
		return      call    ;				// 리턴값으로 객체..
	}
	
	public  void disp() {
		System.out.println("disp");
	}
}
	
public class FunctionTest {
	
	public static void main(String[] args) {

//		CallTest test = new CallTest();   -- 사용 불가
		
		CallTest call = CallTest.getCall();
		call.disp();
		
	}
}

