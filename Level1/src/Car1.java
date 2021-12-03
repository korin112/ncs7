// 클래스에는 선언(정의)만 존재한다.

public class Car1 { // public은 캡슐화와 관련있음.
	int nColor; // 속성 -> 필드(변수)
	int nSpeed; // 현재속도
	int nMaxSpeed; // 최고속도
	int nFuel; // 연료잔량
	String nVendor; // 제조사
	String nModelName; // 모델명
	
	void drive(int iSpeed) {	// 동작 -> 메소드(함수)로 정의
		nSpeed=iSpeed;	
	}
	void stop() {
		nSpeed=0;
	}
	void refuel(int iFuel) {
		nFuel+=iFuel;
	}
	// 속성은 변수에 저장하고, 동작은 메소드로 표현한다.
}
