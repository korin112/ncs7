
public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1 = new BeepTask1UseChildclass();
		bt1.start();

		Runnable bt=new BeepTask();
		Thread thread = new Thread(bt);
		thread.start();			//�����带 ���� �����ϴ� �� ��

		for (int i = 0; i < 5; i++) {
			System.out.println("AAAAA");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
