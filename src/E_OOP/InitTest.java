package E_OOP;

public class InitTest {
	public static void main(String[] args) {
		System.out.println(Init.action);//0 => 55
									    // 명시적 초기화 => 클래스초기화 블럭		
		Init it = new Init(); // 15 => 20
							  // 명시적초기화 => 인스턴스 초기화 블럭 => 생성자를 이용한 초기화
		System.out.println(it.action2); //20
		System.out.println(it.action3);
		
		

	}
}

class Init{
	
	static int action;
	int action2 = 15; // 명시적 초기화
	int action3; //명시적 초기화
	
	Init(){
		action2 = 20; // 기본생성자													//순서대로
	}																			//내려감
	static {		  // 클래스 초기화블럭
//		많은 수식
		action = 55;
		
	}
	{
		//많은 수식
		action2 = 100;
	}
}