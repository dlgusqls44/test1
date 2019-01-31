
public class Derived extends Base {

	//생성자
	public Derived() {
		//상위 클래스의 매개변수가 정수 1개인 생성자를 호출
		super(10); //new Base(int)를 호출
		
	}
	
	int a = 10;
	public void display() {
		System.out.println("하위 클래스의 메소드");
		int a = 20;
		//아무것도 붙지 않았으므로 메소드 안에서부터 찾음
		System.out.println("a:" + a);//20
		//this. 이 붙으면 메소드 안에서는 찾지 않는다.
		System.out.println("this.a:" + this.a);//10
		//super. 이 붙으면 상위 클래스에서만 찾는다.
		System.out.println("super.a:" + super.a);
	}
}
