
public class Battle {

	public static void main(String[] args) {
		Soldier commando=new Soldier(60,150);
		Warrior conan=new Warrior(65,120);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {
			
			try {
				// 0�� 1 ���� �ϳ��� �����߻���Ű�� �ڵ�
				if((int)(Math.random()*2) ==0) {
				commando.attack(conan);	//0�̸�
				Thread.sleep(300);
				}
				else if((int)(Math.random()*2) ==1){ 
				conan.attack(commando);	//1�̸�
				Thread.sleep(300);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("--------------------");
		} 
		if(commando.getHP()>0) {
			System.out.println("�ڸ����� �̰���ϴ�. (������ �¸�)");
		} else if(conan.getHP()>0) {
			System.out.println("�ڳ��� �̰���ϴ�. (������ �¸�)");
		} else {
			System.out.println("�� �� �׾����ϴ�");
		}
	}
}

