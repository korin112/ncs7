import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
//		int[] ar;	// �迭 ����� ��
//		int ar[];	// �����ۿ� ������ �ڹٽ�ũ��Ʈ������ ���ڿ��̶� �� ���� �� �־���
		
		int[] ar = {3,14,5,31,23,-1};
		int ar1[]= {3,14,5,31,23,-1}; // datatype[].var={}; �ؾߵ�
		String ars[]= {"Hello","World","Le Monde","NY Times"};
		System.out.println(ars[0]);	// "Hello"
		System.out.println(ars[1]); // "World"
//		int[] ar2=null;
//		ar2=new int[] {3,14,5,31,23,-1};
//		�̷��Ե� �� �� ����
//		int[] ar4=new int[] {3,14,5,31,23,-1};
		int[] ar3=new int[7];
		ar3[0]=3;
		ar3[1]=14; 
		//�迭�� ���̸� ����ְ� ���� �ִ¹�
		
		System.out.println(ar1.length);
		
		//�ڹ��� �迭�� ���̰���, ������ Ÿ�� ����.
	}

}
