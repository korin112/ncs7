
public class Domain {

	public static void main(String[] args) {
		Car car=new Car("KIA","Sorento","grey",240,0);	// car = 변수이면서 객체 여기에서 변수로 잡아줘야만 메모리가 잡힘 car=인스턴스(실체/실존)
		//car 라는걸 쓰는 동안은 필드가 살아있음 변수로 잡은 괄호를 벗어날때까지는 살아있음
		System.out.println("제조업체 : "+car.company);
		System.out.println("모델명 : "+car.model);
		System.out.println("색상 : "+car.color);
		System.out.println("최고속도 : "+car.maxSpeed);
		System.out.println("현재속도 : "+car.speed);
		
		car.drive(60);
		System.out.println("수정된 현재 속도 : "+car.speed);
		
		System.out.println("--------------------------");
		
		Car seltos=new Car("KIA","Seltos","White",220,0);
		//12
		System.out.println("제조업체 : "+seltos.company);
		System.out.println("모델명 : "+seltos.model);
		System.out.println("색상 : "+seltos.color);
		System.out.println("최고속도 : "+seltos.maxSpeed);
		System.out.println("현재속도 : "+seltos.speed);
		
		seltos.drive(80);
		System.out.println("변경된 현재속도 : "+seltos.speed);
		
	}

}
