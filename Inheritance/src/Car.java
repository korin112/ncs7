
public class Car {
	Tire[] tires= {	new Tire(6,"�տ���"),// tire�ν��Ͻ��� �� �� �ִ� �迭
			new Tire(2,"�տ�����"),
			new Tire(3,"�ڿ���"),
			new Tire(4,"�ڿ�����")
	};	
	public Car() {	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		for(int i=0; i<tires.length; i++) {
			if (!tires[i].roll()) {stop(); return i+1;}
		}
		return 0;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	/*private*/ String company;	// parent Ŭ���������� ��� ��. child Ŭ�����鿡���� ���� x
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;
//	
//	public Car() {
//		this.color="green";
//	}
//	
//	public Car(String company, String model, String color, int nMaxSpeed, int nSpeed) {
//		super();
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.nMaxSpeed = nMaxSpeed;
//		this.nSpeed = nSpeed;
//	}
//	
//	void drive(int speed) {
//		this.nSpeed=speed;
//		
//	}
//	
//	void stop() {
//		this.nSpeed=0;
//	}
	
	

