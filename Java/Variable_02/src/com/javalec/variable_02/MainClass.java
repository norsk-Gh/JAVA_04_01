package com.javalec.variable_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "James";  //문자열       <-- 이 선언만 대문자로 나타내는데.. Class 형 객체라서 그렇다고 합니다.
		int num = 10;	   // 정수
		double numDouble = 20.2;   // double -> 실수로 변환
		char chr = 'a';      // 문자는 따옴표로 감싼다! / 한글자로 되어있는걸 의미한다.
		boolean bool = true;    // 이건 트루랑, 펄스를 쓸떄 쓴다! ( 오잉 그런데 트루에 따옴표? 안쓴다! 트루펄스만 안씀)
		
		
		//젤 위에는 선언하는 것들을 작
		
		
		System.out.println(str + ":" + num);
		System.out.println(num + num); // 문자열이 하나도 없으면 계산을 해버림!
		System.out.println((double)num + numDouble);    // 뒤에 실수면 앞에도 가능하면 실수로 맞춰주는게 에러를 줄이는데 좋음
		System.out.println(num + (int)numDouble);  // 정수출력  -> 소수점은 싹다 버리는 의미임!
		System.out.println(chr);   
		System.out.println(bool);
		
		// 나중에 int 로 선언했는데 오류가 났다? 그건 인트가 표현할 수 있는 수치를 넘어선 것이기떄문에... double고고쳐주면 좋다 / 예를들어 전세계 인구수 같은거!
		
		
	
		

	}

}
