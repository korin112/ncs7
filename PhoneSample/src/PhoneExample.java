
public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone("ȫ�浿") �߻�Ŭ������ ����ϰ��ִ� �ڽ�Ŭ�������� new �����ڸ� ���� �� ����.
		// �߻�Ŭ�����δ� new�����ڸ� �̿��ؼ� �ν��Ͻ� ������ ������ �� ����.
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
		
		CellPhone cellPhone = new CellPhone("ȫ���");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
		
	}

}
