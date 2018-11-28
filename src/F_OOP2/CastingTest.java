package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		FireCar  fc = new FireCar();
		fc.water();
		
		Car c = fc; //up-casting
		c.drive();
		
		FireCar fc2 = (FireCar)c; // down-casting
		fc2.water();
		
		FireCar fc3 = (FireCar)new Car(); //문법상으로 오류는 없으나 출력시에는 "펑" 터짐 
					
	}
}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("순천으로 가자");
	}
	
	void stop(){
		System.out.println("주차중 띠리리리리리리리리 띠리리리");
	}
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌려");
	}
}

class Ambulance extends Car{
	void AED(){
		System.out.println("200줄 차지");
	}
}





















