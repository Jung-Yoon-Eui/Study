package SalProgram;

public class Main {	// 메인 동작 program

	private Name name;			// 이름
	private Dept dept;			// 부서 코드
	private Rank rank;			// 직급 코드
	private Cont cont;			// 계약 형태 코드
	private Incentive incen;	// 인센티브
	
	private String deptN;		// 부서 이름
	private String rankN;		// 직급 이름
	private String contN;		// 계약 형태 이름
	
	private long sal;			// 급여
	private String emp;			// 사번
	private int num;			// 등록 순서
	
	
	public Main() {
		name	= new Name();
		dept	= new Dept();
		rank	= new Rank();
		cont	= new Cont();
		incen	= new Incentive();
		
		String deptN = "noDept";
		String rankN = "noRank";
		String contN = "noCont";
		
		long 	sal = 0L;
		String 	emp = "000000";
		int 	num = 0;
	}

//	이름
	public String getName() {
		return name.getName();
	}

	public void setName(String name) {
		this.name.setName(name);
	}

//	부서 코드
	public byte getDept() {
		return dept.getDept();
	}

	public void setDept(byte dept) {
		this.dept.setDept(dept);
	}

//	직급 코드
	public byte getRank() {
		return rank.getRank();
	}

	public void setRank(byte rank) {
		this.rank.setRank(rank);
	}

//	계약 형태 코드
	public byte getCont() {
		return cont.getCont();
	}

	public void setCont(byte cont) {
		this.cont.setCont(cont);
	}

//	인센티브
	public long getIncen() {
		return incen.getIncen();
	}

	public void setIncen(long incen) {
		this.incen.setIncen(incen);
	}


//	부서 이름
	public String getDeptN() {
		
		switch (dept.getDept()){
			case 10: deptN = "영업";	break;
			case 20: deptN = "개발";	break;
			case 30: deptN = "품질";	break;
		default : deptN = "x";
		}
		 return deptN;
	}

	
//	직급
	public String getRankN() {
		
		switch (rank.getRank()){
			case 1: rankN = "사원";	break;
			case 2: rankN = "대리";	break;
			case 3: rankN = "과장";	break;
			case 4: rankN = "차장";	break;
			case 5: rankN = "부장";	break;
		default : rankN = "x";
		}
		 return rankN;
	}

//	계약 형태
	public String getContN() {
		
		switch (cont.getCont()){
			case 1: contN = "정규직";	break;
			case 2: contN = "비정규직";	break;
		default : contN = "x"; 
		}
		 return contN;
	}

//	급여
	public long getSal() {
		long sum = 2000000;
		
		switch (this.dept.getDept()){
			case 10: sum = 300000;	break;	// 영업
			case 20: sum = 500000;	break;	// 개발
			case 30: sum = 0; 		break;	// 품질
		}
		switch (this.rank.getRank()){
			case 5: sum += 300000;			// 부장
			case 4: sum += 300000;			// 차장
			case 3: sum += 300000;			// 과장
			case 2: sum += 300000;			// 대리
			case 1: sum += 0	 ;	break;	// 사원
		}
		switch (this.cont.getCont()){
			case 1: sum += 500000; 	break;	// 정규직
			case 2: sum += 0; 		break;	// 비정규직
		}
		
		return sum = 2000000 + this.incen.getIncen();// 기본급  + 조건에 따른 추가급 + 인센티브
	}


//	등록 순서
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
//	사원 번호
		
	public String getEmp() {
		return ""+dept.getDept()+rank.getRank()+cont.getCont()+num;
	}
}

