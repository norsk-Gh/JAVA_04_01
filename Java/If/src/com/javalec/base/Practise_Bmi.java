package com.javalec.base;

import java.util.Scanner;

public class Practise_Bmi {

	public static void main(String[] args) {
		// BMI 구하기 = KG / (신장*신장)
		
		//체중입력하기
		Scanner weight = new Scanner(System.in);
		
		System.out.println("BMI(나의 신체질량지수) 알아보기");
		System.out.println("당신의 체중(kg)을 입력해주세요.");
		
		double num1 = weight.nextDouble();
		
		//신장입력하기
		Scanner tall = new Scanner(System.in);
		System.out.println("당신의 신장(cm)을 입력해주세요.");
		
		double num2 = tall.nextDouble();           // 처음에 여기 괄호에도 시스템인 넣었다가 오류났음
		
		//BMI지수 구하기
		double numBmi = (num1/(num2*num2))*100;
		
		System.out.print("당신의 BMI 지수는");
		System.out.println(numBmi + "입니다!");
		
		//비만도 측정하기
		if (numBmi > 1) {
				System.out.println("정확한 수치가 아닙니다. 잘못 입력하셨습니다.");
		}else if (numBmi >= (double) 0.3) {
				System.out.println("당신은 비만입니다!!");
		}else if (numBmi >= (double) 0.25) {
			System.out.println("당신은 과체중입니다!");
		}else if (numBmi >= (double) 0.2) {
			System.out.println("당신은 정상입니다^^!");
		}else {
			System.out.println("당신은 저체중입니다..");
		}
		
				
				
		
		
		
		
		
		
	}

}
