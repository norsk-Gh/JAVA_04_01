package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	 // 비교문 #1  (조건문, 브랜치등등 으로 불림)
		
	int i = 10;   // ~~에 쓰는 변수이다 ( 라고 적어두는게 좋음, 알아보기 쉬우니까)
	int j = 20;
	int k = 30;
	
	
	//{}  Scope 범위란 뜻
	// 밑에if는 조건 충족되면 거쳐가고 아니면 이거 안하고 흘러가는 식으로 할거임
//		if(i > j) {
//			System.out.println("i가 j보다 큽니다.");
//		}
//
//	System.out.println(">>End<<");
	

	//비교문 #2 :i가 j보다 작은경우 얼마나 작다 등등 (비교문으로 입력한 숫자 크기의 차이 구하기)
	
//		if(i > j) {      // 여기 조건에 있는거 말고는 전부 엘스에서 걸림 둘중에 하나는 걸린단 소리임
//			System.out.println("i는 j보다 " + (i-j) + "만큼 큽니다.");	    
//		} else {
//			System.out.println("j는 i보다 " + (j-i) + "만큼 큽니다." );
//			
//		}
//		System.out.println(">>>>End<<<<");
		
	//비교문 #3 : 비교문으로 같다까지 표현해주는 3중표현 해보
	
//		if(i > j) {
//			System.out.println("i가 j보다 큽니다.");      // 딴길로 안가고 정해진대로만 가게 하는게 잘 짜놓은거임
//		}else if(i == j) {
//			System.out.println("i와 j가 같습니다.");			
//		}else {
//			System.out.println("i가 j보다 작습니다.");	
//		}
//	
//	
//			System.out.println(">>>>End<<<<");
	
//		int price = 5000;
//			
//		if(price > 8000) {
//			System.out.println("너무 비쌉니다.");
//		} else if(price > 5000) {
//			System.out.println("조금 비쌉니다.");
//		} else if(price>3000) {
//			System.out.println("적당한 금액입니다.");
//		} else {     // 엘스는 괄호치고 내용 안쓴다 ! 왜냐 엘스니까
//			System.out.println("싼편입니다.");
//			
//		}
//	 
//		System.out.println("구매하시겠습니까?");
	
		
		/*
		 * 성적을 입력하세요 : 90
		 * 귀하의 학점은 A학점 입니다.
		 * 
		 * 성적을 입력하세요 : 80
		 * 귀하의 학점은 B학점 입니다.
		 */
		
	
//		Scanner grade= new Scanner(System.in);      // 처음에 할떄 두번째 스캐너 소문자해서 오류났
//		
//		System.out.println("성적을 입력하세요 : ");
//		
//		int num = grade.nextInt();
//		
//		if (num>=90) {          //처음에 할떄 if num(  으로 했었음!
//			System.out.println("귀하의 학점은 A학점 입니다.");
//		}else if(num>=80){             // && 굳이 안써도 된다고 하셨음.. 근데 이게 상황따라 다르다고 하는데 여기서는 괜찮!
//			System.out.println("귀하의 학점은 B학점 입니다.");
//		}else if(num>=70){
//			System.out.println("귀하의 학점은 C학점 입니다.");
//		}else if(num>=60){
//			System.out.println("귀하의 학점은 D학점 입니다.");
//		}else {
//			System.out.println("귀하의 학점은 F학점 입니다.");
//		}
//		
//		System.out.println("수고 많으셨습니다.");
		Scanner grade= new Scanner(System.in);      // 처음에 할떄 두번째 스캐너 소문자해서 오류났
		
		System.out.println("성적을 입력하세요 : ");
		
		int num = grade.nextInt();
		String result ="";
		
		
		if (num>=90) {      
			          result = "A";
		}else if(num>=80){
					  result = "B";
		}else if(num>=80){
					  result = "B";
		}else if(num>=70){
					  result = "C";
		}else if(num>=60){
					  result = "D";
		}else if(num<60){
					  result = "F";
		}else {
				result = "error";
		}
		
		if (result == "error") {         // 숫자만 = 하나고, 문자열은 ==로 해야합니다!!
			System.out.println("잘못입력되었습니다.");
		}
		else {
		System.out.println("귀하의 학점은" + result + "입니다.");
		}// 120 점 같은 100점 이상도 하나 만들어주기!
	
	
	
	
	
	}
}