package Y_exam;

public class exam_04 {
	public static void main(String[] args) {
		/*
		[4-1] 다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		않을 때 true인 조건식
		7. boolean형 변수 powerOn가 false일 때 true인 조건식
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식

		 */
		//1
//		int x = 15;
//		System.out.println(10 < x&&x < 20);
		
		//2
//		char ch = 'x';
//		System.out.println!(ch == '' || ch == '\t');
		
		//3
		
		
		//4
//		System.out.println('0' <= ch&&ch <= '9');
		
		//5
//		System.out.println('A' <= ch&&ch < 'Z'|| 'a' <= ch&&ch <= 'z');
		
		//6
//		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 );
		//7
//		System.out.println(!powerOn);
		//8
//		System.out.println();
		
//		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		for (int i= 1 ; i < 21 ; i++){
//			if(!(i % 2 == 0 || i % 3 == 0)){
//			sum += i;
//				
//			}
//		}
//			System.out.println(sum);
		
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
//		int sum3 = 0;
//			for(int i = 1,j=10; i < 6; i ++, j--){
//				sum3 += i* j*2;
//			
//			}
//		System.out.println( sum3);
		
//		[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
//		int a = 0;
//		int sum = 0;
//		int b = 1; 
//		for(int i = 1 ; sum < 100 ; i++) { 
//			a = i*b ;
//			sum = sum + a;	
//			b = -b;
//		}
//		System.out.println(a);
			
//		[4-5] 다음의 for문을 while문으로 변경하시오.
//		for(int i=0; i<=10; i++) {
//		for(int j=0; j<=i; j++)
//		System.out.print("*");
//		System.out.println();
//		}
//		} // end of main
//		} // end of class	
		
//		int i1 = 0 ;	
//		while (i1 <= 10){
//			int j = 0;
//			while (j <= i1){
//				System.out.println(i1*j);
//				System.out.println(j);
//				j++;
//			}
//			i1++;
//		}
		
//		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.		
		
//		for(int i3 = 1 ; i3 <= 6 ; i3++){
//			for(int j2 = 1 ; j2<=6 ; j2++){
//				if(i3+j2==6) {
//					System.out.println(i3+"+"+j2+"="+(i3+j2));
//					System.out.println(j2+"+"+i3+"="+(j2+i3));
//				}
//			}
//		}
		
//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.	
//		int value = ( /* (1) */ );
//		System.out.println("value:"+value);
//		int value = (int)(Math.random()*6+1);
		
		
//		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는0<=x<=10, 0<=y<=10 이다.
		
//		int x2 = 0;
//		int sum2 = 0;
//		int y = 1;
//		for( x2 =0 ; x2 <10 ; x2++){
//			for(y = 0 ; y < 10 ; y++){
//					sum2 = 2*x2+4*y;
//					if(sum2==10){
//						System.out.println(x2+" "+y);
//					}
//			}
//		}		

//		[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
//		드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
//		어야 한다. (1)에 알맞은 코드를 넣으시오.
		
		
		
		
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i < str.length(); i++) {
//			sum += str.charAt(i)-'0';
//			
//		}
//		System.out.println("sum="+sum);

	
	
		
		
		
//		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
//		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//		에 알맞은 코드를 넣으시오.		
		
		
		for(int i = 0; i < 6 ; i++ ) {
			if(i%10==5){
				
			}
		}
		System.out.println();
		
		
		
//		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
//		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
//		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
//		시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		
		
		
//		[4-12] 구구단의 일부분을 다음과 같이 출력하시오.
		
//		
//				2*2=4 3*2=6 4*2=8
//				2*3=6 3*3=9 4*3=12
//				5*1=5 6*1=6 7*1=7
//				5*2=10 6*2=12 7*2=14
//				5*3=15 6*3=18 7*3=21
//				8*1=8 9*1=9
//				8*2=16 9*2=18
//				8*3=24 9*3=27
//			
		
		
		
//		[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
//		은 코드를 넣어서 프로그램을 완성하시오.
		
		
//		String value = "12o34";
//		char ch = ' ';2
//		boolean isNumber = true;
//		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
//		// 하나씩 읽어서 검사한다.
//		for(int i=0; i < value.length() ;i++) {
//			if()
//		
//		 
//		
//		}
//		if (isNumber) {
//		System.out.println(value+"는 숫자입니다.");
//		} else {
//		System.out.println(value+"는 숫자가 아닙니다.");
//		}
//		} 
//	}
//}
		
//		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
//		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
//		신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
//		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
//		로그램을 완성하시오.
		
	
//		    1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//			int answer = /* (1) */;
//			int input = 0; // 사용자입력을 저장할 공간
//			int count = 0; // 시도횟수를 세기위한 변수 
//			// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//			java.util.Scanner s = new java.util.Scanner(System.in);
//			do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//			/*
//			(2) 알맞은 코드를 넣어 완성하시오.
//			*/
//			} while(true); // 무한반복문
//			} // end of main
//			} // end of class HighLow
		
	}
}
		
		
		
		
		
