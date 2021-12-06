
public class Truck extends Car {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//// 부모클래스로부터 상속받았기 때문에 필드선언을 해주지 않아도 됨.
//	public Truck() {	
//		super();	//super가 없으면 아래 color red값이 들어감 	부모클래스 호출
////		this.color="red";
//	}
//
//	public Truck(String company, String model, String color, int nMaxSpeed, int nSpeed) {
////		super(company, model, color, nMaxSpeed, nSpeed);
//		super(); // -> Car에서 넣어준 color 부모에서 만든 생성자를 직접 호출.
//		//this(); 라고 쓸 수도 있음. Truck();이 호출됨 Truck은 super()를 호출, super는 Car클래스의 color를 호출
//		this.company=company;
//		this.model=model;
//		this.nMaxSpeed=nMaxSpeed;
//		this.nSpeed=nSpeed;
//		// 파라미터가 다름 파라미터가 같은 부모클래스의 메소드가 실행
//	}
//	@Override //보통 이걸 붙여줌 컴파일 속도도 빨라짐. 
//	void drive(int speed) {	 
//		this.nSpeed=speed/2; // 자식클래스에서 새로 정의하면 부모에게서 상속받은걸 무시하고 자식클래스에서 정의한대로 호출. Overriding(무시) 이라 함
//		super.drive(speed); // 부모의 메소드 호출.
//	}
	
	
	
}
