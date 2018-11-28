package Y_exam;

public class exam_03 {
	public static void main(String[] args) {
		/*
		[3-1] 다음 연산의 결과를 적으시오.
		[ ] 연습문제 /ch3/Exercise3_1.java
		class Exercise3_1 {
		public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		
		System.out.println(1 + x << 33); 6	=> 1 + 2 << 33 =>   3 << 33 => 3은 int 4byte 33의
		System.out.println(y >= 5 || x < 0 && x > 2); true	=>	&&가 먼저 우선권이 있으니 x < 0 && x > 2 먼저 계산 false  
		y >= 5 || x true ||은 한쪽이라도 true 면 true이다
		System.out.println(y += 10 - x++);	13 => y +10 - x++ => 5 + 10 - 2++ => 13 왜냐하면 뒤에 있는 ++ 은 가장 나중에 계산
		System.out.println(x+=2);	5	=> x+2 = 5
		System.out.println( !('A' <= c && c <='Z') );'A' <= c true 이며 c <='Z' 또한 true 이다 하지만 앞에 !는 반대로 바꾸는 뜻을 가졌으며 그래서 답은 false
		System.out.println('C'-c);	2	=> 대문자'C'는 67 이며 c는 65 67-65 = 2 char라 int로 계산하여 C는 67값이 나옴
		System.out.println('5'-'0');	5 => ''는 char인데 둘다 ''가 들어가있으며 그렇게 될경우는 int로 계산되어 5가 나옴
		System.out.println(c+1);	66 = c= 65 = 65 +1  
		System.out.println(++c);	B c는 65의 값을 가지고 있으며 앞에 ++ 있으면 1증가 char 값 
		System.out.println(c++);	B c는 65의 값을 가지고 있으며 뒤에 ++ 있으면 1증가char 값 그치만 마지막으로 계산이 되는거라 다음에 적용됨
		System.out.println(c);	C c는 65의 값을 가지고있지만 뒤에 계산이 안된 1이 와서		66-> 66 -> 67
		
		
		[3-2]
		아래의 코드는 사과를 담는데 필요한 바구니(버켓) 의 수를 구하는 코드이다. 만일
		사과의 수가 123 개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요한 것이다.
		(1)에 알맞은 코드를 넣으시오.
		int numOfApples = 123;		//사과의 개수
		int sizeOfBucket = 10;		//바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (  (1) ); // 모든 사과를 담는데 필요한 바구니 수
		
		
	

		*/
		int numOfApples =	123;
		int sizeOfBucket = 10;
		int numOfBucket = (  numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket :  numOfApples / sizeOfBucket + 1);
		System.out.println(numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket :  numOfApples / sizeOfBucket + 1);
		System.out.println(numOfApples % sizeOfBucket != 0 ? numOfApples / sizeOfBucket +1  :  numOfApples / sizeOfBucket);
		System.out.println(numOfApples % sizeOfBucket == 0 ? 0 : 1);
				
		/*
		[3-3] 아래는 변수 의 값에 따라 num ‘양수 ’, ‘음수 ’, ‘0’ 양수 음수 을 출력하는 코드이다 삼항 연산 .
		자를 이용해서 에 알맞은 코드를 넣으시오 (1) .
		int num = 10;
		System.out.println(  (1)  );
							num > 0 ? "양수" : num == 0 ? "0" : "음수"
		또다른 답은  > == < 만 바꿔줘서 맞게 대입하면된다.
		*/
		int num = 10;
		System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수");
		
		/*
		[3-4] 아래는 변수 num의 값중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의
		값이 '456' 이라면 '400' 이 되고, '111'이라면 '100' 이 된다. ()에 알맞은 코드를 넣으시오.
	
		int num1 = 456;
		System.out.println();
		
		*/
		int num1 = 456;
		System.out.println(num1/100*100);
		
		
		
		/*
		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다 만일 변수 의 num
		의 값이 333이라면 331이 되고 777이라면 771이 된다 ()에 알맞은 코드를 넣으시오
		333에서 10을 나눈다고 가정하여 33.3 jaba는 int로 계산되기 떄문에 소수점을 사라지고 330으로 됨 거기서 +1
		
		*/
		int num2 = 333;
		System.out.println((num2/10)*10+1);
		
		/*
		[3-6] 아래의 변수배수에서 변 num의 값보다 크면서도 가장 가까운 10의 수 num의 값을
		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다
		19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 떄문에 변수 num의 값이 24라면
		6의 결과로 얻어야 한다. ()에 알맞은 코드를 넣으시오
		*/
		
		int num3 = 24;
		System.out.println((num3/10+1)*10-num3);
		
	
		
		
		
		/*
	    [3-7]
	      아래는 화씨(Fahrenhelt)를 섭씨(Celclus)로 변환하는 코드이다. 변환공식이
	    'C= 5/9 x(F - 32)' 라고 할때, ()에 알맞은 코드를 넣으시오. 단. 변환 
	      결과값은 소수점 셋쨰짜리라서 반올림 해야한다.(Mate.round()를 사용하지 않고 처리할 것)
	    
		int fahrenheit = 100;
		float celcius = ()
		
		
		*/
		int fahrenheit = 100;
		float celcius = ( (int)  ((float)5/9 *(fahrenheit-32) * 100 + 0.5) / 100f );
		System.out.println( (int)  ((float)5/9 *(fahrenheit-32) * 100 + 0.5) / 100f );

		System.out.println(celcius);
		
		/*
		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		byte a = 10;
		byte b = 20;
		byte c = a + b;
		char ch = 'A';
		ch = ch + 2;
		float f = 3 / 2;
		long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true
	
		 */
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d == f2;
		
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+!result);		
		
		/*
		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
		의 값이 true가 되도록 하는 코드이다. ()에 알맞은 코드를 넣으시오.
		
		char ch = 'z';
		boolean b = (  ()  );
		System.out.println(b);
		
		
		*/
		char ch1 = 'z';
				
		System.out.println('A'<=ch1 && ch1 <= 'Z' || 'a' <= ch1 && ch1 <= 'z' || '0' <= ch1 && ch1 <= '9');
		
		
		
		/*
		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
		들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		
		char ch = 'A';
		char lowerCase = (  ()  ) ? (  ()  ) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		*/
		char ch4 = 'A';
		char lowercase = 'A'<= ch4&&ch4 <='Z' ? (char)(ch4+32) : ch4;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
