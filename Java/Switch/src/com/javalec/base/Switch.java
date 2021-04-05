package com.javalec.base;

import java.util.Scanner;

public class Switch {               // Switch 는 보기편한 if문이다.   (Swift 에서는 if 보다 Switch를 많이쓴다)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 문
		// 선언문
				
				
		//처리
				
				
		//결과보여주기
				
				
		// -> 이렇게 블록코딩 (미리 커멘트를 달고서 코딩을 시작하는게 맞다!)  - 각 코딩에 일자랑 누가 했는지도 적어두면 좋다.

//		// 여기서부터 시작!
//		// ---if문---                    // 코딩은 필요할떄바다 선언문을 만드는 것이기 떄문에 이렇게 구분해서 그떄그떄 해주는게 좋다
//		// 선언문
//		Scanner scanner = new Scanner(System.in);  // 시스템 인 뜻이.. 시스템이 지금 보이는 곳에서 입력해서 가져온다는거다.(syso 에 있는 out은 내가 화면(시스템)으로 내보내겠다는 뜻임)
//		int inputNumber = 0;   // 사용자 입력
//		String result = "";    // 처리 결과 저장소    -> 이걸  if else  압력 후에 다시 달아줬
//		
//		//  처리
//		System.out.print("숫자를 입력하세요!");     // 아.. 바로 옆에 입력하게 시키려면ln을 뺴야한다.
//		inputNumber = scanner.nextInt();    // scanner.nextInt(); 이걸 먼저 입력한 후에 위에 변수 int를 써주고서 inputNumber 를 달아주면 되는거다.
//		
//		if(inputNumber % 2 == 0) {    // 짝수판
//			 result = "짝수";
//		}else {     //홀수 판단
//			 result = "홀수";
//		}
//		
//		//-------------------------//
//		// 2020. 03. 31. ParkJW                 이렇게 이쁘게 만들어 주는게 나중에 협업하기도 좋다!! 나만보기 좋은건 나쁜코딩이다.
//		// 기능 : 결과보여주기
//		//-------------------------//
//		System.out.println("입력하신 숫자 " + inputNumber + "는 " + result + "입니다.");      // 이게 보기가 편합니다.. 순서는 result 를 입력 한 다음에 마지막에 이걸 작성했음
//		
//		
		//-------------Switch 식-----------------결과는 같고 이프문만 바꿔줄거임
		
		Scanner scanner = new Scanner(System.in);  // 시스템 인 뜻이.. 시스템이 지금 보이는 곳에서 입력해서 가져온다는거다.(syso 에 있는 out은 내가 화면(시스템)으로 내보내겠다는 뜻임)
		int inputNumber = 0;   // 사용자 입력
		String result = "";    // 처리 결과 저장소    -> 이걸  if else  압력 후에 다시 달아줬
		
		//  처리
		System.out.print("숫자를 입력하세요!");     // 아.. 바로 옆에 입력하게 시키려면ln을 뺴야한다.
		inputNumber = scanner.nextInt();    // scanner.nextInt(); 이걸 먼저 입력한 후에 위에 변수 int를 써주고서 inputNumber 를 달아주면 되는거다.
//		
//		if(inputNumber % 2 == 0) {    // 짝수판
//			 result = "짝수";
//		}else {     //홀수 판단
//			 result = "홀수";
//		}

		switch(inputNumber % 2) {            // 값을 2로 나눌거다
			case 0 :      // 콜론일 경우 브레이크를 만나야 끝난다. 안만나면 밑으로 쭉 흘러감 
				result = "짝수";           //스위치 문은 꼭!!! 브레이크를 달아둬야한다 -> 안쓰면 밑으로 쭉 흘러감...
				break;
			case 1 : 
				result = "홀수";
				break;
			default:
				break;
		}
		
		
		//-------------------------//
		// 2020. 03. 31. ParkJW                 이렇게 이쁘게 만들어 주는게 나중에 협업하기도 좋다!! 나만보기 좋은건 나쁜코딩이다.
		// 기능 : 결과보여주기
		//-------------------------//
		System.out.println("입력하신 숫자 " + inputNumber + "는 " + result + "입니다.");      // 이게 보기가 편합니다.. 순서는 result 를 입력 한 다음에 마지막에 이걸 작성했음
				
		
		// 이렇게 구분을 해둬야 커맨드 +f 써서 원하는 곳을 쉽게 찾을 수 있다
		
		// 코딩할떄 1번 Hardcording  - 정리없이 일단 실행여부 먼저
		// 2번 optimizing -> 남들도 보기 편하게 만들기 정리하기
		
	}

}
