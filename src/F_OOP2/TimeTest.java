package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {	//vo 시간을 관리하기 위
		Time t = new Time();
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour);		//4
		t.setMinute(150);
		int Minute= t.getMinute();
		System.out.println(t.getHour()+" : "+Minute);		//6:30
		t.setSeconds(10000);
		int Seconds= t.getSeconds();
		System.out.println(t.getHour()+" : "+t.getMinute()+" : "+Seconds);		// 9 : 16 : 40
		
		
		
		
		
	}
}
//hint 메서드를 활용하세요
class Time{
	private int hour; //4
	private int minute;
	private int second;
	
	void setHour(int hour){
			this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
		setHour(this.hour+ minute/60);
		this.minute = minute%60;
	}
	
	int getMinute(){
		return minute;
	}
	
	
	void setSeconds(int second){
		setMinute(this.minute + second/60);
		this.second = second%60;
	}
	
	int getSeconds(){
		
		return second;
	}
	
	
	
	
	
}
