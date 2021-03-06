package com.javalec.base;

import java.util.Scanner;

public class Delf_Grade {
public static void main(String[] args) {
	
// DELF(프랑스어 자격시험) 합격점수 프로그램
	
System.out.println("<<DELF 시험 합격기준>>");
System.out.println("");
System.out.println("DELF 시험은 총 100점 중 60점 이상 취득해야 합격처리가 됩니다.");
System.out.println("시험은 쓰기와 구술 두 영역이 있으며, 한 영역이라도 40점 미만일 경우 과락처리됩니다.");
System.out.println("쓰기는 독해(25점)와 작문(25점), 구술은 듣기(25점)와 말하기(25점)으로 구성되어 있습니다.");
System.out.println("      ** 각 파트별 만점은 25점 입니다.**");
System.out.println("");


	//점수 입력하는 곳
	Scanner point = new Scanner(System.in);
		System.out.println("당신의 독해 점수는 몇점입니까? : ");
		double reading = point.nextDouble();
		System.out.println("당신의 쓰기 점수는 몇점입니까? : ");
		double writing = point.nextDouble();
		System.out.println("당신의 듣기 점수는 몇점입니까? : ");
		double listning = point.nextDouble();
		System.out.println("당신의 말하기 점수는 몇점입니까? : ");
		double speaking = point.nextDouble();
		
		//변수 선정하기
		double ecrit = reading + writing;
		double oral = listning + speaking;
		double total = ecrit + oral;
		
		//결과 나타내기_점수
	    System.out.println("당신의 점수는 아래와 같습니다.");
	    System.out.println("1.쓰기영역 : " + ecrit + "      2.구술영역 : " + oral);
	    System.out.println("** 총 점수는 : " + total + "입니다.");
	    
			    //결과 나타내기_합격&불합격
			    	if (ecrit >=40 && oral>=40 && total>=60 == true) {
			    		System.out.println("----------");
			    		System.out.println("합격을 축하드립니다!");
			    	}else {
			    		System.out.println("----------");
			    		System.out.println("죄송합니다. 합격자 명단에 없습니다.");
			    	}
			    	
	    		//결과 나타내기_과락사유
	    		if (ecrit<(double)40 && oral>=(double)40) {
	    				System.out.println("불합격 사유 : 쓰기영역 과락입니다.");
	    		} else if(oral<(double)40 && ecrit>=(double)40) {
	    				System.out.println("불합격 사유 : 구술영역 과락입니다.");
	    		} else if(ecrit<(double)40 && oral<(double)40 == true) {
	    				System.out.println("불합격 사유 : 두 영역 모두 과락입니다.");
	    		} else {
	    				System.out.println("");
	    		}
	    	
	    
	}
}




// Switch = 