package overriding;

public class Main {

	public static void main(String[] args) {
		//참조형 변수와 생성자의 자료형이 일치하도록 인스턴스 생성
		//인스턴스 생성은 new가 하는 것이고 변수는 그 인스턴스를 
		//참조할 수 있는 이름입니다.
		Base b1 = new Base();
		Derived d1 = new Derived();

		//상위 클래스 타입의 참조형 변수에 하위 클래스 타입의 인스턴스
		//참조를 대입할 수 있습니다.
		Base b2 = new Derived();
		//상위 클래스 타입의 인스턴스 참조를 형 변환없이
		//하위 클래스 타입의 변수에 대입하면 에러
		//강제 형 변환을 통해서 대입하면 에러는 아니지만 예외 발생
		//Derived d2 = (Derived)(new Base());
		
		//b2는 선언은 Base로 되어 있지만 원래 인스턴스는  Derived라서
		//강제 형 변환을 해서 대입해도 예외가 발생하지 않습니다.
		Derived d2 = (Derived)b2; 
		
		//일반적인 멤버는 변수의 자료형을 보고 찾아가지만
		//오버라이딩 된 메소드는 인스턴스를 만들 때 사용한 생성자의 자료형을
		//보고 찾아갑니다.
		
		Base base = new Base();
		//상위 클래스의 인스턴스가 대입되었으므로 Base의 method 호출
		base.method();
		
		base = new Derived();
		//하위 클래스의 인스턴스가 대입되었으므로 Derived의 method 호출
		base.method();
		//이렇게 base.method() 라는 동일한 코드가 대입된 객체에 따라 
		//다른 메소드를 호출하는 것을 polymorphism(다형성)이라고 한다.
	}

}
