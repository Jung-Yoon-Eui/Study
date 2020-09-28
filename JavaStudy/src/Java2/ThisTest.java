package Java2;

public class ThisTest {
	private int a;
	private int b;
	
	//생성자
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
//		위 두 생성자가 이 생성자를 통해 관리되도록 코드를 바꾸었기 때문에
//		유지보수가 편해진다. 이 생성자만 관리하면 되니까..
	}
	
	//메소드
	public int getA() { 
		
		return a;
	}
	
	public int getB() { 
		
		return b;
	}
	
	public static void main(String[] args) {

		ThisTest t1 = new ThisTest();	// 8라인 생성자 호출
		
		System.out.println(t1.getA());	// 0
		System.out.println(t1.getB());	// 0
		
		
		ThisTest t2 = new ThisTest(10);		// 13라인 생성자 호출
		
		System.out.println(t2.getA());	// 10
		System.out.println(t2.getB());	// 0
		
		
		ThisTest t3 = new ThisTest(20,30);	// 19라인 생성자 호출
		
		System.out.println(t3.getA());	// 20
		System.out.println(t3.getB());	// 30
		
	}
}