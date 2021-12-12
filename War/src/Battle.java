
public class Battle {

	public static void main(String[] args) {
		Soldier commando=new Soldier(60,150);
		Warrior conan=new Warrior(65,120);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {
			//12
			try {
				// 0과 1 둘중 하나를 랜덤발생시키는 코드
				if((int)(Math.random()*2) ==0) {
				commando.attack(conan);	//0이면
				Thread.sleep(300);
				}
				else if((int)(Math.random()*2) ==1){ 
				conan.attack(commando);	//1이면
				Thread.sleep(300);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("--------------------");
		} 
		if(commando.getHP()>0) {
			System.out.println("코만도가 이겼습니다. (병사의 승리)");
		} else if(conan.getHP()>0) {
			System.out.println("코난이 이겼습니다. (전사의 승리)");
		} else {
			System.out.println("둘 다 죽었습니다");
		}
	}
}

