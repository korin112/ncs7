
public class Tire {
	int maxRotation;  // �ִ�ȸ��Ƚ��
	int pastRotation; // ����ȸ��Ƚ��
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
			System.out.println(location +"Ÿ�̾� ����: "+(maxRotation-pastRotation)+"ȸ" );
			return true;
		} else {
			System.out.println(this.location +"Ÿ�̾� ��ũ ***");
			return false;
		}
	}
	
	
	
	
}
