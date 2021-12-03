import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	//�����(mobile),�޴���(name),����(qty),�Ѿ�(sum)	�ʵ� ����
	//�ʱ�ȭ �� arraylist 
	//�ֹ��߰�(add) �޴���, ���� - �Ѿ��� �ڵ����ǰ�
	//�ֹ�����(remove) �ֹ���ȣ�� �޾Ƽ� ����
	//�ֹ�����(update) �ֹ���ȣ,�޴���,���� - �Ѿ� �ڵ����ǰ�
	//�ֹ�ǥ��(display) ��ü�ֹ���� ���.
	
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
			System.out.println((i+1)+"."+this.orderMenu.get(i)+" "+this.orderQty.get(i)+"EA"+" �� "+this.sum.get(i)+"��");
			sum1+=sum.get(i);
			}System.out.println("�Ѿ� :"+sum1+"��");
	}
	
	private void guide() {
		System.out.println("�ֹ�����(X:����, C:�ֹ��߰�, R:�ֹ�ǥ��, U:�ֹ�����, D:�ֹ�����");	
	}
	
	public void Handling(Menu menu) { // �Ķ���ͷ� Ŭ���� instance ���� ����!!!!!!
		menu.display();
		this.guide();
		Scanner s=new Scanner(System.in);
		String o1=s.nextLine();
			while(o1.equals("X")==false) {
				if(o1.equals("C")) {
					System.out.println("�ֹ��߰�");
						Scanner os=new Scanner(System.in);
					System.out.println("�ֹ��Ͻ� �޴���ȣ�� �Է��ϼ���");
						int orderMenu=Integer.parseInt(os.nextLine());
						String ordername=menu.getAlMenu(orderMenu-1);
						int orderprice=menu.getAlPrice(orderMenu-1);
					System.out.println("������ ������ �Է��ϼ���");
						int orderQty=Integer.parseInt(os.nextLine());
						int sum=orderprice*orderQty;
					this.add(ordername,orderQty,sum);
					System.out.println(ordername+" "+orderQty+"EA"+" �Ѿ� : "+sum);
				}  else if(o1.equals("U")) {
					System.out.println("�ֹ�����");
						Scanner os=new Scanner(System.in);
					System.out.println("������ �ֹ���ȣ�� �Է��ϼ���");
						int orderMenu_num=Integer.parseInt(os.nextLine());
					System.out.println("���ο� �ֹ���ȣ�� �Է��ϼ���");
						int orderMenu=Integer.parseInt(os.nextLine());
					System.out.println("������ �Է��ϼ���");
						int orderQty=Integer.parseInt(os.nextLine());
					this.update(menu, orderMenu_num, orderMenu, orderQty);
					this.display();
				} else if(o1.equals("D")) {
					System.out.println("�޴�����");
						Scanner os=new Scanner(System.in);
					System.out.println("������ �޴���ȣ�� �Է��ϼ���");
						int n=Integer.parseInt(os.nextLine());
					this.remove(n);
					this.display();
				}
			
			this.guide();
			o1=s.nextLine();
			}
/*void addMobile(){
 * Scanner s= new Scanner(System.in);}*/
			System.out.println("����� ��ȣ�� �Է��Ͻÿ�.(������'-')");
			String mobile=s.nextLine();
			if(mobile.equals("")) mobile="-";
			int start_ndx=this.mobile.size();
			for(int i=this.mobile.size(); i<this.orderMenu.size(); i++) {
			 this.mobile.add(mobile);
				}
/*void */			
			int sum1=0;
			for(int i=start_ndx; i<this.orderMenu.size(); i++) {
				System.out.println("����ȣ : "+this.mobile.get(i)+", "+this.orderMenu.get(i)+" "+
								   this.orderQty.get(i)+"EA"+" "+"�Ѿ�:"+this.sum.get(i));
				sum1+=this.sum.get(i);
			}
			System.out.println("���ֹ��ݾ� :"+sum1);
			System.out.println("----------------------------");
			
	}
			
//			System.out.println("����ȣ�� �Է��ϼ���.(������'-')");
//			Scanner o2=new Scanner(System.in);
//			String m1=o2.nextLine();
//			String mobile=m1;
//			System.out.println("����ȣ :"+m1);
//			this.display();
			
		
	//1. �޴�ǥ��
//	2. �ֹ��� �޴���ȣ�� �Է��Ͻÿ�(X:�ֹ��Ϸ�)
//	3. �޴���ȣ�� �޴´�.(X�� �ԷµǸ� 8������)
//	4. ������ �޴��� ������ �Է��Ͻÿ�.
//	5. ������ �޴´�.
//	6. �ݾ� �ڵ����, ǥ��(����޴��� �Ѿװ� ��������ֹ��� ������ �Ѿ�)
//	7. 1�� ���ư���
// 8.�ֹ����� ����Ϲ�ȣ�� �Է��Ͻÿ�
// 9. ����Ϲ�ȣ�� �޴´�.("-": ������)
//10.�ֹ��� ���� ��� (�� �޴��� ����+�����Ѿ�)
	
	
	
	
	
}