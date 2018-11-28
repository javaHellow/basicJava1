package E_OOP;

public class TotalTest { //TotalTest  method area 에 클래스를 생성(로드)한다.	클래스를 생성하면 클래스 변수,클래스()친구들이 딸려들어온다. 보시다시피 클래스변수는 없고
						 // 클래스() 인 main()만 안에 로드해주면 된다.
	public static void main(String[] args) { // main()를 호출하였으니 c.s에 선언을 한다.

		TvMaker.color = "Blue"; // . 은 호출을 하는거며 TvMaker라는 클래스에서 호출을 해야하는데 TvMaker이 아직 로드가 안되었으니 method area에 로드를 하고  
								//  로드가 되면 클래스 변수 클래스()를 데리고 와야한다. "Blue"는 color는 인스턴스 변수이고 그 변수의 
								//  값이 문자열"Blue"라는 값을 담고있다 TvMaker라는 클래스가 담고있는 클래스 변수 
		
		TvMaker tm = new TvMaker(); // TvMaker 클래스에서 tm이라는변수명으로 객체를 생성해야한다. tm은 참조변수이며 tm을 콜스택에 있는 main()안에 선언을 해준다
									// new 는 인스턴스 화 를 해주는는 것이며 인스턴스를 해주면 heap tm의 주소가 생기고 인스턴스 변수 , 인스턴스()를 데리고 와야한다.
						
		tm.age = 30; // tm이라는 주소에서 age라는 인스턴스 변수를 호출하는것이며 agr 인스턴스 변수가 가지고있는 값은 30이다.
		// 3. 메서드 호출
		// 3.1 
		System.out.println(TvControll.channel); //syso 은 출력을 하라는 의미로 출력값을 써줘야하는것이다 channel 에 f3을 누르면 밑으로 내려가는데 해당하는 값은 15이다
		TvControll.volumeDown(); // TvControll 에서 volumeDown 을 호출을 하는것인데  TvControll 를 먼저 클래스 생성(로드)을 해주고 나서 클래스 변수 클래스()를 데리고 와야한다
								 
		System.out.println(TvControll.channel); //값 15

		// 3.2 TvControll 
		TvControll tc; //
		tc = new TvControll(); // tc
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		// Calc 이라는 클래스를 로드하고 cc라는 주소를 heap다 로드해준다 그러면서 인스턴스변수 인스턴스()를 같이 데려온다
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1.멤버(전역)변수		멤버(전역)변수는 메소드 밖에서만 존재하고 모든 영역에서 영향을 주지만  지역변수는 메소드 안에서만 영향을 준다
	//멤버변수가 가지고 있는값은 클래스변수 인스턴스 변수 이고 앞에 static 이 붙혀 있어야 한다. 
	//지역변수가 가지고 있는 값은 클래스() , 인스턴스() 이며 지역변수에 에서 찾는 값이 없을때는 class에서 가지고 올수있다.
					
	// 1.1 string 타입의 color라는 클래스 변수
	static String color;
	static int inch;
	// 1.2 int타입의 inch라는 클래스 변수
	String name = "";
	int age;

	// 2. TvMaker 메소드 (인스턴스 메소드)
	// 2.1 this()는 생성자 이며 ()안에 있는것은 인자값이며 생성자에서 다른 생성자를 부를때 사용된다
	TvMaker() {
		this("man", 25);
	}

	// 2.2 TvMaker 에 있는 매개 변수는 str , int 2개의 타입을 가지고 있으며  위에랑 비교하면 서로 같은 클래스명인데  사용되는걸 보면 오버로딩이 되었다는걸 알수있다.
	// 오버로딩의 생성 조건은(특징) 같은 이름명 이지만 매개변수의 인자값이 달라야 하고 하나라도 같으면 안되며 그리고 갯수 또한 달라야한다.
	TvMaker(String name, int age) {
		this.name = name;	// this . 은 지역변수와 전역변수를 구분할려고 쓰는것이며 지역변수가 전연변수보다 우선순위가 높다.
		this.age = age; 	// this . 은 쉽게 인스턴스에 라고 생각하면된다 
	}
}
//
class TvControll {//TvControll라는 클래스 이다
	final int MAX_VOLUME = 100; //인스턴스 변수
	final int MIN_VOLUME = 0;	//인스턴스변수
	static final int MAX_CHANNEL = 50; // 클래스 변수
	static final int MIN_CHANNEL = 1; // 클래스 변수

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume; // return 문은 말그대로 되돌아 간다 는 뜻을 가지고있으며 리턴 옆에 volume에 F3을 누르면 해당위치로 클릭이 되는데 volume 이 가지는 
					  // 값을 가지고 
	}
	// int타입의 클래스() 이다.
	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5. Calc 이라는 클래스 는 변수의 초기화이며 변수를 선언하고 처음으로 값을 저장하는 것을 '변수의 초기화'라고 한다. 
	// 명시적 초기화 , 생성자를() 이용한 초기화 , 초기화 블럭{} 을  가지고 
	int add(int a, int b) {
		return a + b;									// 3개 다 생성자를 이용한 초기화 이다 순서대로 내려가면서 값이 입력됨
	}													

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}