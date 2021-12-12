//거푸집(원판/원형)
public class Car {	// 어디까지나 틀
	//클래스의 멤버(필드)
	String company; //제조업체
	String model; //모델명 
	String color; // 색상
	int maxSpeed; //최고속도
	int speed; //  현재속도
	
	
	//생성자(Constructor)
	//필드값을 초기화할 때, 초기화작업을 수행할때 생성자를 씀
	// 클래스명과 동일한 반환값이 없는 타입의 메소드.
	//자동실행=대놓고(명시적으로) 호출하지 않음. <- new 연산자 호출될때
	//호출되고 초기값을 잡음
	Car(){ //기본생성자 (default constructor) 가 분명 있어야 일반생성자도 만들 수 있음. 기본생성자만 있을 수는 있음
			// 빈 기본생성자를 만들고 일반생성자를 만들 수 있음.
		this.company="KIA"; 	 
		this.model="Sportage";
		this.color="White";
		this.maxSpeed=260;
		this.speed=0;
	} 		//12
	//생성자 오버로딩(Constructor overloading) <- 다형성의 일종
	Car(String sCompany,String sModel,String sColor,
		int nMaxSpeed,int nSpeed){
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	// String model, String color : 매개변수(parameter), 지역변수
	Car(String model, String color){
		this("KIA",model,color,240,0);	// method를 호출할때 this를 사용해서 하면 됨
		//하나의생성자에서 다른 생성자를 호출할때 this를 사용하면 됨 생성자가 생성자를 호출할 떄
		//calling other constructor in the constructor // not method
	}
	void drive(int speed) {
		this.speed=speed; 	// car.speed
	}
	
	
	
}
