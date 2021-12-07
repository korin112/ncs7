import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);	
	
	try {
		int n=10;
		int x=s.nextInt();
		System.out.println(n/x);
	} catch(Exception e) {
		System.out.println("오류 발생");
	}
	}
}

