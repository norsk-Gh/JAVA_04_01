package com.javalec.base;

import java.util.Scanner;

public class practise_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//국어점수 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요!");
		double kor = scanner.nextDouble();
 
		//영어점수 입력
		System.out.println("영어 점수를 입력하세요!");
		double eng = scanner.nextDouble();
		
		//수학점수 입력
		System.out.println("수학 점수를 입력하세요!");
		
		double mat = scanner.nextDouble();
		
	   System.out.println("평균점수 : " + ((kor + eng + mat) / 3));

	   double average = (kor+eng+mat) / 3;
	   
	   
	   //국어평균 멘트입니다.
	   if (kor > average) {
		   System.out.println("국어 점수는 평균 보다 높습니다.");
	   }else if(kor == average) {
		   System.out.println("국어 점수는 평균 점수입니다.");		   
	   }else {
		   System.out.println("국어 점수는 평균 보다 낮습니다.");		   
	   }
			   
	   //영어평균 멘트입니다.
	   if (eng > average) {
		   System.out.println("영어 점수는 평균 보다 높습니다.");
	   }else if(eng == average) {
		   System.out.println("영어 점수는 평균 점수입니다.");		   
	   }else {
		   System.out.println("영어 점수는 평균 보다 낮습니다.");		   
	   }
	   
	   //수학평균 멘트입니다.
	   if (mat > average) {
		   System.out.println("수학 점수는 평균 보다 높습니다.");
	   }else if(mat == average) {
		   System.out.println("수학 점수는 평균 점수입니다.");		   
	   }else {
		   System.out.println("수학 점수는 평균 보다 낮습니다.");		   
	   }
	   
			   
		
	}

}
