package com.javalec.base;
import java.util.Scanner;
public class While_prac_01 {
	public static void main(String[] args) {
		
		
		//---<Exercise>---//
		// 몇 개의 숫자를 더할까요 ? : 4
		/* 4개의 숫자를 입력하게요 
		 * 1
		 * 2
		 * 3
		 * 4
		 */ 
		 //입력한 숫자의 합은 10입니다.
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 더할까요 ? : ");
		int InputNum = scan.nextInt();
		System.out.println(InputNum + "개의 숫자를 입력하세요.");
		
		int tot = 0;
		
		for(int i=1; i<=InputNum; i++) {
			int NumValue = scan.nextInt();
			tot += NumValue;
			
		}
		System.out.println("입력한 숫자의 합은 " + tot + "입니다.");
		

	}

}
