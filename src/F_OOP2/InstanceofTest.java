package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){ // 
			System.out.println("fc는 FireCard의 인스턴스이다");
			FireCar fc2 = fc;
		}
		
		if(fc instanceof Car){ // Fire car 는 Car에 들어있다
			System.out.println("fc는 Card의 인스턴스이다");
			Car c2 = fc;
		}
		
		if(fc instanceof Object){ 
			System.out.println("fc는Object의 인스턴스이다");
			Object o2 = fc;
		}
		
		Car c = new Car();
		if(c instanceof Car){ 
			System.out.println("c는 Car의 인스턴스이다");
			Car o2 = c;
		}
		if(c instanceof Object){ 
			System.out.println("c는 Object의 인스턴스이다");
			Object o2 = c;
		}
		if(c instanceof FireCar){ 
			System.out.println("c는 FireCar의 인스턴스이다");
			FireCar o2 = (FireCar)c;
		}
	}
}
