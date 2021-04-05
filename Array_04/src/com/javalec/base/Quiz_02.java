package com.javalec.base;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// 입력할 숫자의 개수? (100개 미만) : 5
//		5개의 숫자를 입력하세요
//		11
//		12
//		13
//		14
//		15
//		입력한 숫자 중 최대값은 15번이고 5번쨰 값입니다.

		
		//입력시키기------------
		
		
	//[0]기본 선언문
	Scanner scan = new Scanner(System.in);		
	int [] input = new int[98];
		
	//[1]사용자 입력 선언문 
	int NumberOfInput = 1;

	//[3] 최대값 찾아내기 선언문
	int maxNum = 0;
	int max = 0;
		
	
	// [1]원하는 입력 개수 확인 --------------//
	System.out.print("입력할 숫자의 개수 ? (100개 미만) : ");
	NumberOfInput = scan.nextInt();
	System.out.println(NumberOfInput + "개의 숫자를 입력하세요!");
	
	
	// [2]입력한 수만큼의 숫자 입력시키기 -------//
	for ( int i=0; i<=NumberOfInput-1;  i++) {
		
		  input[i] = scan.nextInt();
		
	}//for
	 
	//-----------------------------------//
	 
	//[3]최대값 찾아내기 계산
	for(int i=0; i<=NumberOfInput; i++) {
		 
		 if(max < input[i]) {
			 max = input[i];
			 maxNum = i;
		 }//if
	 }//for
	
	
	// [4]결과물 나타내기----------------------//
	System.out.println("입력한 숫자중 최대값은 "+ max + "이고 " +(maxNum+1) + "번째 값 입니다.");
		
		
		
		
	}

}
