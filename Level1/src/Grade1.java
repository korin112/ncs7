import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=90){ 
			if(n>=95){
				System.out.println("A+");
			} else {System.out.println("A-");}
		}
		else if(n>=80) {
			if(n>=85) {
				System.out.println("B+");
			} else {System.out.println("B-");}
		}
		else if(n>=70) {
			if(n>=75) {
				System.out.println("C+");
			} else {System.out.println("C-");}
		}
		else if(n>=60) {
			if(n>=65) {
				System.out.println("D+");
			} else {System.out.println("D-");}
		} 
		else {
			System.out.println("F");
		}
	}
}

