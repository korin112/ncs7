
public class Calculator {
 static double pi=3.14159;		// static �̶� ����Ǿ������� Ŭ�������� instance�Ⱦ��� �ٷ� ��� ����
 // �ȿ��� ���������� ��� ����.		final ���� ����Ұ�. ������ �ƴ϶� ����� �ǹ��� // static�� instance ���� ���� ����� �� �ִ� ��������
 static String company="LG";
 static String model="LCD";
 
 static String info;
 static {
	 info=company+"-"+model;
 }
 static int plus(int x,int y) {
	 return x+y;
 	}
 	static int minus(int x,int y) {
 		return x-y;
 	}
}
//12