package JavaArray;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		int[] arr2 = {5,6,7,8};


		System.out.println("�ʱ� ��");

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
		System.out.println("arr2 = arr ���� \n���� �ּҰ� �ٲ�");

		arr2 = arr;	// arr2�� arr�� �ּҸ� �����ϱ�� �ٲ�.

		for(int i:arr2) {
			System.out.print(i + " ");
		}

		System.out.println("\n"+ arr2.toString());
		System.out.println(arr.toString());
*/


		//	���� �ּҸ� �ٲٴ� �� ���� ���� �����Ϸ���....
		System.out.println("����!");
		//1.
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		//2. array copy API
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		//	 ( �����ų �迭, ������ ���� ��ġ, ���� ���� �迭, ���� ���� ���� ��ġ, ������ �迭�� ��� �� )

		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// arr[0] ���� �� ���
		arr2[0] = 300;
		
		for(int i:arr2) {
			System.out.print(i + " ");
		}

		// ���� �ּ� �������� ���� ����� ���� Ȯ�� �� �� ����.
		System.out.println("\n"+ arr2.toString());
		System.out.println(arr.toString());

	}
}
