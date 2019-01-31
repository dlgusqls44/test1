package polymorphism;
//abstract 는 인스턴스 생성을 하지 못한다. 상속해서 사용하기 위해서 사용
//상속 관계를 만들기 위한 클래스 임으로 객체 생성을 못하도록 abstract class로 만듬
public interface Starcraft {
	//오버라이딩을 위해서 메소드 추가
	//다형성 구현을 위해서 생성 : 실제로 사용은 하지않음.
	//Overriding 구현을 위해서 동일한 이름 attack 메소드 생성
	//이런 메소드는 내용이 있을 필요가 없습니다.
	//메소드 결과형 앞에 abstract를 추가하면 됩니다.
	//이 메소드는 abstract class 나 interface에만 존재해야 합니다.
	//상속받은 곳에서 반드시 오버라이딩 해야 합니다.
	
	//인터페이스 안에서는 abstract 가 없어도 추상 메소드입니다.
	public abstract void attack();

		//추상 메소드 
		//하위 클래스에서 반드시 overriding
		//하위 클래스에서 반드시 사용해야한다?
		//추상 메소드는 추상 클래스와 인터페이스에만 존재
		//내용 없음
}