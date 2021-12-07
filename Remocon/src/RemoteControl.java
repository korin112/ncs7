
public interface RemoteControl {
//인터페이스 특징
	//필드가 없다.(변수가 없다.) 상수는 선언 가능.*********
	//생성자가 없다.
	//메소드만 있다.(추상메소드/디폴트메소드/정적메소드)
	
	static final double pi=3.14159;	//상수필드만들때는 세개 다 씀 public static final
	int MAX_VOLUME=10; // 사실상 변수.
	int MIN_VOLUME=0;
	
	
	void turnOn(); // 본체없이 메소드만 있는거 추상메소드
	void turnOff();
	void setVolume(int volume);
	
	
	//default method - 일반클래스의 일반 메소드. default 써줘야됨~
	default void setMute(boolean mute) {	
		if(mute) {
			System.out.println("무음처리합니다");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {	// instance가 없이 호출되는 static(정적메소드)
		System.out.println("건전지를 교환합니다.");
	}
	
	//  interface에는 접근제한자 ㄴㄴ
}
