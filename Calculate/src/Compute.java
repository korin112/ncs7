
public class Compute {

	public static void main(String[] args) {
//		workflow
//		1. �� ��(X,Y) ���� ��(X)�� ã�´�.
//		2. �ݺ����� �����ϸ鼭, 2~ X-1������ ��(A) X�� Y�� ��������.
//			2~ X-1������ �ѹ��� �������� ������ 6���� ����.
//		3. X�� Y�� A�� ���ÿ� �������� (�������� 0�̸�) A�� ���� ����. 
//		4. �� ���� ���� X�� Y�� ��ü�Ѵ�.
//		5. 1�� ���ư���.
//		6. A�� ���� ������ ���� �� -> �ִ�����
//		7. X*Y/�ִ����� -> �ּҰ����
//		8. ���
		//12
		Common cmn1 = new Common(60,24);	// common Ŭ���� �̸�
		// cmn1 instance�̸�
		cmn1.showGCF(); 	// �ִ�����
		
		cmn1.showLCM();	// �ּҰ����
		
		Common cmn2 = new Common(96,72);
		
		cmn2.showGCF(); 	// �ִ�����
		
		cmn2.showLCM();	// �ּҰ����

	}

}
