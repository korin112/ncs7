import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { 	//메뉴라는 개체 안에 메뉴라는 가격
	//멤버 선언	almenu 선언해야함 ArrayList almenu; 
	private ArrayList<String> alMenu;	// 실행문 붙이지 마셈 
	private ArrayList<Integer> alPrice;
	
	public String getAlMenu(int ndx) {
		return this.alMenu.get(ndx);
	}
	public int getAlPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	
	
	// alMenu, alPrice 두개의 필드
	//생성자 정의
	
	public Menu() {
	this.alMenu=new ArrayList<String>();
	this.alPrice=new ArrayList<Integer>();
	File f = new File("C:\\Temp\\menu.txt");	// 쓸때만 열어라 안쓰면 닫아라
	try {
		FileReader fr = new FileReader(f);	//지역변수여서 public 선언 x
		BufferedReader br = new BufferedReader(fr);
		try {
			String line=br.readLine();
			while(line!=null) {
				String[]ar=line.split(",");
				this.alMenu.add(ar[0]);
				this.alPrice.add(Integer.parseInt(ar[1]));
				line=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}
	
	
	public void display() {
		for(int i=0; i<this.alMenu.size(); i++) {
			System.out.println((i+1)+"."+this.alMenu.get(i)+" "+this.alPrice.get(i));
		}
//		this.guide();	//다른 메소드에서 메소드 호출할 때 씀.
	}
	
	private void guide() {
		System.out.println("메뉴관리(X:종료, C:새로추가, U:메뉴수정, D:메뉴삭제");	
	}
	
	private void add(String menu, int price) {
		this.alMenu.add(menu);
		this.alPrice.add(price);
		this.saveMenu();
		//menu.txt에 쓰기
	}
	
	private void update(int menu_num, String menu, int price) {
		this.alMenu.set(menu_num-1,menu);
		this.alPrice.set(menu_num-1,price);
		this.saveMenu();
		//menu.txt에 쓰기
	}
	
	private void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
		this.saveMenu();
		//menu.txt에 쓰기
	}
	
	private void saveMenu() {
		File f = new File("C:\\Temp\\menu.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			for(int i=0; i<this.alMenu.size(); i++) {
				pw.print(this.alMenu.get(i)+","+this.alPrice.get(i)+"\n");
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Handling() {
		this.display();
		this.guide();
		Scanner s=new Scanner(System.in);
		String a1=s.nextLine();
			while(a1.equals("X")==false) {
				if(a1.equals("C")) {
					System.out.println("메뉴추가");
						Scanner ms=new Scanner(System.in);
					System.out.println("새로운 메뉴명을 입력하세요");
						String menuname=ms.nextLine();
					System.out.println("새로운 가격을 입력하세요");
						int price=Integer.parseInt(ms.nextLine());
					this.add(menuname,price);
				} else if(a1.equals("U")) {
					System.out.println("메뉴수정");
						Scanner ms=new Scanner(System.in);
					System.out.println("수정할 메뉴번호를 입력하세요");
						int menunum=Integer.parseInt(ms.nextLine());
					System.out.println("새 메뉴명을 입력하세요");
						String newMenu=ms.nextLine();
					System.out.println("새 가격을 입력하세요");
						int newPrice=Integer.parseInt(ms.nextLine());
					this.update(menunum,newMenu,newPrice);
				} else if(a1.equals("D")) {
					System.out.println("메뉴삭제");
						Scanner ms=new Scanner(System.in);
					System.out.println("삭제할 메뉴번호를 입력하세요");
						int n=Integer.parseInt(ms.nextLine());
					this.remove(n);
				}
			this.display();
			this.guide();
			a1=s.nextLine();
			} 
	}
}

	
//		this.sum1(new int[] {2000,3000,2500,4000});		//배열로 선언해야 됨
//		this.sum1(new int[] {2000,1500,3000,5460,2500,4000});
//	return; // 메소드 종료, 아래 코드는 실행 X
//	return n; // n을 반환, 메소드 종료, 아래 코드 실행X
	
//	int sum1(int[] values) {		// 매개변수의 수를 모를때. 쭉 나열하면 됨
//		int total=0;
//		for(int i=0; i<values.length; i++) {
//			total+=values[i];
//		}
//	return total;
//	}
//	int sum2(int...values) {
//		int total=0;
//		for(int i=0; i<values.length; i++) {
//			total+=values[i];
//	}
//		return total;
//	}




