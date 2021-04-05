package com.javalec.base;

public class Variable_01 {

	public static void main(String[] args) {
		// 변수(Variable)
		// Command + 방향키 (양 끝으로 이동)
		// Heap memory, Stack memory - garbage collection
		//	 문자열 변수 선언 (hello world 맨날 치기 싫을떄!)
		//String 이 문자 타입 / str은 뒤에 쓰는 이름 / =이 Smemory 와 Hmemmory 를 연결해줌
		String str = "Hello, World";   // 변수를 선언한거임! 
		
		System.out.println(str);
		System.out.println(str);   // 이렇게 하면 str 이 곧 헬로월드임 (할당연산자)
									// = 뜻은 오른쪽에 있는걸 왼쪽으로 넘긴다는 뜻
	
	    // 이 상태에서 String str ="abc" 처럼 하나 더 변수를 선언하면 CPU에서 인식하지 못함!! 종복되기떄문에
		
		str = "abc";
		System.out.println(str);  // 이러면 이 밑에서부터는 변수가 바뀌었기 떄문에 앞으로는 str이abc로 나옴
		
		
		// 정수 변수선언
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);   // 커맨드 + 오른쪽 방향키 습관화?
		System.out.println((double)num1 / (double)num2);  // Double로 했더니 오류가 났다? ->String 말고 어지간하면 소문자로 시작함
		System.out.println((double)num1 / num2);  // 요렇게 하나만 해도 상관없어!
		System.out.println((double)(num1 / num2));  // double이 정수를 실수로 바꿔준다는거야.. 그런데 이미 값이 0인데 0.0 으로 바꿔도 의미가 없다는거지
													// 그리고 계산은 괄호 안에 있는거 먼저 하기때문에 그렇다 이말이야
		
		
		//계산한 값을 어디에 보관하고 싶다 + 카멜기법
	//int num1 = 10;
	//int num2 = 20;
		int plusResult;        // 선언부분은 앞부분에 다 하고서! 소스 가운데 있으면 굉장히 혼동됩니다.
		
		plusResult = num1 + num2;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);   // 커맨드 + 오른쪽 방향키 습관화?
		//plus 하고컨트롤스페이스 가능
		System.out.println(plusResult);
		
		// 코딩의 순서는 선언 -> 계산 -> 소스 순을 하는게 좋다!!
	
		// String 은 문자열이고, int는 정수이고, double은 실수이다!! 각각 변수를 선언하는 입력이 다름
		// 선언하는 애들은 3~4글자 쓰고 컨트+스페이스로 찾을 수 있다, 이게 오타 줄이는데 좋다!
		// 변수? 메모리에 입력해두고 원할떄 빼서 쓸 수 있다는 의미
	    // 한글은 쓰고나서 꼭 엔터 한번 쳐주기
		
		
		num1 = 100;
//$$	 //num1 = "abc"는 입력이 안된다!    >>???? 그러면 String 다시 붙이면?
										// 이미 num1 값이 int 로 묶여있기때문에 String 으로 다시 선언할 수가 없다!!!!!
		
		
		// ---  연습 ---
		int startNum = 30, endNum = 40;       //N대문자쓰는게 카멜기법
		int plusResult2;
		
		plusResult2 = startNum + endNum;       // 변수 이름 짓는거는 마음대로! 근데 이름 짓기가 어렵다고 하셨음
		
		/*
		 30과 40의 덧셈 결과는 70입니다.
		 30과 40의 뺄셈 결과는 -10 입니다.
		 30과 40의 곱셈 결과는 1200 입니다.
		 30과 40의 나눗셉 중 몫은 0 입니다.     //<-- 몫의 뜻을 몰랐네 ^^;; 수학공부 필
		 30과 40의 나눗셈 결과는 ___ 입니다.   // 몫과 다른건 결과 (실수로 나와야한다는 것입니다!~)
		 30과 40의 덧셈결과와 뺄셈 결과의 곱은 ___ 입니다.
		 */
		
		System.out.println("");
		System.out.println("-Examlple-");
		System.out.println((startNum) + "과 " + (endNum) + "의 덧셈 결과는 " + (startNum + endNum) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 뺄셈 결과는 " + (startNum - endNum) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 곱셈 결과는 " + (startNum * endNum) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 나눗셈 중 몫은 " + (startNum / endNum) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 나눗셈 결과는 " + ((double)startNum / endNum) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((startNum + endNum) * (startNum - endNum)) + "입니다.");
		System.out.println((startNum) + "과 " + (endNum) + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((plusResult2) * (startNum - endNum)) + "입니다.");
		
			
		
		// ---  연습 숫자를 바꿔본 버젼입니다!!
		int startNum2 = 50, endNum2 = 100;       //N대문자쓰는게 카멜기법
		int plusResult3;
		
		plusResult3 = startNum2 + endNum2;       // 변수 이름 짓는거는 마음대로! 근데 이름 짓기가 어렵다고 하셨음
		
		/*
		 30과 40의 덧셈 결과는 70입니다.
		 30과 40의 뺄셈 결과는 -10 입니다.
		 30과 40의 곱셈 결과는 1200 입니다.
		 30과 40의 나눗셉 중 몫은 0 입니다.     //<-- 몫의 뜻을 몰랐네 ^^;; 수학공부 필
		 30과 40의 나눗셈 결과는 ___ 입니다.   // 몫과 다른건 결과 (실수로 나와야한다는 것입니다!~)
		 30과 40의 덧셈결과와 뺄셈 결과의 곱은 ___ 입니다.
		 */
		
		System.out.println("");
		System.out.println("-Examlple-");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 덧셈 결과는 " + (startNum2 + endNum2) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 뺄셈 결과는 " + (startNum2 - endNum2) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 곱셈 결과는 " + (startNum2 * endNum2) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 나눗셈 중 몫은 " + (startNum2 / endNum2) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 나눗셈 결과는 " + ((double)startNum2 / endNum2) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((startNum2 + endNum2) * (startNum2 - endNum2)) + "입니다.");
		System.out.println((startNum2) + "과 " + (endNum2) + "의 덧셈결과와 뺄셈 결과의 곱은 " + ((plusResult3) * (startNum2 - endNum2)) + "입니다.");
		
	}
}
			