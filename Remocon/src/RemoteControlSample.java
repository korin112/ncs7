
public class RemoteControlSample {

	public static void main(String[] args) {
//		RemoteControl  tv = new Television(); Televisionó�� �ѹ� �� ���� Ŭ������ �׳� �͸���Ŭ������ �������.
		RemoteControl tv = new RemoteControl() {
			private int volume;			// �͸� ���� Ŭ����
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");	
			}
			public void setVolume(int v) {
				if(v>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(v<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=v;
				}
				System.out.println("���� TV���� : "+this.volume);
			}
			@Override
			public void setMute(boolean b) {
				System.out.println("boolean "+b);
			}
		};
		
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBattery();	// interface static ������ �ҷ��ö��� interface �̸��� �������
		
		RemoteControl audio = new RemoteControl() {
			private int volume;
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("������� ���ϴ�.");	
			}
			public void setVolume(int v) {
				if(v>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(v<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=v;
				}
				System.out.println("���� ��������� : "+this.volume);
			}
		};						// �ڽ�Ŭ������ �θ�Ŭ������ �ڵ�����ȯ�� ��. �׷���  AudioŬ������ Audio�� �ƴ� �θ�Ŭ������
								// RemoteControl audio�� �����ϴٴ� ��. ����ȯ�ϰԵǸ� ���ǵ� �� �ִ� ������ �ֱ� ��.
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}
}
							// �θ�Ŭ������ ����(instance) = new �ڽ�Ŭ������();
							// �߻�Ŭ������ ����(instance) = new �ڽ�Ŭ������();
							// �������̽��� ����(instance) = new ����Ŭ������(); ����
		
	//  �͸� ����Ŭ���� -> new �������̽���(){	 	���� = ���ο� �־�� ��
//		�޼ҵ� ����
//		}
		
		//���� ����Ŭ���� -> class Ŭ������ implements �������̽��� {
		//�޼ҵ� ����



