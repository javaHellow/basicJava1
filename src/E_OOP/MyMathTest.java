package E_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath.add(); //클래스 메서드 호출
		
		MyMath b = new MyMath();
		b.add2(10); //인자값   int형이니 int 값을 줘야함 // .은 호출( 어디어디로 들어간다) b참조변수가 add2의 메서드를 호출한다 값이 아니라 주소를 저장하는 변수가 참조변수
		
		
		MyMath.add3(10,2f );
		
		b.add4(10, 10, 'e');
		
		int result = b.sum(10,5);
		System.out.println(result);
		
		
		int result2 = MyMath.add5(7);
		System.out.println(result2);
		
		int result3 = b.add6(15,5);
		System.out.println(result3);
		
		
		long result4 = (b.multiply(30000,30000));
		System.out.println(result4);
		
		float result5 = b.divide(7,8);
		System.out.println(result5);
		
	}
}


class MyMath{
	
	static int number = 50;
	
	static void add(){
		System.out.println(number * 2 );
		
		
	}
	void add2(int a){ // 매개변수 (인자값을 저장할수 있는곳)
		System.out.println(number*a); //
	}
	
	static void add3(int a , float c){
		System.out.println(a*c);
		return;
	}
	void add4(int c, int d, char e){
		System.out.println(c+d+e);
	}
	
	
		
	//클래스메서드명은 add5
	//매개변수는 int 하나
	//수행내용 매개변수와 number의 합을 반환
	
	static int add5(int a){
		int result = a + number;
		
		return result;
	}
	
	
	
	//메서드명 add7
	//매개변수는 int 2개
	//앞에 받은 값에서 뒤에 받은 값 더한결과를 반환하는  메서드를 만드세요
	int sum(int b, int c){ //+
		int result = b + c;
		return result;
	}
	
	
	//메서드명 add6
	//매개변서 int 두개
	//앞에 받은 값에서 뒤에 받은 값 뺸 결과를 반환하는  메서드를 만드세요
	
	int add6(int b , int c){ // -
		int result = b - c;
		return result;
	}
	//multiply
	// int 값 두개
	// 두개의 수를 곱해서 반환해주세요
	// 단.overflow고려해주세요
	
	long multiply(int b, int c){ // *
		long result = (long)b*c;
		return result;
	}
	
	//인스턴스 매서드 divide
	//int 값 두개
	// 앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	// 단. 소숫짐 셋째자리에서 반올림하여 두번쨰 자리까지 표현해주세요
	
	float divide(int b , int c){ // 나누기 반올림
		float result =  (int)(b /(float) c*100+0.5f) /100f;
		return result;
	}
	
	
	
	
}