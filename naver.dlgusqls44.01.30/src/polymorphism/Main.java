package polymorphism;

public class Main {

	public static void main(String[] args) {
		//Starcraft �ν��Ͻ� ���� ����
		//abstract(�߻�) -> �ν��Ͻ� ���� ���� 
		//������ ������ ������ �ν��Ͻ��� �����Ϸ� �߱� ������ new Starcraft() <- �������
		//Starcraft s = new Starcraft();
		//������ ����
		Starcraft star = new Zerg();
		star.attack();
		
		//�׶��� ����
		star = new Terran();
		star.attack();
		
		//�����佺�� ����
		star = new Protoss(); 
		star.attack();
		
		//Starcraft�� �Ϲ� Ŭ������� �ν��Ͻ� ������ ����
		//Starcraft�� ��Ӱ��踦 ����� ���� Ŭ�������� ���� ����� 
		//class�� �ƴմϴ�. - �ν��Ͻ� ������ ���ϵ��� �ؾ� �մϴ�.
		//class �տ� abstract�� �߰��ϸ� �˴ϴ�.
		//star = new Starcraft();
		
		final int a = 10;
		//final ������ ���� ����
		System.out.println(a);

	}

}
