import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order Order=new Order();
		//menu.display();
		
		
		// "���α׷� ����" ���.
		// while���� ���°��� �Է°��� "X"�� �ƴ� ���� �Ʒ��� �ݺ�
		// "M"�� �Է��ϸ� "�޴�����" ���.
		// "O"�� �Է��ϸ� "�ֹ�����" ���.
		// "S"�� �Է��ϸ� "��������" ���.
		// "x"�� �Է��ϸ� "���α׷� ����" ����ϰ� ���α׷� ����.
		// �̵����� �ƴϸ�, �Է°� ��ٸ� (��������)
		
		System.out.println("���α׷� ����");
		System.out.println("�۾��� �����Ͻÿ� X:���α׷� ����, M:�޴�����, O:�ֹ�����, S:��������");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		while(a.equals("X")==false) {
			 
			if(a.equals("M")){
				menu.Handling();
			} else if(a.equals("O")) {
				Order.Handling(menu);
			} else if(a.equals("S")){
				Order.display();
			} 
			System.out.println("�۾��� �����Ͻÿ� X:���α׷� ����, M:�޴�����, O:�ֹ�����, S:��������");
			
			a=s.nextLine();
		} System.out.println("���α׷� ����");
		

	}

}
