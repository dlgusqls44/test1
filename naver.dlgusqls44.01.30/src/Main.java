
public class Main {

	public static void main(String[] args) {
		//상위 클래스의 인스턴스 생성 - Base

		Base b = new Base(20);
		b.print();
		//하위 클래스의 인스턴스 생성 - Derived
		//자신의 public 메소드와 Base의 public 메소드 사용 가능
		//하위 클래스의 인스턴스를 생성하면
		//상위 클래스의 생성자를 호출해서 상위 클래스의 인스턴스 부분을 만들고 
		//하위 클래스의 생성자를 호출해서 하위 클래스의 인스턴스 부분을 생성합니다.
		Derived ad = new Derived();
		ad.print();
		ad.display();
	}

}
