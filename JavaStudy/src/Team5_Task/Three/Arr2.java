package Team5_Task.Three;

public class Arr2 {

	public static void main(String[] args) {

		int[] count= new int[6];	// 주사위를 던진 결과에 따른 개수를 저장할 배열 선언
		int[] dice = new int[10];	// 주사위를 던진 결과를 저장할 배열 선언
		
		for(int i=0; i<dice.length; i++){	
			
			dice[i] = (int)((Math.random()*6)+1); // 주사위 굴리기 ((0<=n<1)*주사위의 눈금 수 )+1
			System.out.print(dice[i]+"\t");		  //		>> 1 <= n < 6
		} 
		
		for(int i=0; i<dice.length; i++){
			
			count[dice[i]-1]++;	//만약 dice[0]이 3일 때, count[2]가 1증가
		}
			System.out.println();
			
		for(int i=0; i<count.length; i++){
			
			System.out.println(i+1+" : "+count[i]+"개");
		}
	}
}
