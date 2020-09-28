package JavaArray;

public class StringArr {

	public static void main(String[] args) {

		String str = "Superman";
		System.out.println(str);
		
		String str22 = new String("Superman");
		System.out.println(str22);
		
		System.out.print("참조 주소는 ");
		if(str == str22) { // 참조 주소
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		System.out.print("값은 ");
		if(str.equals(str22)) { // 값
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
