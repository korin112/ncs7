
public class Tire {
	int maxRotation;  // 최대회전횟수
	int pastRotation; // 누적회전횟수
	String location;
	
	public Tire() {
		
	}

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println(location +"타이어 수명: "+(maxRotation-pastRotation)+"회" );
			return true;
		} else {
			System.out.println(this.location +"타이어 펑크 ***");
			return false;
		}
	}
}
