package C_sentence;

import java.util.Scanner;

import com.sun.xml.internal.stream.Entity.ScannedEntity;

public class Sentence_02 {
	public static void main(String[] args){
		/*
		1.	반복문 ( for, while, do-while )
			- 어떤 작업이 반복적으로 수행도도록 할때 사용된다.
			- 반복문은 주어진 조건이 만족되는 동안 수행함으로 조건식을 포함한다.
			- for문은 주로 반복횟수를 알고 있을때 while문은 반복횟수를 모를떄 사용된다.
			
		2.	for문
			-기본구조
			 for( 초기화0시작;조건식끝;증감식 ){
			 	3개의 조건식이 들어감 
			 }
			 초기 -> 조건식 -> 수행 -> 증감식 ->
			 	-> 조건식-> 수행 -> 증감식
		  
		*/
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);

		//초기화 : int i = 0; 
		//조건식 : i < 11
		//증감식 : i++
		//수행될 문장 : system.out.println(i);
		
		for(int i = 0; i<11; i++){
			System.out.println(i);
		}
		
		
		for(int i =1 ; i<11 ; i ++){
			if (i%2==1){
			System.out.println(i);
		}
	}	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		String str = sc.next();문자
//		System.out.println(str);		
//		int result = sc.nextInt();숫자
		
//		System.out.println(result);	
		
		//1. 사용자로 부터 숫자를 입력받아서 0~입력받은수까지 출력해주세요
		
//		for (int i=0; i < result+1; i++){
//			System.out.println(i);
//		}
		
		//1. 5~15까지의 합계를 구하세요
//		int sum= 0;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
//		sum += 11;
//		sum += 12;
//		sum += 13;
//		sum += 14;
//		sum += 15;
		
		
		for (int i = 5 ; i <  16;  i++){
//			sum += i;					
		}
//			System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int result = sc.nextInt();
		
			
		//2. 6~사용자가 입력한 수까지의 홀수의 합을 구하세요.
		int sum = 0;
		for (int i = 6 ; i < result + 1; i++){
				if(i%2==1)
					sum += i;
				System.out.println(sum);
			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
		
		
}