package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		//클래스변수 호출방법
		//클래스명.변수명
		String color = Tv.color;
		System.out.println(color);
		Tv.color = "MAGENTA";
		System.out.println(Tv.color);
		
		Tv.changeColor();
		System.out.println(Tv.color);
		
		//Tv클래스의 인스턴스생성
		Tv t = new Tv(); //tv타입의 참조변수 t// main()의 지역변수
		
		//참조변수명.변수명
		
		//1. t주소의 power를 출력해주세요
		System.out.println(t.power);
		//2. t주소의 power메서드를 호출해주세요
		t.power();
		//3. t주소의 power를 출력해주세요
		System.out.println(t.power);
		//4. t주소의 채널을 16번으로 변경해주세요
		t.channel=16;
		//5. t주소의 channelUp메서드를 호출해주세요
		t.channelUp();
		//6. t주소의 채널을 출력해주세요
		System.out.println(t.channel);
		
	}
}


class Tv{
	//전역변수
	//클래스변수
	static String color;
	//인스턴스 변수
	boolean power; // 전원을 관리
	int channel;	// 채널을 관리	
	
	//클래스 메서드
	static void changeColor(){
		color = "green";
		
	}
	
	//인스터스메서드
	void channelUp(){
		channel++;
	}
	//인스터스메서드
	void power(){
		power = !power;
	}
	
}
