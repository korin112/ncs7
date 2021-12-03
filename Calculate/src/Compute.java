
public class Compute {

	public static void main(String[] args) {
//		workflow
//		1. 두 수(X,Y) 작은 수(X)를 찾는다.
//		2. 반복문을 실행하면서, 2~ X-1까지의 수(A) X와 Y를 나눠본다.
//			2~ X-1까지로 한번도 나눠지지 않으면 6으로 간다.
//		3. X와 Y가 A로 동시에 나눠지면 (나머지가 0이면) A를 따로 보관. 
//		4. 두 수의 몫을 X와 Y에 대체한다.
//		5. 1로 돌아간다.
//		6. A를 따로 보관한 값의 곱 -> 최대공약수
//		7. X*Y/최대공약수 -> 최소공배수
//		8. 출력
		
		Common cmn1 = new Common(60,24);	// common 클래스 이름
		// cmn1 instance이름
		cmn1.showGCF(); 	// 최대공약수
		
		cmn1.showLCM();	// 최소공배수
		
		Common cmn2 = new Common(96,72);
		
		cmn2.showGCF(); 	// 최대공약수
		
		cmn2.showLCM();	// 최소공배수

	}

}
