
public interface RemoteControl {
//�������̽� Ư¡
	//�ʵ尡 ����.(������ ����.) ����� ���� ����.*********
	//�����ڰ� ����.
	//�޼ҵ常 �ִ�.(�߻�޼ҵ�/����Ʈ�޼ҵ�/�����޼ҵ�)
	
	static final double pi=3.14159;	//����ʵ常�鶧�� ���� �� �� public static final
	int MAX_VOLUME=10; // ��ǻ� ����.
	int MIN_VOLUME=0;
	
	
	void turnOn(); // ��ü���� �޼ҵ常 �ִ°� �߻�޼ҵ�
	void turnOff();
	void setVolume(int volume);
	
	
	//default method - �Ϲ�Ŭ������ �Ϲ� �޼ҵ�. default ����ߵ�~
	default void setMute(boolean mute) {	
		if(mute) {
			System.out.println("����ó���մϴ�");
		} else {
			System.out.println("���������մϴ�.");
		}
	}
	
	static void changeBattery() {	// instance�� ���� ȣ��Ǵ� static(�����޼ҵ�)
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	//  interface���� ���������� ����
}
