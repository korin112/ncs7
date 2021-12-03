import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
//		int[] ar;	// 배열 만드는 법
//		int ar[];	// 정수밖에 못찍음 자바스크립트에서는 문자열이랑 다 찍을 수 있었음
		
		int[] ar = {3,14,5,31,23,-1};
		int ar1[]= {3,14,5,31,23,-1}; // datatype[].var={}; 해야됨
		String ars[]= {"Hello","World","Le Monde","NY Times"};
		System.out.println(ars[0]);	// "Hello"
		System.out.println(ars[1]); // "World"
//		int[] ar2=null;
//		ar2=new int[] {3,14,5,31,23,-1};
//		이렇게도 쓸 수 있음
//		int[] ar4=new int[] {3,14,5,31,23,-1};
		int[] ar3=new int[7];
		ar3[0]=3;
		ar3[1]=14; 
		//배열의 길이를 잡아주고 각각 넣는법
		
		System.out.println(ar1.length);
		
		//자바의 배열은 길이고정, 데이터 타입 고정.
	}

}
