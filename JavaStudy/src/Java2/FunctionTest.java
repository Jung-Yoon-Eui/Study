package Java2;

class CallTest {

	private CallTest() {
		System.out.println("This ������ ȣ��");
	}
	
	// �޼ҵ�	// static �޼ҵ�� ��ü�� ������ �ʾƵ� ��� ����.
	public static CallTest  getCall() {
					//  �� ���� Ÿ���� Ŭ������!
		
		CallTest call = new CallTest();		// �޼ҵ� ������ ��ü ����!
		return      call    ;				// ���ϰ����� ��ü..
	}
	
	public  void disp() {
		System.out.println("disp");
	}
}
	
public class FunctionTest {
	
	public static void main(String[] args) {

//		CallTest test = new CallTest();   -- ��� �Ұ�
		
		CallTest call = CallTest.getCall();
		call.disp();
		
	}
}

