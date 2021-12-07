
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("홍길동") 추상클래스는 상속하고있는 자식클래스만이 new 연산자를 만들 수 있음.
		// 추상클래스로는 new연산자를 이용해서 인스턴스 변수를 생성할 수 없다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
		
		CellPhone cellPhone = new CellPhone("홍길순");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
		
	}

}
