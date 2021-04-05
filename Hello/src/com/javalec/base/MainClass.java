package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		// 한 프로젝트에는 하나의 메인 메소드가 있어야한다
		 
		
			//화면에 문자열 상수 출
			System.out.println("Hello, World!");
			System.out.println("Hello, World!");

			//한줄 다 붙어서 나
			System.out.print("--------");
			System.out.print("Hello, World!");
			System.out.print("--------");
			
			//한줄 띄고 싶을떄는 이거 쓰면 됩니
			System.out.println("");
			System.out.println(""); //두번 있으면 두줄이나 떨어진다
			
			// 화면에 정수(숫자) 상수 출력
			System.out.println(10);
			System.out.println(10+20);
			System.out.println(10*20); // 이건 곱셈
			System.out.println(10/20); // 이건 나누기
			// 이거 0으로 나오는 이유는 정수 출력이라서 안나오는 거라구, 정수가 아니기 떄문에 보이지 않는거
			
			System.out.println(10.0/20.0); // 위에거 나오게 하여면 이렇게 .0까지 찍어서 실수로 만들어야 0 밑에도 보이기 때문에 출력이 된다
			
			// 아주 중요한거!! 화면 출력과 메모를 이쁘게 해야합니다.			
			System.out.println("a " + "b");
			System.out.println(10 + "+" + 20 + "=" + (10+20));    // 이렇게 하는 경우도 있다구 +의 색이 다른걸 잘 생각해야한다(개발툴 이클립스가 있어서 +의 색이 다르게 보이는거임)
			System.out.println(10 + " + " + 20 + "=" + (10+20));
			System.out.println(10 + "*" + 20 + "=" + (10*20));
			System.out.println(10 + "/" + 20 + "=" + (10/20));
			System.out.println(10.0 + "/" + 20.0 + "=" + (10.0/20.0));
			System.out.println("한" + "글");   //한글 쓸떄는 입력 후 Caps Lock 이나 Enter 해줘야 한글자씩 안사라집니다
															
			
		
			
			/* <Command + /> 메모달기 기능
			 * <Command + Alt + 방향키> 밑으로 복사하기
			 * </ + * + Enter> 
			 * <Alt + 방향키> 줄 통채로 이동시키기
			 * <syso + Ctrl + Space> Sysyem.out.pr~~ 한번에 입력 가능(오타를 줄이기 위함)
			 * main + Ctrl + Space : 메인 Method를 다시 직접 입력할때 쓴
			 * Command + D : 한줄 삭
			 */
			
			
			
	}	

}
