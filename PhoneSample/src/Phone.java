
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	//추상클래스는 일반메소드도 가질 수 있따. 하지만 자식클래스에서 사용당하면 무시당함.
	public abstract void turnOn(); 	// 필요할 때 선언하자. 추상클래스가 아니면 추상메소드를 가질 수 없다.
	public abstract void turnOff();	// Override때문에, 왜 쓰지도 않는 클래스를 부모클래스에 만드느냐, 어차피 자식클래스에서 코딩하면 부모클래스는 무시될텐데
	// 그래서 부모클래스에 추상클래스, 추상메소드를 만듦.

	// abstract method와 Overriding은 깊은 관계가 있다.
	// 추상클래스를 쓰는 이유는 추상메소드를 선언하기위해서,
	// 오버라이딩을 부담없이 사용하기 위해서. ( 어차피 자식클래스에서 코드 무시당하니까)
	
	
	
	
}
