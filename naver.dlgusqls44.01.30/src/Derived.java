
public class Derived extends Base {

	//������
	public Derived() {
		//���� Ŭ������ �Ű������� ���� 1���� �����ڸ� ȣ��
		super(10); //new Base(int)�� ȣ��
		
	}
	
	int a = 10;
	public void display() {
		System.out.println("���� Ŭ������ �޼ҵ�");
		int a = 20;
		//�ƹ��͵� ���� �ʾ����Ƿ� �޼ҵ� �ȿ������� ã��
		System.out.println("a:" + a);//20
		//this. �� ������ �޼ҵ� �ȿ����� ã�� �ʴ´�.
		System.out.println("this.a:" + this.a);//10
		//super. �� ������ ���� Ŭ���������� ã�´�.
		System.out.println("super.a:" + super.a);
	}
}
