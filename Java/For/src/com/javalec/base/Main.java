package com.javalec.base;

public class Main {

	public static void main(String[] args) {        // {} 스코프
		// 반복문 For
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);

//		for(int i=1; i<=10; i++)   // 시작은 1부터, 10까지 숫자 하나씩 증가한다.
//			System.out.println(i);      // <--- 이게 반복문이다.  2문장이   // 편하기 위해 나온게 반복문이다!!
		

		//----- 1부터 ~ 10까지 합계구하기-----//
		
//		
//		int tot = 0;    // 누적변수        처음 시작할때는 0으로 시작해서 내려간다 !   값은 왼쪽에서 계산해서 오른쪽으로 준다.
//		for (int i=1; i<=10; i++ ) {
//			tot = tot + 1;
////			
////			tot = 0 + 1
////			tot = 1 + 2
////			tot = 3 + 3   이런식으로 삥삥 돌면서 누적이 된다!! 
//		}      // 이거 안닫아주면 합계는 ~~ 도 계속 반복됩니다.!!
//		System.out.println("합계는 " + tot );

		
		//--- Exercise ---//
		// 1부터 100까지의 수중 짝수의 합을 구하시오
//		
//	int tot = 0;					     // 3번 입력구간 앞에다가 누적되는 공간을 선언해준다! 여긴 무조건 0부터 시작해야 한다. 안그럼 이것도 같이 더해져버린다.
//	for(int i=1; i<=100; i++) {          // 1번 입력구간 ( 범위를 먼저 산정해준다 ) 그리고 int 는 for안에서만 적용되는 변수인데... 나가면 모름! 그런데 보통int i 를 쓴다고
//		if(i%2==0) {				  	 // 2번 입력구간 if로 조건을 또 달아준다.
//			tot = tot + i;               // 4번 계
//		}
//	}
//	System.out.println("답은 : " + tot);  // 5번으로 출력해준다.
//		
//		int tot = 0;  //짝
//		for (int i=1; i<=100; i++) {           //i++ 는 따옴표 안쓴다! (오답)
//			if(i%2 == 0) {
//				tot = tot + i;
//			}else {
//				tot = tot + i;
//		
//		}System.out.println("값은 " + (tot+tot));
//		//-----> 내가 한 오답
//		
		
		//선생님의 답
		int totEven = 0, totOdd = 0;
		for (int i=1; i<=100; i++) {           //i++ 는 따옴표 안쓴다! (오답)
			if(i%2 == 0) {
				totEven += i;            //연산할떄 += 이건 하나씩 플러스 되는거 생각하시고!
			}else {
				totOdd += i;       //선언 명은 길 수록 좋다! 알아듣기 쉽게
			
			}
		System.out.println("정답은 ");
		
	}
	}
}
