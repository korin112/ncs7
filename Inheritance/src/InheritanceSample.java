
public class InheritanceSample {

	public static void main(String[] args) {
	Car car = new Car();
	for(int i=0; i<5; i++) {
		int punk=car.run();
		switch(punk) {
		case 1:	// 앞왼
			System.out.println("앞 왼쪽 한국타이어로 교체");
			car.tires[punk-1]=new HankookTire(15,"앞왼쪽");
			break;
		case 2:	// 앞오
			System.out.println("앞 오른쪽 금호타이어로 교체");
			car.tires[punk-1]=new KumhoTire(13,"앞오른쪽");
			break;
		case 3:	// 뒤왼
			System.out.println("뒤 왼쪽 한국타이어로 교체");
			car.tires[punk-1]=new HankookTire(14,"뒤왼쪽");
			break;
		case 4:	// 뒤오
			System.out.println("뒤 오른쪽 금호타이어로 교체");
			car.tires[punk-1]=new KumhoTire(17,"뒤오른쪽");
			break;
		}
		System.out.println("---------------------------");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Limousine alpha = new Limousine();
//		Limousine beta = (Limousine)new Car(); //자식클래스를 부모클래스로 만들 수 없음 강제형변환까지는 필요 없음.
//		Car avante = new Limousine(); // 부모클래스의 인스턴스륾 만들고 자식클래스를 두면 가능.
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
