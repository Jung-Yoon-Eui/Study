package SalProgram;

import java.util.Scanner;

public class User {	// 사용자 모드
	
	Scanner sc = new Scanner(System.in);
	
	private String emp = "00000";	// 사번 기본값

	
//	메소드
	
//	코드 확인
	public boolean check(){
		
		System.out.println("사번을 입력하세요.");
		
		if(this.emp.equals(sc.next())){	// 입력한 값이 사번일 때
			return true;
		}else{
			System.out.println("등록되지 않은 정보입니다.");
			return false;
		}
	}

//	정보 조회
	public void search(Main[] main) {

		int i;

		go: while(true) {

			System.out.println("사번을 입력하세요.");
			String a = sc.next();

			for (i = 0; i < main.length; i++) {

				if (main[i].getEmp().equals(a)) { // 입력 받은 사번이 main에 저장된 사번과 같을 때

					System.out.println("사번\t이름\t부서\t직급\t계약 형태\t인센티브\t급여");

					System.out.print(main[i].getEmp() + "\t"); // 사번
					System.out.print(main[i].getName() + "\t"); // 이름
					System.out.print(main[i].getDeptN() + "\t"); // 부서 명
					System.out.print(main[i].getRankN() + "\t"); // 부서 명
					System.out.print(main[i].getContN() + "\t"); // 계약 형태
					System.out.print(main[i].getIncen() + "\t"); // 인센티브
					System.out.println(main[i].getSal() + "\t"); // 급여

				}

				if (main[i].getEmp().equals(a)) {
					System.out.println("계속 조회하시겠습니까? [y/n]");

					String b = sc.next();

					if (b.equals("y") || b.equals("Y")) {
						i = 0;
						continue go;
					} else {
						System.out.println("입력을 종료합니다.");
						break go;
					}
				}
			}
		}
	}
}
