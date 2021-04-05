package com.javalec.Calc;

import java.util.Scanner;

public class Calc2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int num = scanner.nextInt();
	
//		System.out.print("입력하신 숫자는 ");
//		System.out.println(num % 3 == 0? "3의 배수" : "3의 배수가 아님");
		
		//개같네!! 이건 밑에다가 입력을 해봐야 아는 겁니다! 
		// 저렇게 너무 길어진다 싶으면 한줄 안떨어지는 프린트로 하나 써놓고 밑에다가 하나 저 붙여도 괜찮음
		
		System.out.println(num % 2 == 0? "2의 배수" : 
		                   num % 3 == 0? "3의 배수" : "모름");
		                    	 
		// 학점 만들기? 90보다 크면A학점이다, ~~~ 기타 등등은 에프학점이다
		//if <-- 숫자만 넣어야하는데 글 넣거나 하면 다시 넣으라고 할떄(제어)
		
		
		
		
		
	}

}
