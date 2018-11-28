package A_variableBasic;

public class VariableTye {
	public static void main(String[] args) {
		 /*
		 변수의 타입
		 
		 1. 기본형타입(primitive type)
			- boolean, byte, char, short, int, float, long, double
			
		 2. 참조형타입(reference type)
			-주소를 저장한다. (4byte)
			
		 3. 종류
		  - 논리형 : true와 false만을 값으로 갖는다. 조건식과 논리적 계산에 많이 사용 ex)boolean
		  - 문자형 : 문자를 하나 저장하는데 사용된다.ex)char
		  - 정수형 : 정수값을 저장하는데 사용한다. ex) byte, short, int, long
		  - 실수형 : 실수값을 저장하는데 사용한다. ex) float, double
		  
		 4. 크기 (1byte = 8bit)
		 	- 1byte : boolean, byte
		 	- 2byte : char, short
		 	- 4byte : int, float
		 	- 8byte : long, double
		 	
		 5. 논리형 - boolean(기본값 false)
		 	- boolean형 변수는 true와 false중 하나의 값을 저장할수있다.
		 	- 대답 (YES,NO), 스위치(on/off)등의 논리구현에 주로 사용 한다.
		 	- 1byte의 크기를 가진다.
		 */
		
//		변수의 선언
//		[변수의 탑인] [변수형];
		// true의 값을 저장할수 있는 변수 power를 선언 및 초기화 해주세요
		boolean power = true;
		boolean off = false;
		/*
		6. 문자형 - char('\u0000')
		 - 문자 하나를  저장하는 용도로 사용된다.
		 - java는 Unicode문자 체계를 이용한다.
		 - 2byte의 크기를 가진다.
			
		*/
		// code라는 변수에 'A'를 저장해 주세요.
		char code = 'A';
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code);
		
		
		/*
		 7.정수형- byte, short, int, long(뒤에L)
		  - 기본자료형은 int형이다.
		  - 변수에 저장하고자 하는 정수값의 범위에 따라 4개중 하나를 선택해야 한다.
		  
		
		 */
		 // byte 타입의 변수 b1에 150d의 값을 저장해 주세요.
		 byte b1 = 127; //byte 는 최댓값이 127 
		 //  950831211111
		 long a1 = 950831211111L;
		 
		 /*
		  8. 실수형 - float,double(기본)
		  	- 실수형 값을 저장하는데 사용된다.
		  	- float: 1+8+23
		  	- double : 1+11+52

		  */
		  // 3.14159254863
		  double d1 =3.14159254863d;     
		  float f1 = 3.14159254863f;
		 
		
		  System.out.println(d1);
		  System.out.println(f1);
		  
		  
		  double d2 = 0.5;
		  float f2 = 0.5f;
		  
		  System.out.println(d2 == f2);
		  
		  /*
		  9.. 문자열 - String 무제한 길이에 제한이 없음
		  
		   
		   */
		  String str = "=============\n-------";
		  
		  System.out.println(str);
		  
		  /*
		  10. overflow 
		    - 자신이 표현할수 있는 값을 넘었을때 최소값으로 돌아가는 현상
		   
		   */
		  
		  byte b2 = 126;
		  System.out.println(b2); //126
		  b2++;
		  System.out.println(b2); //127
		  b2++;
		  System.out.println(b2); //-128
		  b2++;
		  System.out.println(b2); //-127
		  
		  /*
		  11. 형변환(casting)
		    - 기본형 간에는 서로 다른 타입으로 변환이 가능하다.
		    - byte -> short -> int -> long -> float -> double
		                    char=' '  
		   */
		   int a2 = 40000;
		   byte b3 = (byte) a2;
		   System.out.println(b3);
		   
		   int a3 = 65;
		   char c3 =(char) a3;
		   System.out.println(c3);
		   
		   char c4 = 'B';
		   int i4= c4;
		  
		   long aa = 180;
		   float ff = aa;
		   short gg = (short) aa;
		   
		   
		   /*
		   12. 문자의 결함

		    */
		   System.out.println(55 + 10);
		   System.out.println("하이"+55); // "하이" + "55" => 하이55
		   System.out.println("45" + 20);
		   System.out.println("56" + "32");
		   System.out.println(""+45);
		   System.out.println(true+"34");
		   System.out.println('T' +"G" +45);
		   System.out.println('A' +4+"44");
		   System.out.println('A' + 'B');
		   
		  
		
	}
}