package com.javalec.base;

import java.util.Scanner;

public class Grade_Switch {   //  case 문은 조건문에만 쓸 수 있다 ( 스위치)

public static void main(String[] args) {
		
	// 선언문
	Scanner scanner = new Scanner(System.in);
	int GradeInput = 0;
	String result = "";
	
	
	// 처리과정
	System.out.print("당신의 성적을 입력해주세요 : ");
	GradeInput = scanner.nextInt();
	
	if((GradeInput > 100) || (GradeInput < 0)) {
		result = "x";
	}
	switch(GradeInput / 10) {
	   case 10 : 
		   result = "A";
		   break;
	   case 9 : 
		   result = "A";
		   break;
	   case 8 : 
		   result = "B";
		   break;
	   case 7 : 
		   result = "C";
		   break;
	   case 6 : 
		   result = "D";
		   break;   
	   default :
		   result = "F";
		   break;
	}
		
		// 결과값 보여주기
		if(result == "x") {
		System.out.println("잘못 입력하셨습니다.");
		} 
		System.out.println("당신의 학점은 " + result + "입니다.");
		
	}
}
