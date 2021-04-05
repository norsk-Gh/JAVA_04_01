package com.javalec.base;

import java.util.Scanner;

public class Gugu_Exercise {

	public static void main(String[] args) {
		// --예제-- //
		// 원하시는 단을 입력하세요 : 7
		// 7 X 2 = 14
		// 7 X 4 = 28 ... 짝수만 나오게 해보기!
		
		
		//선언파트
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원하시는 단을 입력하세요 : ");
//		int dan = scanner.nextInt(); 
//		
//		//계산해주기
//			int Odd = 1;
//		for(int i=2; i<=9; i+=2) {        // int 앞에 안나서 혼쭐났음 ㅡㅡ
//			Odd *= i;                  // Odd는 i가 8까지 갈 수 있게 만들어 주는 저장소이다!!!!
//			
//			System.out.println(dan + " X " + i + " = " + (dan*i));
//					
//		}
		
		//-------연습-------//
		/*원하시는 단을 입력하세요 : 7
		 * 7 X _ = 7
		 *7 X 2 = 14
		 *7 X _ = 21
		 *7 X 4 = 28
		 * 
		 */

		
	     
	 Scanner scanner = new Scanner(System.in);
	
	 
	 System.out.print("원하시는 단을 입력하세요 : ");
	 int dan = scanner.nextInt();
	 
	int num2 = 0;    //잔고나 저금통 같은 느낌이구
	 
	for(int i=1; i<=9; i++) {	
		
		num2 += i;
		
		
	 if(i%2 == 0 ) {
		 System.out.println(dan + " X " + i + " = " + (dan*i));	
	 }else {
		 System.out.println(dan  + " X " + "_" + " = " + (dan*i));	
	 }
	}
		
		

	}

}
