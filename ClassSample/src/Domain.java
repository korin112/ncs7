
public class Domain {

	public static void main(String[] args) {
		Car car=new Car("KIA","Sorento","grey",240,0);	// car = �����̸鼭 ��ü ���⿡�� ������ �����߸� �޸𸮰� ���� car=�ν��Ͻ�(��ü/����)
		//car ��°� ���� ������ �ʵ尡 ������� ������ ���� ��ȣ�� ����������� �������
		System.out.println("������ü : "+car.company);
		System.out.println("�𵨸� : "+car.model);
		System.out.println("���� : "+car.color);
		System.out.println("�ְ�ӵ� : "+car.maxSpeed);
		System.out.println("����ӵ� : "+car.speed);
		
		car.drive(60);
		System.out.println("������ ���� �ӵ� : "+car.speed);
		
		System.out.println("--------------------------");
		
		Car seltos=new Car("KIA","Seltos","White",220,0);
		
		System.out.println("������ü : "+seltos.company);
		System.out.println("�𵨸� : "+seltos.model);
		System.out.println("���� : "+seltos.color);
		System.out.println("�ְ�ӵ� : "+seltos.maxSpeed);
		System.out.println("����ӵ� : "+seltos.speed);
		
		seltos.drive(80);
		System.out.println("����� ����ӵ� : "+seltos.speed);
		
	}

}
