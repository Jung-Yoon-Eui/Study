package Team5_Task.Three;

public class Arr2 {

	public static void main(String[] args) {

		int[] count= new int[6];	// �ֻ����� ���� ����� ���� ������ ������ �迭 ����
		int[] dice = new int[10];	// �ֻ����� ���� ����� ������ �迭 ����
		
		for(int i=0; i<dice.length; i++){	
			
			dice[i] = (int)((Math.random()*6)+1); // �ֻ��� ������ ((0<=n<1)*�ֻ����� ���� �� )+1
			System.out.print(dice[i]+"\t");		  //		>> 1 <= n < 6
		} 
		
		for(int i=0; i<dice.length; i++){
			
			count[dice[i]-1]++;	//���� dice[0]�� 3�� ��, count[2]�� 1����
		}
			System.out.println();
			
		for(int i=0; i<count.length; i++){
			
			System.out.println(i+1+" : "+count[i]+"��");
		}
	}
}
