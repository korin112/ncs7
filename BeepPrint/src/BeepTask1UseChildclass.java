
public class BeepTask1UseChildclass extends Thread {
	@Override
	public void run() { // �߻�޼ҵ�
		int a=0;
		int b=1;
		int c=a+b;
		while(c<1000) {
			a=b;
			b=c;
			System.out.println(c);
			c=a+b;
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {}
        }
	}
}
