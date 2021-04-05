package com.javalec.base;

import java.util.Scanner;

public class Exercise_while_01 {
	public static void main(String[] args) {

		// --- 입력한 값의 정수값들 합 구하기 --- //
		// ex) 입력한 값 = 427  -> 답 13
		
		Scanner scan = new Scanner(System.in);
		
		int	remainder = 0;
		int sum = 0;
		
		System.out.println("Enter an integer : ");
		int inputValue = scan.nextInt();
		
		while(inputValue != 0) {
			remainder = inputValue % 10;
			sum += remainder;
			inputValue = inputValue / 10;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
