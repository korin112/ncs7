import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { 	//�޴���� ��ü �ȿ� �޴���� ����
	//��� ����	almenu �����ؾ��� ArrayList almenu; 
	private ArrayList<String> alMenu;	// ���๮ ������ ���� 
	private ArrayList<Integer> alPrice;
	
	public String getAlMenu(int ndx) {
		return this.alMenu.get(ndx);
	}
	public int getAlPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	
	
	// alMenu, alPrice �ΰ��� �ʵ�
	//������ ����
	
	public Menu() {
	this.alMenu=new ArrayList<String>();
	this.alPrice=new ArrayList<Integer>();
	File f = new File("C:\\Temp\\menu.txt");	// ������ ����� �Ⱦ��� �ݾƶ�
	try {
		FileReader fr = new FileReader(f);	//������������ public ���� x
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
//		this.guide();	//�ٸ� �޼ҵ忡�� �޼ҵ� ȣ���� �� ��.
	}
	
	private void guide() {
		System.out.println("�޴�����(X:����, C:�����߰�, U:�޴�����, D:�޴�����");	
	}
	
	private void add(String menu, int price) {
		this.alMenu.add(menu);
		this.alPrice.add(price);
		this.saveMenu();
		//menu.txt�� ����
	}
	
	private void update(int menu_num, String menu, int price) {
		this.alMenu.set(menu_num-1,menu);
		this.alPrice.set(menu_num-1,price);
		this.saveMenu();
		//menu.txt�� ����
	}
	
	private void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
		this.saveMenu();
		//menu.txt�� ����
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
					System.out.println("�޴��߰�");
						Scanner ms=new Scanner(System.in);
					System.out.println("���ο� �޴����� �Է��ϼ���");
						String menuname=ms.nextLine();
					System.out.println("���ο� ������ �Է��ϼ���");
						int price=Integer.parseInt(ms.nextLine());
					this.add(menuname,price);
				} else if(a1.equals("U")) {
					System.out.println("�޴�����");
						Scanner ms=new Scanner(System.in);
					System.out.println("������ �޴���ȣ�� �Է��ϼ���");
						int menunum=Integer.parseInt(ms.nextLine());
					System.out.println("�� �޴����� �Է��ϼ���");
						String newMenu=ms.nextLine();
					System.out.println("�� ������ �Է��ϼ���");
						int newPrice=Integer.parseInt(ms.nextLine());
					this.update(menunum,newMenu,newPrice);
				} else if(a1.equals("D")) {
					System.out.println("�޴�����");
						Scanner ms=new Scanner(System.in);
					System.out.println("������ �޴���ȣ�� �Է��ϼ���");
						int n=Integer.parseInt(ms.nextLine());
					this.remove(n);
				}
			this.display();
			this.guide();
			a1=s.nextLine();
			} 
	}
}

	
//		this.sum1(new int[] {2000,3000,2500,4000});		//�迭�� �����ؾ� ��
//		this.sum1(new int[] {2000,1500,3000,5460,2500,4000});
//	return; // �޼ҵ� ����, �Ʒ� �ڵ�� ���� X
//	return n; // n�� ��ȯ, �޼ҵ� ����, �Ʒ� �ڵ� ����X
	
//	int sum1(int[] values) {		// �Ű������� ���� �𸦶�. �� �����ϸ� ��
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




