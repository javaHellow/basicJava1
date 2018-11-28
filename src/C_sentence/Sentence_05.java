package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args){
		/*
		1.	while문
			-반복횟수를 모를때 사용한다.
			-조건식과 수행해야될 블럭{}으로 구성되어 있다.
			-while 문은 for문으로 변형이 가능함  for 문도 while문으로 가능
			-구조
			 while(조건식){
			 }
			
	
		*/
		
		int i =0;
		while( i < 11){
			System.out.println(i);
			i++;
		}
		
		//1. 3~33까지의 합계를 구하세요
		int sum = 0;
		int a =3;
		while(a < 34){
			sum += a;
			System.out.println(sum);
			a++;
		}
		
		int sum2 = 0;
		int a2 = 3;
		while(a2 < 34){
			if(a2 % 2 == 0){
				sum2 += a2;	
				System.out.println("하이"+sum2);
			}	
			a2++;		
		}
		
		//2.for문으로 구구단을 출력해주세요
//		for(int t = 2; t<10 ; t++)
//			for (int y=1; y<10 ; y++){
//				System.out.println(t+"*"+y+"="+t*y);
//			}
		
		//3.2번의 for문을 while문으로 변경해주세요
//		int t2 = 2;
//		while(t2 < 10){
//			int y2 = 1;
//			while(y2 < 10){
//				System.out.println(t2+"*"+y2+"="+t2*y2);
//				y2++;
//			}
//			t2++;
//		}
		
		//4.while문의 짝수단의 홀수단을 구하세요
//		int t3 = 2;
//		while(t3 < 10){
//			int y3 = 1;
//			while(y3 < 10){
//				if(t3%2==0 && y3%2==1){
//					System.out.println(t3+"*"+y3+"="+t2*y3);
//				}
//				y3++;
//			}
//			 t3++;
//		}	 
		
		
		//3. 1~? 더했을떄 합계가 100이상이 되는가?
		int aa = 0;
		int sum5 = 0;
		while(sum5 < 100){
			aa++;
			sum5 += aa;
		}
		System.out.println(aa);
		
		//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		//	 시작하는 숫자부터 끝나는 숫자중 5의 배수의 합계를 구하세요
		//	 단. while문을 이용하세요
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰숫자를 입력해주세요");
		int str = sc.nextInt();
		System.out.println("두번쨰숫자를 입력해주세요");
		int str1 = sc.nextInt();
		
		int sum1 = 0; //합계를 저장한 변수
		while(str < str1+1){
			if(str%5==0){
				sum1 += str;
			}
			str++;
		}
		
		System.out.println(sum1);
		
		
		
		
		
		
		
		
		
	   }
}