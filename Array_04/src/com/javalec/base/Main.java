package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {         // -> 저거 써야함!  temp = Big;
															//        big = small
															//		  small = temp;
		// ----------Exercise---------//
		// James의 신장을 입력하세요! ___
		// Cathy의 신장을 입력하세요! ___
		// Kenny의 신장을 입력하세요! ___
		// Martin의 신장을 입력하세요! ___
		// Crystal의 신장을 입력하세요! ___
		// 
		// 평균신장은 : 174
		// 가장 큰 학생은 _____이고 그 학생의 키는 ____
		// 가장 작은 학생은 _____ 이고 그 학생의 키는 ___
		
		
		
		// 선언문 모음집 -----------//
		String [] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		Scanner scan = new Scanner(System.in);
		double [] height = new double[name.length];
		double totalHeight = 0.0;    //  신장 합계 저장소
		
		double max = 0.0;          // 가장 큰 사람 키 수치
		double min = 500.0;        // 가장 작은사람 키 수치(0으로 설정하면 0만 나옴)
		String maxName = "";     // 가장 큰 사람 이름
		String minName = "";     // 가장 작은사람 이름
		//-----------------------//

		
		// 입력시키기 & 계산하기------//
		for(int i=0; i<name.length; i++) {
		
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scan.nextDouble();

			totalHeight += height[i];	  // 합계 보관함으로 넣기 
			
				if(min > height[i]) {     // 가장 작은키 비교하기
					min = height[i];
					minName = name[i];
				}
				if(max < height[i]) {     // 가장 큰 키 비교하기
					max = height[i];
					maxName = name[i];
				}
		}//for
		//-----------------------//
		
		// 결과 보여주기------------//
		System.out.println("평균 신장은 : " + String.format("%.2f", (totalHeight / height.length)));
		System.out.println("가장 큰 학생은 " + maxName + "이고 그 학생의 키는 " + String.format("%.2f",max));
		System.out.println("가장 작은 학생은 " + minName + "이고 그 학생의 키는 " + String.format("%.2f",min));
		//-----------------------//
		
		
		
	}

}
      // 선생님 멘트 //
///// 이름이 같은게 쭉 이어지면 배열이라고 알아차려야함James~ 시작하는걸 index라고 한다
// 생각 라인 1. 5번 입력하게 하자   -> 평균 신장을 구하자 -> 가장 큰 학생을 구해보자 -> 가장 작은 학생을 구해보자 -> 필요없는게 있는지 확인하자  -> 정리하고 이쁘게 만들자!
// double = 0.0; 으로 하는걸 생각해야한다!!

// 기능을 작게작게 돌아가는지 먼저 해결하며 진행하고!


//			int minHeightIndex = 0; <- 사람의 주소값만 알면 되기 때문에 이렇게 해도 괜춘
//
//
//					if(min > height[i]) {     // 가장 작은키 비교하기
//						min = height[i];
//						minHeightIndex = i;
//					}


