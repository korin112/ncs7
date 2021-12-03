import java.util.Scanner;

public class MyCountry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	// 문자열 읽을 준비를 함
		String s1=s.nextLine();				 // 문자열 읽음 읽은걸 변수 s1에 넣음
		if(s1.equals("Korea")==true){ 	// true 없어도 됨
			System.out.println("Republic of Korea");
		} else {
			System.out.println("Other Country");
		}
	}

}
// Scanner이용 문자열을 읽어들여서 그 문자열이 Korea면 Republic of Korea를 출력
// 그렇지 않으면 Other Country 출력