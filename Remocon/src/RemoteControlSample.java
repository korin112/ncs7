
public class RemoteControlSample {

	public static void main(String[] args) {
//		RemoteControl  tv = new Television(); Television처럼 한번 쓸 구현 클래스를 그냥 익명구현클래스로 집어넣음.
		RemoteControl tv = new RemoteControl() {
			private int volume;			// 익명 구현 클래스
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			public void turnOff() {
				System.out.println("TV를 끕니다.");	
			}
			public void setVolume(int v) {
				if(v>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(v<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=v;
				}
				System.out.println("현재 TV볼룸 : "+this.volume);
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
		
		RemoteControl.changeBattery();	// interface static 변수를 불러올때는 interface 이름을 써줘야함
		
		RemoteControl audio = new RemoteControl() {
			private int volume;
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			public void turnOff() {
				System.out.println("오디오를 끕니다.");	
			}
			public void setVolume(int v) {
				if(v>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				} else if(v<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				} else {
					this.volume=v;
				}
				System.out.println("현재 오디오볼룸 : "+this.volume);
			}
		};						// 자식클래스는 부모클래스로 자동형변환이 됨. 그래서  Audio클래스의 Audio가 아닌 부모클래스의
								// RemoteControl audio가 가능하다는 것. 형변환하게되면 유실될 수 있는 문제가 있긴 함.
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}
}
							// 부모클래스명 변수(instance) = new 자식클래스명();
							// 추상클래스명 변수(instance) = new 자식클래스명();
							// 인터페이스명 변수(instance) = new 구현클래스명(); 가능
		
	//  익명 구현클래스 -> new 인터페이스명(){	 	단점 = 메인에 넣어야 함
//		메소드 구현
//		}
		
		//유명 구현클래스 -> class 클래스명 implements 인터페이스명 {
		//메소드 구현



