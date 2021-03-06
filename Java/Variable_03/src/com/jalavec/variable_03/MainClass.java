package com.jalavec.variable_03;

public class MainClass {
public static void main(String[] args) {
	//연산자 종류별 출력
		
	int i = 10;
	int j = 2, k = 5 ;
	
	System.out.println("<- 산술 연산자 ->");
	System.out.println("덧셈 : " + i + " + " + j + " = " + (i+j));
	System.out.println("뺄셈 : " + i + " - " + j + " = " + (i-j));
	System.out.println("곱셈 : " + i + " * " + j + " = " + (i*j));
	System.out.println("나눈 몫 : " + i + " / " + j + " = " + (i/j));
	System.out.println("나눈 나머지 : " + i + " % " + j + " = " + (i%j));    // 나누고 나서 남은 값은 %로 표기한다! 오늘 나온거  (아주아주 많이 쓴다고 합니다. 홀짝 구분할떄 씁니다.)
	   // -> 앱에서 토글 한번누르면 어떤거, 두번누르면 어떤거 설정할떄 누른 횟수가 홀짝인지로 해서 만든다고 합니다.
	
	System.out.println("<--- 자동 증감 연산자 --->");
	System.out.println(i+1); // 이건 여기서만 +1 되서 나온거고...
	System.out.println(i);

	System.out.println("<--- 자동 증감 연산자 --->");
//	i = i + 1;
//	i + = 1;   //<---- 이렇게 쓰기도 함!!
	i++;   // <--- 이거도 똑같음.. (이건1뿐이 안된다구)
	System.out.println(i);
	
//	j = j - 1
//	j- = 1;
	j--;

	// 이 세개가 역시 다 같은 느낌임! 처음엔 첫번째꺼를 쓰면 좋긴 한데... 나중엔 타자치기 싫어서 밑에거로 쓰기 시작함. 근데 저게 뭔지는 알아야한다구.

	System.out.println("<-- 동등 비교 관계 연산자");
	System.out.println("i == j :" + (i==j));   // !!!! 중요, 같은거냐고 물어보는거는 이콜을두개 써야한다! 하나만 쓰면같다고 계산해버리기떄문에그렇다.
	System.out.println("i !== j :" + (i !=j));   // !!!! 중요, 이건 또 반대로 같이 않냐? 고 물어보는것이다.
	System.out.println("i > j :" + (i > j));   // >= 크거가 같냐 이런거로 할 수 있음  (=< 이건 안된다!, >< 이거는 = 전에 나와야한다)
	System.out.println("i >= j :" + (i >= j));  
	
	
	System.out.println("<-- 논리 연산자 -->");   // 합집합이나 교집합을 쓸 떄 한다!
	System.out.println((i>j) && (j>k));   // 이건 둘다 true 여야지 트루로 나온다! 나이랑 성별 둘다 맞는사람 고를떄? 쓸듯 하는 느낌 (합집합)
	System.out.println((i>j) || (j>k));   // 이게 or 값을찾는건데.. 이건 엔터 위에있는 키로 쓰는거임! 근데 이거는 사진 찍어뒀는데 다시한번 이해를 해야함! (교집합)
	
	
	System.out.println("<--- 삼항 연산자 --->");
	System.out.println(k==5 ? "k==5" : "k!=5"); // K가 5면~? (k는 5 :k는 5아님)
	
	
	// Exercise : i가 홀수인지 짝수인지 출력하시오
	System.out.println((i%2)== 1 ? "홀수" : "짝수");
	System.out.println((i%2)== 0 ? "짝수" : "홀수");
		
				
		
}
	
	
}
