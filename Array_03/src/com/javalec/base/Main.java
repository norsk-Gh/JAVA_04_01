package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열의 복사
		
		
		int [] array1 = {10, 20, 30, 40, 50};
		int [] array2 = array1;
		
			for(int i=0; i<array1.length; i++) {
				
				System.out.print("array1 : " + array1[i] + "   / \t");
				System.out.println("array2 : " + array2[i]);      // 여기까지는 1번배열을 2번으로 복사한거다! 밑에는 이제 2번을 바꿨을떄 한번 보려고함
				
							
			}
			
			array2[0] = 100;            //	Call by reference??
			array2[1] = 200;
			array2[2] = 300;
			array2[3] = 400;
			array2[4] = 500;

		
			for(int i=0; i<array1.length; i++) {
			System.out.print("array1 : " + array1[i] + "   / \t");
			System.out.println("array2 : " + array2[i]);      // 여기까지는 1번배열을 2번으로 복사한거다! 밑에는 이제 2번을 바꿨을떄 한번 보려고함
			}		
		
			
		int[] array3 = new int[array1.length];
//				array3 = array1;        //Call by reference  데이터의 위치을 준거다!
			
		
		for(int i=0; i<array1.length; i++) {    // Call by value   데이터의 값를 준거임.
			array3[i] = array1[i];
			
		}
		
		
				for(int i=0; i<array1.length; i++) {
					System.out.print("array1 : " + array1[i] + "   / \t");
					System.out.println("array3 : " + array3[i]);      // 3도 1과 같이 복사됐
				}		
			
			array3[0] = 10;	
			array3[1] = 20;	
			array3[2] = 30;	
			array3[3] = 40;	
			array3[4] = 50;	
				
			for(int i=0; i<array1.length; i++) {
				System.out.print("array1 : " + array1[i] + "   / \t");
				System.out.println("array3 : " + array3[i]);      // 이렇게 하면 array1~3 또 바꾼 값으로 다나
				
				
	}
	}
}
