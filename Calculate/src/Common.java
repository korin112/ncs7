
public class Common {
//필드선언
	//workflow
//	1. 두 수(X,Y) 작은 수(X)를 찾는다.
//	2. 반복문을 실행하면서, 2~ X-1까지의 수(A) X와 Y를 나눠본다.
//		2~ X-1까지로 한번도 나눠지지 않으면 6으로 간다.
//	3. X와 Y가 A로 동시에 나눠지면 (나머지가 0이면) A를 따로 보관. 
//	4. 두 수의 몫을 X와 Y에 대체한다.
//	5. 1로 돌아간다.
//	6. A를 따로 보관한 값의 곱 -> 최대공약수
//	7. X*Y/최대공약수 -> 최소공배수
//	8. 출력
	int A,x,y;
	Common(){}		//기본생성자
	
	Common(int a,int b){	//일반생성자
		x=a;
		y=b;
		if(x<y) {
			for(int c=2; c<x-1; c++ ) {
				if(x%c==0 && y%c==0) {
					A=c;
				} 
			}
		}
		else {
			for(int c=2; c<y-1; c++ ) {
				if(x%c==0 && y%c==0) {
					A=c;
				} 
			}
		}
	}		
	
	void showGCF(){
		System.out.println("최대공약수 : "+A);
	} 	// 최대공약수
	
	void showLCM(){
		System.out.println("최소공배수 : "+(x*y)/A);
	}	// 최소공배수
}
