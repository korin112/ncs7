
public class Car {
	Tire[] tires= {	new Tire(6,"앞왼쪽"),// tire인스턴스만 들어갈 수 있는 배열
			new Tire(2,"앞오른쪽"),
			new Tire(3,"뒤왼쪽"),
			new Tire(4,"뒤오른쪽")
	};	
	public Car() {	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0; i<tires.length; i++) {
			if (!tires[i].roll()) {stop(); return i+1;}
		}
		return 0;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	/*private*/ String company;	// parent 클래스에서만 사용 됨. child 클래스들에서는 적용 x
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
	
	

