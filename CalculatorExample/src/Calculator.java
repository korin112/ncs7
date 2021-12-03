
public class Calculator {
 static double pi=3.14159;		// static 이라 선언되어있으면 클래스에서 instance안쓰고 바로 사용 가능
 // 안에서 전역변수로 사용 가능.		final 쓰면 변경불가. 변수가 아니라 상수가 되버림 // static은 instance 생성 없이 사용할 수 있는 전역변수
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
