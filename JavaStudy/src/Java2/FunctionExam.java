package Java2;

public class FunctionExam {

	public void disp() {
		
		System.out.println("test");
	}
	
	public static void disp2() {
		
		System.out.println("test2222");
	}
	
	
	public static void main(String[] args) {

		// �������� ����
		FunctionExam fe;
		//��ü ����
		fe = new FunctionExam();	
		
//		>> fe�� stack�� �ö�. FunctionExam�� heap�� ����
		
		fe.disp(); // ������ Ÿ������ �޴� �޼ҵ�� �ν��Ͻ� �޼ҵ�!
		
		fe.disp2(); // �� �򰥸��� �ʰ� �̷���! ����ƽ �޼ҵ�� Ŭ���� �̸����� ���� �� �ִ�.
		FunctionExam.disp2();
	}
}
