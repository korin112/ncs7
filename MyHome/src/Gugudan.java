import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int i=0,j=1;
		Scanner s=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
//		i = s.nextInt(); �ܼ� �Է��ϱ� 
		i=Integer.parseInt(s.nextLine()); // ���ڿ��� ������ �о��
		int n=si.nextInt(); // �����о��
		
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
		System.out.println(i+"x"+j+"="+(i*j));
		j++;
	}
}
