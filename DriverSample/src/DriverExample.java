
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vh = new Vehicle();
		driver.drive(bus);	// 자동형변환이 일어나기 때문 ( 자식->부모)
		driver.drive(taxi); // 자동형변환이 일어나기 때문 ( 자식->부모)
		
		if(bus instanceof Bus) {
			System.out.println("bus instanceof Bus.");
		} else {
			System.out.println("bus NOT instanceof Bus.");
		}
		if(bus instanceof Vehicle) {
			System.out.println("bus instanceof Vehicle.");
		} else {
			System.out.println("bus NOT instanceof Vehicle.");
		}
		if(vh instanceof Bus) {
			System.out.println("vh instanceof Bus.");
		} else {
			System.out.println("vh NOT instanceof Bus.");
		}
	}

}
