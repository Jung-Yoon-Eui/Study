package SalProgram;

import java.util.Scanner;

public class Screen {	// 사용자 화면

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Manager ma = new Manager();	// 관리자 모드
		User user  = new User();	// 사용자 모드

		Main[] main = new Main[500];	// 최대 등록 가능 인원 수 500.. 메모리 낭비...

		while(true){

			System.out.println("1. 관리자 모드 | 2. 사용자 모드 | 3. 종료");

			int a = sc.nextInt();

			if(a == 1){
				System.out.println("관리자 코드를 입력해주세요.");

				if(ma.check()){


					while(true){

						System.out.println("1. 사원 정보 등록 | 2. 사원 정보 조회 | 3. 종료");

						int b = sc.nextInt();

						if(b == 1){

							ma.add(main);

						}else if(b == 2){

							ma.search(main);

						}else if(b == 3){

							System.out.println("관리자 모드를 종료합니다.");
							break;

						}else{
							System.out.println("잘못된 요청입니다.");
						}
					}

				}else{
					System.out.println("잘못된 요청입니다.");
					continue;
				}

			}else if(a == 2){

				if(user.check()){

					System.out.println("사원 번호를 입력해주세요.");

					if(user.check()){
						user.search(main);
					}
				}

			}else{
				System.out.println("System을 종료합니다.");
				break;
			}
		}
	}
}
