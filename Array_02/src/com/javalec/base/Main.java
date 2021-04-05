package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자에게서 5개의 입력값을 받고 그 평균값을 구하겠다! (보관도 할 수 있으며, 입력한 정보도 같이 출력해주기)  //
		
		
		//선언문
		int[] inputValue = new int[5];
		Scanner scan = new Scanner(System.in);
		int tot = 0;
		double avg = 0.0;         // .0 이하까지 나오니까 더블을 쓰는게 맞다!(1)
		
		
		
		// 사용자로부터 정보입력 받아서 배열에 넣기
		System.out.println("계산할 숫자" + inputValue.length + "개를 넣으세요 : ");
		
		for(int i=0; i<inputValue.length; i++) {     // 0부터 시작하는건 0번 번지수부터 있기때문에 .랭스는 길이 5보다 작게(0이 포함되어있으니까)
			inputValue[i] = scan.nextInt();
		}
		
//		for(int i=0; i<inputValue.length; i++) {     // 0부터 시작하는건 0번 번지수부터 있기때문에 .랭스는 길이 5보다 작게(0이 포함되어있으니까)
//			inputValue[i] = scan.nextInt();
//			tot += inputValue[i];
//		}    -> 결과적으로는 이게 합리적임! 합계랑 평균 다구할 수 있으니

		// 입력한 정보의 합계 구하기
		for(int i=0; i<inputValue.length; i++) {     // 0부터 시작하는건 0번 번지수부터 있기때문에 .랭스는 길이 5보다 작게(0이 포함되어있으니까)
			tot += inputValue[i];
		}
		
		// 입력한 정보의 평균 구하기
		avg = (double)tot / inputValue.length;       // 여기서 더블 붙여주는건 위에서는 인트였는데 여기서는 더블로 해야 맞으니까 (1)
		
		
		// 입력한 정보 출력하기
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		System.out.println("----------------------------");
		
		for(int i = 0; i<inputValue.length; i++) {
			System.out.println(inputValue[i] + "\t");
			
		}
		System.out.println();
		System.out.println("입력한 정보의 총합은" + tot);
		System.out.println("입력한 정보의 평균은" + String.format("%.2f", avg));  //-> %4.2f :전체 자리수는 4자리고 소수점은 2개까지 보여준다f는 이게 실수라는걸 보여준다.
																			 //   %.2f : 전체 자리수는 모르겠고 소수점만 2자리로 하겠다!
																			 //->"%10.2f"  -> 돈같은거 오른쪽으로 정렬하고싶다! 할떄 이런거 쓰면 됩니다. 근데 좀 많이 띄어짐
		
		//Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '4'
//		at java.base/java.util.Formatter.checkText(Formatter.java:2732)
//		at java.base/java.util.Formatter.parse(Formatter.java:2718)          -->> String.format("%4.2f" <---- 이렇게 썼는데 요놈이 문제일거야. 
//		at java.base/java.util.Formatter.format(Formatter.java:2655)         -->> 방금 이 오류가 떴는데! 이유는 입력값의 평균이 총합 4자리로 넣을 수 없기 때문에 그렇다! 아마 .2까지만 하면 해결될
//		at java.base/java.util.Formatter.format(Formatter.java:2609)
//		at java.base/java.lang.String.format(String.java:2897)
//		at com.javalec.base.Main.main(Main.java:50)

		
		
		
		
		System.out.println(inputValue[3]);   // 이거 입력했을때 방금 4번쨰로 입력한 값이 나왔음! 이유는 3번방은 0번방 포함해서 4번쨰에 있는거기 때문이지.
		
		
		
		// 여러가지 정보를 받아서 정리하겠다 -> 배열
		// for문으로 사용자 입력값 받았던 것은 사용자 입력값 자체는 보관하지 않고 합계만 보관했던(tot)것이다!
		
	}

}
