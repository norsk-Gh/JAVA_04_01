//-----< Exercise >-----//

//  Korean의 성적을 입력 : 
//  No1의 성적은 : 1
//  No2의 성적은 : 1
//  No3의 성적은 : 1
//  No4의 성적은 : 1
//  1English의 성적을 입력 : 
//  No1의 성적은 : 
//  No2의 성적은 : 1
//  No3의 성적은 : 1
//  No4의 성적은 : 1
//  Mathematics의 성적을 입력 : 
//  No1의 성적은 : 1
//  No2의 성적은 : 1
//  No3의 성적은 : 1
//  No4의 성적은 : 1
//	         Korean	   English	   Mathmatics	     Total	     Average
//  No1		   1		  1	        	1		       3	    	1
//  No2		   1		  1	        	1		       3	    	1
//  No3		   1		  1	        	1		       3	    	1
//  No4		   1		  1	        	1		       3	    	1

//--------------------//

package com.javalec.base;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
	String [] subject = {"Korean", "English", "Mathematics"};
	String [] studentID = {"No1", "No2", "No3", "No4"};
	int [] studentPoint = new int[studentID.length];
	int [] sumPoint = new int[studentID.length];
	int [] korPoint = new int[studentID.length];
	int [] engPoint = new int[studentID.length];
	int [] matPoint = new int[studentID.length];
		
	
	// 과목 입력시키기
	for (int i=0; i<=2; i++) {
	System.out.println(subject[i] + "의 성적을 입력 : ");
		
	// No1~4 성적 입력시키기
	for(int j=0; j<=3; j++) {
			System.out.print( studentID[j] + "의 성적은 : ");
			studentPoint[j] = scan.nextInt();
			sumPoint[j] += studentPoint[j];
		
			switch(i%3) {
				case 0 : korPoint[j] = studentPoint[j];
				case 1 : engPoint[j] = studentPoint[j];
				case 2 : matPoint[j] = studentPoint[j];
				default : 
			}
		}//for
	}//for
	
	//과목과 점수들 목차	
	System.out.println("\t   Korean"
					 + "\t   English"
					 + "\t   Mathmatics"
					 + "\t     Total"
					 + "\t     Average");	
	//점수 입력해주기
	for(int k=0; k<=3; k++)	{
		System.out.println(studentID[k] + "\t\t" 
						  + korPoint[k] + "\t\t"
						  + engPoint[k] + "\t\t" 
						  + matPoint[k] + "\t\t" 
						  + sumPoint[k] + "\t\t" 
						  + (sumPoint[k]/3));
	}//for
	
 }
}