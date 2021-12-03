import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order Order=new Order();
		//menu.display();
		
		
		// "프로그램 시작" 출력.
		// while문이 도는거임 입력값이 "X"가 아닐 동안 아래를 반복
		// "M"을 입력하면 "메뉴관리" 출력.
		// "O"를 입력하면 "주문관리" 출력.
		// "S"를 입력하면 "실적관리" 출력.
		// "x"를 입력하면 "프로그램 종료" 출력하고 프로그램 종료.
		// 이도저도 아니면, 입력값 기다림 (껌뻑껌뻑)
		
		System.out.println("프로그램 시작");
		System.out.println("작업을 선택하시오 X:프로그램 종료, M:메뉴관리, O:주문관리, S:실적관리");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		while(a.equals("X")==false) {
			 
			if(a.equals("M")){
				menu.Handling();
			} else if(a.equals("O")) {
				Order.Handling(menu);
			} else if(a.equals("S")){
				Order.display();
			} 
			System.out.println("작업을 선택하시오 X:프로그램 종료, M:메뉴관리, O:주문관리, S:실적관리");
			
			a=s.nextLine();
		} System.out.println("프로그램 종료");
		

	}

}
