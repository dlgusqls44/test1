package polymorphism;

public class Main {

	public static void main(String[] args) {
		//Starcraft 인스턴스 변수 생성
		//abstract(추상) -> 인스턴스 생성 못함 
		//밑줄이 오류난 이유는 인스턴스를 생성하려 했기 때문에 new Starcraft() <- 문장오류
		//Starcraft s = new Starcraft();
		//저그의 공격
		Starcraft star = new Zerg();
		star.attack();
		
		//테란의 공격
		star = new Terran();
		star.attack();
		
		//프로토스의 공격
		star = new Protoss(); 
		star.attack();
		
		//Starcraft가 일반 클래스라면 인스턴스 생성이 가능
		//Starcraft는 상속관계를 만들기 위한 클래스이지 실제 사용할 
		//class가 아닙니다. - 인스턴스 생성을 못하도록 해야 합니다.
		//class 앞에 abstract를 추가하면 됩니다.
		//star = new Starcraft();
		
		final int a = 10;
		//final 변수는 수정 못함
		System.out.println(a);

	}

}
