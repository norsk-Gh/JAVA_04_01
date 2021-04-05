package com.javalec.base;

import java.util.Scanner;

public class Practice_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//			int tot = 0;
//		for(int i=0; i<=100; i=i+2) {     // 선생님은	i+=2 로 하셨움
//			tot = tot + i;
//		}
//		System.out.println("답은 " + tot);
		
		
		            												// EvenNum , OddNum		
		//----------(QUIZ)----------- 입력한 수의 팩토리얼 구하기 (5!)
		
		
		
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");             // 사용자 값 입력
		int InputNum = scanner.nextInt();
		
		//계산하기											   // 팩토리얼은 1씩 빼는것도 있지만 하나식 더하는 경우도 생각해야함.
		int Factorial = 1;                                 // 곱셈이라 0이면 오류, InputNum 일 경우 한번 더 곱셈 들어감.
		for(int i=InputNum; i>=1; i--) {                   // i-= 가 아니고 i-- 입니다!
			Factorial = Factorial*i;
		}
			//for(int i=1; i<=InputNum; i++){
		// 결과 보여주기	
		System.out.println(InputNum + "의 팩토리얼 값은 " + Factorial + "입니다.");	
			
	}
	

}
