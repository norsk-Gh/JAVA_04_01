package com.javalec.Calc_01;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
//		int num = 2;
//		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
		// 사용자가 num 값에 무언가를 넣을 경우?
		// 사용자의 입력 데이터 받기  -> 스캐너 라는걸 사용할 거임
//$$$	// java.util <----- 이거로 써있는거로 꼭!!!! 골라야함 다른건 노노
		
		Scanner scanner = new Scanner();     // instant, object, 객체를 만들었다고 말함(scanner).
		
		System.out.println("숫자를 입력하세요 :");
		int num = scanner.nextInt();     // 이렇게 점 뒤에 쓰는건 Method 라고 말합니다.(메소드 하나 추가해서와 = 기능 하나 추가해서와)
		                       // 정수값을 가져오는메소드임, 사용자가 숫자쓰면 그걸 가져오는거
		
		System.out.println("사용자 입력 숫자는" + num + "입니다.");
		
		/*
		 * 연습
		 * 숫자를 입력해 주세요 : 12
		 * 입력하신 숫자는 3의 배수입니다.
		 * 
		 * 숫자를 입력해 주세요 : 10
		 * 입력하신 숫자는 3의 배수가 아닙니다
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int num2 = scanner.nextInt();
		System.out.println("입력하신 숫자는" + num2 + "의 배수입니다.");
		
		
		
	}
}

