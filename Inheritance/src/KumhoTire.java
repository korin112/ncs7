
public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);

	}
	@Override
	public boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println(location +"��ȣŸ�̾� ����: "+(maxRotation-pastRotation)+"ȸ" );
			return true;
		} else {
			System.out.println(this.location +"��ȣŸ�̾���ũ ***");
			return false;
		}
	}
}
