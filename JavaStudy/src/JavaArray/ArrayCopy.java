package JavaArray;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		int[] arr2 = {5,6,7,8};


		System.out.println("초기 값");

		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i:arr2) {
			System.out.print(i + " ");
		}

		System.out.println("\n"+ arr2.toString());
		System.out.println(arr.toString());

		System.out.println("============");

/*
		System.out.println("arr2 = arr 적용 \n참조 주소가 바뀜");

		arr2 = arr;	// arr2가 arr의 주소를 참조하기로 바뀜.

		for(int i:arr2) {
			System.out.print(i + " ");
		}

		System.out.println("\n"+ arr2.toString());
		System.out.println(arr.toString());
*/


		//	참조 주소를 바꾸는 것 말고 값을 복사하려면....
		System.out.println("복사!");
		//1.
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		//2. array copy API
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		//	 ( 복사시킬 배열, 복사할 시작 위치, 복사 받을 배열, 복사 받을 시작 위치, 복사할 배열의 요소 수 )

		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// arr[0] 수정 후 출력
		arr2[0] = 300;
		
		for(int i:arr2) {
			System.out.print(i + " ");
		}

		// 참조 주소 변동없이 값이 변경된 것을 확인 할 수 있음.
		System.out.println("\n"+ arr2.toString());
		System.out.println(arr.toString());

	}
}
