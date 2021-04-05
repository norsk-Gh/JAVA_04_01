package com.javalec.base;

import java.util.Scanner;

public class Grade_Switch_Up1 {   //  case 문은 조건문에만 쓸 수 있다 ( 스위치)

public static void main(String[] args) {
		
	// 선언문
	Scanner scanner = new Scanner(System.in);
	int GradeInput = 0;
	String result = "";
	
	
	// 처리과정
	System.out.print("당신의 성적을 입력해주세요 : ");
	GradeInput = scanner.nextInt();
	
	switch(GradeInput / 10) {
	   case 10 :    // 10점이던 9점이던 A학점이기떄문에 브레이크를 쓰지않는다.
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
		   result = "D";        //케이스 안에다가도 이프문을 넣을 수 있음(권장하지않음)
		   break;
	   case 5 : 
	   case 4 : 
	   case 3 : 
	   case 2 : 
	   case 1 : 
		   result = "F";     // 마지막에 물받는것처럼 해주면 된다!!
		   break;
	   default :
		   result = "error";
		   break;
	}
		
		// 결과값 보여주기
		if(result == "error") {
		System.out.println("잘못 입력하셨습니다.");
		} else {
		System.out.println("당신의 학점은 " + result + "입니다.");
		}
	}
}
