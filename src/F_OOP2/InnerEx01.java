package F_OOP2;

public class InnerEx01 {
	//인스턴스 클래스	
	class InstanceInner{
		int iv = 100;
//		static int cv =200; // 사용불가
		final static int CONST = 200;
	}
	//스태틱 클래스
	static class StaticClass{
		static int cv = 500;
		int iv = 200;
	}

	void method(){
		//지역클래스
		class LocalClass{
			int iv = 200;
//			static int cv = 500;
		}
	}







}




















