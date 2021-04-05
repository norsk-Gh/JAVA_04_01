package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 초기값이 없는 배열 선언 및 데이터 추가하기
		
//		String[] str = new String[7];     //-> str은 7개의 데이터를 가지게 된다는 뜻 / 선언할떄만 필요하고 앞으로는 str만 쓸거임
//		
//		str[0] = "일요일";
//		str[1] = "월요일";        //--> 아파트의 동호수라고 생각하면 된다!
//		str[2] = "화요일";
//		str[3] = "수요일";        // 사용자가 입력할떄는 이런식으
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";
		
		
		// 초기값이 있는 경우!
		String [] str = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};         //-> 랭스는 7!
		
		
		System.out.println(str);      //-> 기본적으로 암호화가 되어있다!
		System.out.println(str[0]);      //-> 이러면 일요일이 나오네!
		System.out.println(str[1] + "," + str[3] + "," + str[5]);      //-> 이러면 일요일이 나오네!
		
		for(int i = 0; i<str.length; i++) {         //-> 데이터는 6번까지 있는데 랭스는 7번까지임! 그래서 등호를 안쓰는거다.
			System.out.println(str[i]);
			
			
		}
		
//		for(int i = 0; i<=str.length; i++) {         //-> 이렇게 부등호가 들어가면 out of boundary 오류가 뜹니다.
//			System.out.println(str[i]);
		

		
		
	}

}
