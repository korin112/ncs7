// Ŭ�������� ����(����)�� �����Ѵ�.

public class Car1 { // public�� ĸ��ȭ�� ��������.
	int nColor; // �Ӽ� -> �ʵ�(����)
	int nSpeed; // ����ӵ�
	int nMaxSpeed; // �ְ�ӵ�
	int nFuel; // �����ܷ�
	String nVendor; // ������
	String nModelName; // �𵨸�
	
	void drive(int iSpeed) {	// ���� -> �޼ҵ�(�Լ�)�� ����
		nSpeed=iSpeed;	
	}
	void stop() {
		nSpeed=0;
	}
	void refuel(int iFuel) {
		nFuel+=iFuel;
	}
	// �Ӽ��� ������ �����ϰ�, ������ �޼ҵ�� ǥ���Ѵ�.
}
