import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	//모바일(mobile),메뉴명(name),수량(qty),총액(sum)	필드 선언
	//초기화 빈 arraylist 
	//주문추가(add) 메뉴명, 수량 - 총액은 자동계산되게
	//주문삭제(remove) 주문번호만 받아서 삭제
	//주문수정(update) 주문번호,메뉴명,수량 - 총액 자동계산되게
	//주문표시(display) 전체주문목록 출력.
	
	private ArrayList<String> mobile;
	private ArrayList<String> orderMenu;	 
	private ArrayList<Integer> orderQty;
	private ArrayList<Integer> sum;
	private int sum1;
	public Order(){
		this.orderMenu=new ArrayList<String>();
		this.mobile=new ArrayList<String>();
		this.orderQty=new ArrayList<Integer>();
		this.sum=new ArrayList<Integer>();
	}
		
	private void add(String orderMenu, int orderQty,int sum) {
		this.orderMenu.add(orderMenu);
		this.orderQty.add(orderQty);
		this.sum.add(sum);
	}
	private void mobile(String mobile) {
		this.mobile.add(mobile);
	}
	private void remove(int order_num) {
		this.orderMenu.remove(order_num-1);
		this.orderQty.remove(order_num-1);
		this.sum.remove(order_num-1);
	}
	
	private void update(Menu menu,int orderMenu_num, int orderMenu, int orderQty) {
		this.orderMenu.set(orderMenu_num-1,menu.getAlMenu(orderMenu-1));
		this.orderQty.set(orderMenu_num-1,orderQty);
		
	}

	public void display() {
		sum1=0;
		for(int i=0; i<this.orderMenu.size(); i++) {
			System.out.println((i+1)+"."+this.orderMenu.get(i)+" "+this.orderQty.get(i)+"EA"+" 총 "+this.sum.get(i)+"원");
			sum1+=sum.get(i);
			}System.out.println("총액 :"+sum1+"원");
	}
	
	private void guide() {
		System.out.println("주문관리(X:종료, C:주문추가, R:주문표시, U:주문수정, D:주문삭제");	
	}
	
	public void Handling(Menu menu) { // 파라미터로 클래스 instance 전달 가능!!!!!!
		menu.display();
		this.guide();
		Scanner s=new Scanner(System.in);
		String o1=s.nextLine();
			while(o1.equals("X")==false) {
				if(o1.equals("C")) {
					System.out.println("주문추가");
						Scanner os=new Scanner(System.in);
					System.out.println("주문하실 메뉴번호를 입력하세요");
						int orderMenu=Integer.parseInt(os.nextLine());
						String ordername=menu.getAlMenu(orderMenu-1);
						int orderprice=menu.getAlPrice(orderMenu-1);
					System.out.println("선택한 수량을 입력하세요");
						int orderQty=Integer.parseInt(os.nextLine());
						int sum=orderprice*orderQty;
					this.add(ordername,orderQty,sum);
					System.out.println(ordername+" "+orderQty+"EA"+" 총액 : "+sum);
				}  else if(o1.equals("U")) {
					System.out.println("주문수정");
						Scanner os=new Scanner(System.in);
					System.out.println("수정할 주문번호를 입력하세요");
						int orderMenu_num=Integer.parseInt(os.nextLine());
					System.out.println("새로운 주문번호를 입력하세요");
						int orderMenu=Integer.parseInt(os.nextLine());
					System.out.println("수량을 입력하세요");
						int orderQty=Integer.parseInt(os.nextLine());
					this.update(menu, orderMenu_num, orderMenu, orderQty);
					this.display();
				} else if(o1.equals("D")) {
					System.out.println("메뉴삭제");
						Scanner os=new Scanner(System.in);
					System.out.println("삭제할 메뉴번호를 입력하세요");
						int n=Integer.parseInt(os.nextLine());
					this.remove(n);
					this.display();
				}
			
			this.guide();
			o1=s.nextLine();
			}
/*void addMobile(){
 * Scanner s= new Scanner(System.in);}*/
			System.out.println("모바일 번호를 입력하시오.(없으면'-')");
			String mobile=s.nextLine();
			if(mobile.equals("")) mobile="-";
			int start_ndx=this.mobile.size();
			for(int i=this.mobile.size(); i<this.orderMenu.size(); i++) {
			 this.mobile.add(mobile);
				}
/*void */			
			int sum1=0;
			for(int i=start_ndx; i<this.orderMenu.size(); i++) {
				System.out.println("고객번호 : "+this.mobile.get(i)+", "+this.orderMenu.get(i)+" "+
								   this.orderQty.get(i)+"EA"+" "+"총액:"+this.sum.get(i));
				sum1+=this.sum.get(i);
			}
			System.out.println("총주문금액 :"+sum1);
			System.out.println("----------------------------");
			
	}
			
//			System.out.println("고객번호를 입력하세요.(없으면'-')");
//			Scanner o2=new Scanner(System.in);
//			String m1=o2.nextLine();
//			String mobile=m1;
//			System.out.println("고객번호 :"+m1);
//			this.display();
			
		
	//1. 메뉴표시
//	2. 주문할 메뉴번호를 입력하시오(X:주문완료)
//	3. 메뉴번호를 받는다.(X가 입력되면 8번으로)
//	4. 선택한 메뉴의 수량을 입력하시오.
//	5. 수량을 받는다.
//	6. 금액 자동계산, 표시(현재메뉴의 총액과 현재까지주문한 내역의 총액)
//	7. 1로 돌아간다
// 8.주문고객의 모바일번호를 입력하시오
// 9. 모바일번호를 받는다.("-": 없으면)
//10.주문한 내역 출력 (각 메뉴별 내역+최종총액)
	
	
	
	
	
}