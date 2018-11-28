package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. 스마트 티비 3대 저장하세요
		SmartTv[] tv = new SmartTv[3];
		tv[0] = new SmartTv();
		tv[1] = new SmartTv();
		tv[2] = new SmartTv();
		//2. ThreeDTv 2대 저장하세요
		ThreeDTv[] tv2 = new ThreeDTv[2];
		tv2[0] = new ThreeDTv();
		tv2[1] = new ThreeDTv();
		//3. AfreecaTv  4대 저장하세요
		AfreecaTv[] tv3 =  new AfreecaTv[4];
		tv3[0] = new AfreecaTv();
		tv3[1] = new AfreecaTv();
		tv3[2] = new AfreecaTv();
		tv3[3] = new AfreecaTv();
		
		Tv[] t = new Tv[9];
			// (Tv) = up캐스팅은 생략 가능
		t[0] = (Tv)new SmartTv(); 
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
						// (SmartTv) = down 캐스팅 생략 불가능
		SmartTv st4 = (SmartTv)t[2];
		
	}
}

class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){
		
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
		
	}
}

class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}





































