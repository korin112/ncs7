//��Ǫ��(����/����)
public class Car {	// �������� Ʋ
	//Ŭ������ ���(�ʵ�)
	String company; //������ü
	String model; //�𵨸� 
	String color; // ����
	int maxSpeed; //�ְ�ӵ�
	int speed; //  ����ӵ�
	
	
	//������(Constructor)
	//�ʵ尪�� �ʱ�ȭ�� ��, �ʱ�ȭ�۾��� �����Ҷ� �����ڸ� ��
	// Ŭ������� ������ ��ȯ���� ���� Ÿ���� �޼ҵ�.
	//�ڵ�����=�����(���������) ȣ������ ����. <- new ������ ȣ��ɶ�
	//ȣ��ǰ� �ʱⰪ�� ����
	Car(){ //�⺻������ (default constructor) �� �и� �־�� �Ϲݻ����ڵ� ���� �� ����. �⺻�����ڸ� ���� ���� ����
			// �� �⺻�����ڸ� ����� �Ϲݻ����ڸ� ���� �� ����.
		this.company="KIA"; 	 
		this.model="Sportage";
		this.color="White";
		this.maxSpeed=260;
		this.speed=0;
	} 		//12
	//������ �����ε�(Constructor overloading) <- �������� ����
	Car(String sCompany,String sModel,String sColor,
		int nMaxSpeed,int nSpeed){
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	// String model, String color : �Ű�����(parameter), ��������
	Car(String model, String color){
		this("KIA",model,color,240,0);	// method�� ȣ���Ҷ� this�� ����ؼ� �ϸ� ��
		//�ϳ��ǻ����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� this�� ����ϸ� �� �����ڰ� �����ڸ� ȣ���� ��
		//calling other constructor in the constructor // not method
	}
	void drive(int speed) {
		this.speed=speed; 	// car.speed
	}
	
	
	
}
