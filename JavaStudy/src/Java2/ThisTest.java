package Java2;

public class ThisTest {
	private int a;
	private int b;
	
	//������
	public ThisTest() {
//		a =  b = 0;
		this(0,0);
	}
	
	public ThisTest(int a) {
//		this.a = a;
//		b=0;
		this(a,0);
	}
	
	public ThisTest(int a, int b) {
		this.a = a;
		this.b = b;
//		�� �� �����ڰ� �� �����ڸ� ���� �����ǵ��� �ڵ带 �ٲپ��� ������
//		���������� ��������. �� �����ڸ� �����ϸ� �Ǵϱ�..
	}
	
	//�޼ҵ�
	public int getA() { 
		
		return a;
	}
	
	public int getB() { 
		
		return b;
	}
	
	public static void main(String[] args) {

		ThisTest t1 = new ThisTest();	// 8���� ������ ȣ��
		
		System.out.println(t1.getA());	// 0
		System.out.println(t1.getB());	// 0
		
		
		ThisTest t2 = new ThisTest(10);		// 13���� ������ ȣ��
		
		System.out.println(t2.getA());	// 10
		System.out.println(t2.getB());	// 0
		
		
		ThisTest t3 = new ThisTest(20,30);	// 19���� ������ ȣ��
		
		System.out.println(t3.getA());	// 20
		System.out.println(t3.getB());	// 30
		
	}
}