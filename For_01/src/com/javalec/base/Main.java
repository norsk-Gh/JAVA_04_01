package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ** 범위가 정해져있으면 For가 편하고, 어디가 반복되어있는지 잘 파악해야한다.
		// 파라미터와 인덱스?
		// 무엇을 반복할건지를 먼저 생각하고 접근하자
		
		
//		for(int i=1; i<=9; i++) {
//			System.out.println(i);     // 이런식으로 하나씩 테스트해가면서 접근하면 좋다.
//			
//			
//		}
		//-----------------//의심적인거 하나씩 처리해가면서 진행하는게 좋다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("단을 입력하세요 : ");
//		int dan = scan.nextInt();
//		
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan + " X " + i + "=" + String.format("%2d",(dan*i)));     // 이런식으로 하나씩 테스트해가면서 접근하면 좋다.
			                                                   // 이 의미가.. 난 두 자리수의 10진수를 쓸거야! 5d 로 쓰면 5자리로 크게 뜸! 특히 돈 관련 금융권 쓸때 꼭 써줘야합니다.
															   // %02d <-- 이건 비어있는 앞자리는0으로 채우겠다는 소리임!
															   // 자바 스트링 포맷 ! 꼭 찾아서 배우기.
//			
//		for(int dan = 2; dan<=9; dan++) {
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan + " X " + i + " = " + (dan*i));      // 2중 포문  // 윗 포가 2가 먼저들어와서 안에 쭉~ 1부터 9까지 돌고 또 3으로 하나 더 들어와서 한다! 자주씀
//																			// 안에 포문부터 잘 돌아가는지 먼저 잘 해보고서 들어가는게 좋음
//			}
//		
//		}
//		
//		for(int dan = 2; dan<=9; dan++) {
//			System.out.println("<---" + dan +"단--->");
//		
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan + " X " + i + " = " + (dan*i));      // 2중 포문  // 윗 포가 2가 먼저들어와서 안에 쭉~ 1부터 9까지 돌고 또 3으로 하나 더 들어와서 한다! 자주씀
//				
//			}
//			System.out.println("---------------");    // 이런식으로 써주면 한 단이 끝나면 줄을 쳐주는거임! 데코는 무궁무진하다..
//			

		// 구구단 시작 범위 입력 : 2 
		// 구구단 끝 범위 입력 : 4
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 시작 범위를 입력해주세요 : ");
		int StartNum = scan.nextInt();
		
		System.out.print("구구단 끝 범위를 입력해주세요 : ");
		int EndNum = scan.nextInt();
		
		int temp = 0;
		//시작과 끝을 자동으로 변환 ( 만약 시작이 9이고 끝이 2일떄 자동으로 바꿔주는거 0> 이프엘스가 필요없다?)
		
		//사용자 입력 정보 체크
		if (StartNum > EndNum) {
			
	    //--------------------------																			사용자가 앞뒤 잘못 넣었을떄 자동으로 바꿔주는거!! (3단논법으로 생각하면 됩니다.) if로 해서시작이 더 클때만 적용되고 나머지는 자동으로 통과되기때문에.. 이럴떄 위에 temp 보관소를 하나 만들어 주면 됩니다.
			temp = StartNum;
			StartNum = EndNum;
			EndNum = temp; //																				<------ 처음에 StartNum 넣었다가 안됐었음! 실수 조심
		//--------------------------																	대박 기능! 자동으로 잡아주는 멋진 코드 	
			
		}
			for(int dan = StartNum; dan<=EndNum; dan++) {
				System.out.println("<---" + dan +"단--->");
				
				for(int i=1; i<=9; i++) {
					
					if((dan+i) % 2 == 0){
					System.out.println(dan + " X " + i + " = " + String.format("%02d",(dan*i)));      // 2중 포문  // 윗 포가 2가 먼저들어와서 안에 쭉~ 1부터 9까지 돌고 또 3으로 하나 더 들어와서 한다! 자주씀
					}                                        									      // 꼭 02 로 써줘야함.. 2d로 썻다가0 안나왔었음
				}
				System.out.println("---------------");                                                // 이런식으로 써주면 한 단이 끝나면 줄을 쳐주는거임! 데코는 무궁무진하다..
			}
		
		
		// 하나하나씩 만들어가는 생각을 해야합니다 무조건
//			
//			//사용자 입력 정보 체크
//			if (StartNum > EndNum) {
//				System.out.println("잘못 입력하셨습니다.");
//				
//				
//			}else {
//				for(int dan = StartNum; dan<=EndNum; dan++) {
//					System.out.println("<---" + dan +"단--->");
//					
//					for(int i=1; i<=9; i++) {
//						System.out.println(dan + " X " + i + " = " + String.format("%2d", (dan*i)));      // 2중 포문  // 윗 포가 2가 먼저들어와서 안에 쭉~ 1부터 9까지 돌고 또 3으로 하나 더 들어와서 한다! 자주씀
//						
//					}
//					System.out.println("---------------");    // 이런식으로 써주면 한 단이 끝나면 줄을 쳐주는거임! 데코는 무궁무진하다..
//					
//				}
//				
//				// 하나하나씩 만들어가는 생각을 해야합니다 무조건
		
		
		
	}

}

