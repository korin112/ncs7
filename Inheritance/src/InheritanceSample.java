
public class InheritanceSample {

	public static void main(String[] args) {
	Car car = new Car();
	for(int i=0; i<5; i++) {
		int punk=car.run();
		switch(punk) {
		case 1:	// �տ�
			System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
			car.tires[punk-1]=new HankookTire(15,"�տ���");
			break;
		case 2:	// �տ�
			System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
			car.tires[punk-1]=new KumhoTire(13,"�տ�����");
			break;
		case 3:	// �ڿ�
			System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
			car.tires[punk-1]=new HankookTire(14,"�ڿ���");
			break;
		case 4:	// �ڿ�
			System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
			car.tires[punk-1]=new KumhoTire(17,"�ڿ�����");
			break;
		}
		System.out.println("---------------------------");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Limousine alpha = new Limousine();
//		Limousine beta = (Limousine)new Car(); //�ڽ�Ŭ������ �θ�Ŭ������ ���� �� ���� ��������ȯ������ �ʿ� ����.
//		Car avante = new Limousine(); // �θ�Ŭ������ �ν��Ͻ��a ����� �ڽ�Ŭ������ �θ� ����.
//		Truck scania=new Truck();
//		
//		
//		scania.company="Volvo";
//		scania.color="brown";
//		scania.model="xxxxxx";
//		scania.nMaxSpeed=120;
//		
//		scania.drive(40);
//		System.out.println("current speed :"+scania.nSpeed);
//		scania.stop();
//		
//		Limousine alpha=new Limousine();
//		
//		alpha.company="Ford";
//		alpha.color="white";
//		alpha.model="Ford alpha one";
//		alpha.nMaxSpeed=220;
//		alpha.nSpeed=0;
//		alpha.drive(70);
//		alpha.stop();
//		
//		Car avante=new Car();
//		
//		avante.company="hyundai";
//		avante.color="black";
//		avante.model="Avante N";
//		avante.nMaxSpeed=220;
//		avante.nSpeed=0;
//		avante.drive(70);
//		avante.stop();
		
				
	}
	
}
