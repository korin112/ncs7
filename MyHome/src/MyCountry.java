import java.util.Scanner;

public class MyCountry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	// ���ڿ� ���� �غ� ��
		String s1=s.nextLine();				 // ���ڿ� ���� ������ ���� s1�� ����
		if(s1.equals("Korea")==true){ 	// true ��� ��
			System.out.println("Republic of Korea");
		} else {
			System.out.println("Other Country");
		}
	}

}
// Scanner�̿� ���ڿ��� �о�鿩�� �� ���ڿ��� Korea�� Republic of Korea�� ���
// �׷��� ������ Other Country ���