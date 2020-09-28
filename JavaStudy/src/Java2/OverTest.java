package Java2;

public class OverTest {

	//메소드 오버로딩
	public void disp(char ch) {
		
		System.out.println(ch);
	}
	
	public void disp(int i) {
		
		System.out.println(i);	
	}
	
	public void disp(char ch, int i) {

		System.out.print(ch);
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {

		OverTest ot = new OverTest();
		
		ot.disp('a');
		ot.disp(100);
		ot.disp('b',20);
		
	}
}
