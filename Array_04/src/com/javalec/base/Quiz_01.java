package com.javalec.base;

public class Quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tot = 1;
		
		for ( double i=0; i<=10; i++) {
			
			if(i == 0) {
				tot = tot;
			}
			if(i>0) {
				tot = tot*10;
			}
			
			
			// 결과 보여주기 // 
			System.out.println("10^" + String.format("%2.0f", i) + " = " + String.format("%13.0f", tot));
			
		}//for
		
		
		
		
		
		
	}//Main

}
