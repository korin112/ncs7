import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=90) {
			System.out.println("A");
		} else if(n>=80){
			System.out.println("B");
		} else if(n>=70){
			System.out.println("C");
		} else if(n>=60){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
