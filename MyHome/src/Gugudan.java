import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int i=0,j=1;
		Scanner s=new Scanner(System.in);
		Scanner si=new Scanner(System.in);
//		i = s.nextInt(); 단수 입력하기 
		i=Integer.parseInt(s.nextLine()); // 문자열을 정수로 읽어낸거
		int n=si.nextInt(); // 숫자읽어낸거
		
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
